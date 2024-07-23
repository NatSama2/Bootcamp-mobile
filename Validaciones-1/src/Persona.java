public class Persona implements  SerHumano {


   // atributos
   private  String nombre;
   private int edad;
   private String correo;
   private String telefono;


// get and set

// Getters y Setters
public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public int getEdad() {
            return edad;
        }
    
        public void setEdad(int edad) {
            this.edad = edad;
        }
    
        public String getCorreo() {
            return correo;
        }
    
        public void setCorreo(String correo) {
            this.correo = correo;
        }
    
        public String getTelefono() {
            return telefono;
        }
    
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

    @Override
    public void respirar() {
        System.out.println("Estoy respirando");
    }

    @Override
    public void comer() {
            System.out.println("Estoy Comiendo");
    }

    @Override
    public void asistirClases() {
            System.out.println("Estoy En clases Java");
    }






}
