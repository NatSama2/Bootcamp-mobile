// Clase Trabajador
public class Trabajador {
  private String nombres;
  private String apellidos;
  private String run;
  private String telefono;
  private int edad;

  // Constructor
  public Trabajador(String nombres, String apellidos, String run, String telefono, int edad) {
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.run = run;
    this.telefono = telefono;
    this.edad = edad;
  }

  // Getters y Setters
  // Para brevedad, solo se muestra un getter y setter de ejemplo
  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  // Método mostrarDatos
  public void mostrarDatos() {
    System.out.println("Teléfono: " + telefono);
    System.out.println("Edad: " + edad);
  }

  // Método toString para mostrar información general del trabajador
  @Override
  public String toString() {
    return "Trabajador{" +
        "nombres='" + nombres + '\'' +
        ", apellidos='" + apellidos + '\'' +
        ", run='" + run + '\'' +
        ", telefono='" + telefono + '\'' +
        ", edad=" + edad +
        '}';
  }
}