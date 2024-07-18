public class Administrativo  extends   Usuario{


    private String area;
    private String exp;

    public Administrativo(String area, String exp, String nombre, String rut) {
        super(nombre, rut);
        this.area = area;
        this.exp = exp;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

      public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getRut() {
            return rut;
        }
    
        public void setRut(String rut) {
            this.rut = rut;
        }
   
       public String mostrarAdministrativo(){

            return  "Datos del Administrativo " +super.analizarUsuario()+" "+area+ " "+exp;
       }











    
}
