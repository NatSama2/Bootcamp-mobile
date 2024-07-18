// Clase TrabajadorEventual que extiende de Trabajador
public class TrabajadorEventual extends Trabajador {
  private boolean disponibilidad;
  private String correoElectronico;

  // Constructor
  public TrabajadorEventual(String nombres, String apellidos, String run, String telefono, int edad,
      boolean disponibilidad, String correoElectronico) {
    super(nombres, apellidos, run, telefono, edad);
    this.disponibilidad = disponibilidad;
    this.correoElectronico = correoElectronico;
  }

  // Getters y Setters
  // Para brevedad, solo se muestra un getter y setter de ejemplo
  public boolean isDisponibilidad() {
    return disponibilidad;
  }

  public void setDisponibilidad(boolean disponibilidad) {
    this.disponibilidad = disponibilidad;
  }

  // Método mostrarDatos específico para TrabajadorEventual
  @Override
  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Disponibilidad: " + disponibilidad);
    System.out.println("Correo Electrónico: " + correoElectronico);
  }

  // Método toString para mostrar información general del trabajador eventual
  @Override
  public String toString() {
    return "TrabajadorEventual{" +
        "disponibilidad=" + disponibilidad +
        ", correoElectronico='" + correoElectronico + '\'' +
        "} " + super.toString();
  }
}