// Clase TrabajadorContratado que extiende de Trabajador
public class TrabajadorContratado extends Trabajador {
  private String fechaIngreso;
  private double salarioMensual;

  // Constructor
  public TrabajadorContratado(String nombres, String apellidos, String run, String telefono, int edad,
      String fechaIngreso, double salarioMensual) {
    super(nombres, apellidos, run, telefono, edad);
    this.fechaIngreso = fechaIngreso;
    this.salarioMensual = salarioMensual;
  }

  // Getters y Setters
  // Para brevedad, solo se muestra un getter y setter de ejemplo
  public String getFechaIngreso() {
    return fechaIngreso;
  }

  public void setFechaIngreso(String fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  // Método mostrarDatos específico para TrabajadorContratado
  @Override
  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Fecha de Ingreso: " + fechaIngreso);
    System.out.println("Salario Mensual: " + salarioMensual);
  }

  // Método toString para mostrar información general del trabajador contratado
  @Override
  public String toString() {
    return "TrabajadorContratado{" +
        "fechaIngreso='" + fechaIngreso + '\'' +
        ", salarioMensual=" + salarioMensual +
        "} " + super.toString();
  }
}