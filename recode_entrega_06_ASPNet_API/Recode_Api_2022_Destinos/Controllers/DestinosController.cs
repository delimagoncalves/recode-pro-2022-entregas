using System.Collections.Generic;
using System.Linq;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Recode_Api_2022.Models;

namespace Recode_Api_2022.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class DestinosController : ControllerBase
    {
        private readonly DestinoDbContext _context;

        public DestinosController(DestinoDbContext context)
        {
            _context = context;
        }

        // GET: api/Cursos - LISTA TODOS OS DESTINOS
        [HttpGet]
        public IEnumerable<Destino> GetDestinos()
        {
            return _context.Destinos;
        }

        // GET: api/Cursos/id - LISTA DESTINO POR ID
        [HttpGet("{id}")]
        public IActionResult GetDestinosPorId(int id)
        {            
            Destino destino = _context.Destinos.SingleOrDefault(modelo => modelo.DestinoId == id);
            if (destino == null)
            {
                return NotFound();
            }
            return new ObjectResult(destino);
        }

        // CRIA UM NOVO DESTINO
        [HttpPost]
        public IActionResult CriarCurso(Destino item)
        {
            if (item == null)
            {
                return BadRequest();
            }

            _context.Destinos.Add(item);
            _context.SaveChanges();
            return new ObjectResult(item);
      
        }

        // ATUALIZA UM DESTINO EXISTENTE
        [HttpPut("{id}")]
        public IActionResult AtualizaCurso(int id, Destino item)
        {
            if (id != item.DestinoId)
            {
                return BadRequest();
            }
            _context.Entry(item).State = EntityState.Modified;    
            _context.SaveChanges();

            return new NoContentResult();
        }

        // APAGA UM DESTINO POR ID
        [HttpDelete("{id}")]
        public IActionResult DeletaCurso(int id)
        {
            var destino = _context.Destinos.SingleOrDefault(m => m.DestinoId == id);         

            if (destino == null)
            {
                return BadRequest();
            }

            _context.Destinos.Remove(destino);
            _context.SaveChanges();
            return Ok(destino);      
        }

    }
}

