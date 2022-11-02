using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Recode_Api_2022.Models
{

    [Table("Destino")]
    public class Destino
    {
        [Key]
        public int DestinoId { get; set; }

        [Required(ErrorMessage = "Informe a cidade")]
        [StringLength(20)]
        public string Cidade { get; set; }
   
        [Required(ErrorMessage = "Informe o estado")]
        [StringLength(20)]
        public string Estado { get; set; }

        [Required(ErrorMessage = "Informe a descrição")]
        [StringLength(50)]
        public string Descricao { get; set; }

    }
}
