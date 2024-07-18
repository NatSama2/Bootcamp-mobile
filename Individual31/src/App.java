import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ingresar datos para Trabajador Honorario
    System.out.println("Ingrese los datos del Trabajador Honorario:");
    System.out.print("Nombres: ");
    String nombres = scanner.nextLine();
    System.out.print("Apellidos: ");
    String apellidos = scanner.nextLine();
    System.out.print("RUN: ");
    String run = scanner.nextLine();
    System.out.print("Teléfono: ");
    String telefono = scanner.nextLine();
    System.out.print("Edad: ");
    int edad = scanner.nextInt();
    scanner.nextLine(); // Consumir nueva línea
    System.out.print("Giro: ");
    String giro = scanner.nextLine();
    System.out.print("Año de Iniciación: ");
    int anioIniciacion = scanner.nextInt();
    scanner.nextLine(); // Consumir nueva línea

    TrabajadorHonorario honorario = new TrabajadorHonorario(nombres, apellidos, run, telefono, edad, giro,
        anioIniciacion);

    // Ingresar datos para Trabajador Contratado
    System.out.println("\nIngrese los datos del Trabajador Contratado:");
    System.out.print("Nombres: ");
    nombres = scanner.nextLine();
    System.out.print("Apellidos: ");
    apellidos = scanner.nextLine();
    System.out.print("RUN: ");
    run = scanner.nextLine();
    System.out.print("Teléfono: ");
    telefono = scanner.nextLine();
    System.out.print("Edad: ");
    edad = scanner.nextInt();
    scanner.nextLine(); // Consumir nueva línea
    System.out.print("Fecha de Ingreso: ");
    String fechaIngreso = scanner.nextLine();
    System.out.print("Salario Mensual: ");
    double salarioMensual = scanner.nextDouble();
    scanner.nextLine(); // Consumir nueva línea

    TrabajadorContratado contratado = new TrabajadorContratado(nombres, apellidos, run, telefono, edad, fechaIngreso,
        salarioMensual);

    // Ingresar datos para Trabajador Eventual
    System.out.println("\nIngrese los datos del Trabajador Eventual:");
    System.out.print("Nombres: ");
    nombres = scanner.nextLine();
    System.out.print("Apellidos: ");
    apellidos = scanner.nextLine();
    System.out.print("RUN: ");
    run = scanner.nextLine();
    System.out.print("Teléfono: ");
    telefono = scanner.nextLine();
    System.out.print("Edad: ");
    edad = scanner.nextInt();
    scanner.nextLine(); // Consumir nueva línea
    System.out.print("Disponibilidad (true/false): ");
    boolean disponibilidad = scanner.nextBoolean();
    scanner.nextLine(); // Consumir nueva línea
    System.out.print("Correo Electrónico: ");
    String correoElectronico = scanner.nextLine();

    TrabajadorEventual eventual = new TrabajadorEventual(nombres, apellidos, run, telefono, edad, disponibilidad,
        correoElectronico);

    // Mostrar datos de los trabajadores
    System.out.println("\nDatos del Trabajador Honorario:");
    honorario.mostrarDatos();
    System.out.println(honorario);

    System.out.println("\nDatos del Trabajador Contratado:");
    contratado.mostrarDatos();
    System.out.println(contratado);

    System.out.println("\nDatos del Trabajador Eventual:");
    eventual.mostrarDatos();
    System.out.println(eventual);

    scanner.close();
  }
}