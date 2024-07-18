public class Estudiante  extends Persona implements  Vivir {


            private String carrera;
            private int id;

    public Estudiante() {
    }

    public Estudiante(int edad,String nombre, String carrera, int id) {
        
          super( edad,nombre);
          this.carrera = carrera;
          this.id = id;
    
    }

       





    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void respirar() {
        System.out.println("estoy respirando");
    }

    @Override
    public void vivir() {
            System.out.println("estoy viviendo");
    }

    @Override
    public void caminar() {
            System.out.println("estoy caminando");
    }




}
