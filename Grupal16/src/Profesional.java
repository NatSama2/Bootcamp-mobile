

public class Profesional extends Usuario {

    private String titulo;
    private String fechaIngreso;

    public Profesional(String fechaIngreso, String titulo, String nombre, String rut) {
        super(nombre, rut);
        this.fechaIngreso = fechaIngreso;
        this.titulo = titulo;
    }

    public void mostrarProfesional() {

        System.out.println("Datos del profesional " + super.analizarUsuario() + " " + titulo + " " + fechaIngreso);
    }



}
