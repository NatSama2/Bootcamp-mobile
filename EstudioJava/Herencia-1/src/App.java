public class App {
    public static void main(String[] args) throws Exception {

        Persona p = new Persona();
        p.setNombre("Don gato");
        p.setEdad(40);
        


        Estudiante  e = new Estudiante();

        e.setNombre("Juan josé");
        e.setEdad(15);
        e.setId(25);
        e.setCarrera("APP MOVILES");
        e.caminar();
        e.vivir();

         
     
        Profesor pro = new Profesor();

        pro.setNombre("Don gato"); 
        pro.setEdad(50);
        pro.setMateria("base de datos");
        pro.setCargo("Jefe de curso");







    }
}
