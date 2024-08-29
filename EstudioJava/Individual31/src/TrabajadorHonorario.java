// Clase TrabajadorHonorario que extiende de Trabajador
public class TrabajadorHonorario extends Trabajador {
  private String giro;
  private int anioIniciacion;

  // Constructor
  public TrabajadorHonorario(String nombres, String apellidos, String run, String telefono, int edad,
      String giro, int anioIniciacion) {
    super(nombres, apellidos, run, telefono, edad);
    this.giro = giro;
    this.anioIniciacion = anioIniciacion;
  }

  // Getters y Setters
  // Para brevedad, solo se muestra un getter y setter de ejemplo
  public String getGiro() {
    return giro;
  }

  public void setGiro(String giro) {
    this.giro = giro;
  }

  // Método mostrarDatos específico para TrabajadorHonorario
  @Override
  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Giro: " + giro);
    System.out.println("Año de Iniciación: " + anioIniciacion);
  }

  // Método toString para mostrar información general del trabajador honorario
  @Override
  public String toString() {
    return "TrabajadorHonorario{" +
        "giro='" + giro + '\'' +
        ", anioIniciacion=" + anioIniciacion +
        "} " + super.toString();
  }
}