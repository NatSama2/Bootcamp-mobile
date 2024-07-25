public class EjercicioIndividual25 {

    // Atributos de la clase
    private String nombres;
    private String apellidos;
    private String run; // Ejemplo: 12345678-9
    private String telefono;
    private int edad;

    // Constructor por defecto
    public EjercicioIndividual25() {
        this.nombres = "";
        this.apellidos = "";
        this.run = "";
        this.telefono = "";
        this.edad = 0;
    }

    // Constructor con parámetros
    public EjercicioIndividual25(String nombres, String apellidos, String run, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.run = run;
        this.telefono = telefono;
        this.edad = edad;
    }

    // Método toString para representar la información del trabajador como cadena de texto
    @Override
    public String toString() {
        return "Trabajador{" +
                "Nombres='" + nombres + '\'' +
                ", Apellidos='" + apellidos + '\'' +
                ", RUN='" + run + '\'' +
                ", Teléfono='" + telefono + '\'' +
                ", Edad=" + edad +
                '}';
    }

    // Método para obtener el nombre completo del trabajador
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

    // Método para descomponer el RUN y obtener el número antes del guion
    public int descomponerRun() {
        // Separamos el RUN usando el guion como delimitador
        String[] partes = run.split("-");
        // Convertimos la parte numérica a un entero y la retornamos
        return Integer.parseInt(partes[0]);
    }

    // Getters y Setters para los atributos
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}