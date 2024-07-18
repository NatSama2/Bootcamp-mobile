
public class Usuario implements Asesoria {

    protected  String nombre;
    protected  String rut;

    public Usuario(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    @Override
    public String analizarUsuario() {

        return this.nombre + " " + this.rut;
    }

}
