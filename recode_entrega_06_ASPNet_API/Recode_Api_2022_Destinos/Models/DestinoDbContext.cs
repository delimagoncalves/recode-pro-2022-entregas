using Microsoft.EntityFrameworkCore;

namespace Recode_Api_2022.Models
{
    public class DestinoDbContext: DbContext
    {
        public DestinoDbContext(DbContextOptions<DestinoDbContext> options)
          : base(options)
        { }
        public DbSet<Destino> Destinos { get; set; }

    }
}


