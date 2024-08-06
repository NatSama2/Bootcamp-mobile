package com.sprint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static final String CYAN_COLOR = "\033[0;36m";
  public static final String GREEN_BOLD = "\033[1;32m";
  public static final String RED_BOLD = "\033[1;31m";
  public static final String YELLOW_BOLD = "\033[1;33m";
  public static final String RESET_COLOR = "\u001B[0m";

  private static Random random = new Random();

  // metodo para un numero random
  private static int identificadorRandom(int min, int max) {
    return random.nextInt(max - min + 1) + min;
  }

  public static void main(String[] args) {

    // regex para dia, hora
    String regexHora = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$";

    Contenedor contenedor = new Contenedor();
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setLenient(false); // para evitar fechas invalidas

    // Menú principal
    int opcion;

    // ciclo do while para mostrar el menu
    do {
      System.out.println(YELLOW_BOLD + """
          |1| Guardar usuario
          |2| Guardar cliente
          |3| Guardar Profesional
          |4| Guardar Administrativo
          |5| Guardar Capacitacion
          |6| Eliminar Usuario
          |7| Listar Usuarios
          |8| Listar Usuarios por Tipo
          |9| Listar Capacitaciones
          |10| Salir
          """ + RESET_COLOR);
      opcion = sc.nextInt();
      sc.nextLine(); // Limpiar el buffer

      switch (opcion) {
        case 1:
          // Guardar un Usuario
          System.out.println(GREEN_BOLD + """

              ************************************
              *      Registro de Usuarios        *
              ************************************
              """ + RESET_COLOR);

          System.out.println("ingrese nombre (min 10 - max 50 caracteres): ");
          String nombreUsuario = sc.nextLine();

          while (nombreUsuario.length() < 10 && nombreUsuario.length() > 50 && nombreUsuario.matches("[a-zA-Z ]+")) {
            System.out.println("Nombre no valido, ingrese un nombre: ");
            nombreUsuario = sc.nextLine();
          }
          System.out.println("Nombre de usuario registrado: " + nombreUsuario);
          System.out.println("----------------------------------------");

          // ingreso fecha de nacimiento
          while (true) {
            System.out.println("Ingrese fecha de nacimiento (dd/mm/yyyy): ");
            String fecha = sc.nextLine();
            try {
              Date fechaUsuario = sdf.parse(fecha);
              System.out.println("Fecha de nacimiento registrada: " + fechaUsuario);
              break;
            } catch (ParseException e) {
              System.out.println("Formato de la fecha invalido, use (dd/mm/yyyy)");
            }
          }

          System.out.println("Ingrese Run: ");
          int runCliente = sc.nextInt();
          while (runCliente <= 7000000 || runCliente > 99999999) {
            System.out.println("Rut no valido, ingrese un Rut: ");
            runCliente = sc.nextInt();
          }
          System.out.println("Rut registrado: " + runCliente);
          System.out.println("----------------------------------------");
          sc.nextLine(); // Consume la nueva línea restante

          break;
        case 2:
          // Guardar un cliente
          System.out.println(GREEN_BOLD + """

              ************************************
              *      Registro de Clientes        *
              ************************************
              """ + RESET_COLOR);
          System.out.println("Ingrese Rut: ");
          int rutCliente = sc.nextInt();
          while (rutCliente <= 7000000 || rutCliente > 99999999) {
            System.out.println("Rut no valido, ingrese un Rut: ");
            rutCliente = sc.nextInt();
          }
          System.out.println("Rut registrado: " + rutCliente);
          System.out.println("----------------------------------------");

          // Limpiar el buffer del scanner
          sc.nextLine(); // Consume la nueva línea restante

          // Ingreso y validación del nombre
          while (true) {
            System.out.println("Ingrese nombres (min 5 - max 30 caracteres): ");
            String nombreCliente = sc.nextLine();
            if (nombreCliente.length() >= 5 && nombreCliente.length() <= 30 && nombreCliente.matches("[a-zA-Z ]+")) {
              System.out.println("Nombre registrado: " + nombreCliente);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("El nombre debe tener entre 5 y 30 caracteres, solo letras y un espacio");
            }
          }

          while (true) {
            System.out.println("Ingrese apellidos (min 5 - max 30 caracteres): ");
            String apellidoCliente = sc.nextLine();
            if (apellidoCliente.length() >= 5 && apellidoCliente.length() <= 30
                && apellidoCliente.matches("[a-zA-Z ]+")) {
              System.out.println("apellidos registrados: " + apellidoCliente);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("El apellido debe tener entre 5 y 30 caracteres, solo letras y un espacio");
            }
          }

          while (true) {
            System.out.println("Ingrese telefono (min 8 - max 9 numeros): ");
            String telefonoCliente = sc.nextLine();
            if (telefonoCliente.length() >= 8 && telefonoCliente.length() <= 9
                && telefonoCliente.matches("^[0-9]{8,9}$")) {
              System.out.println("Telefono registrado: " + telefonoCliente);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("El telefono debe ser solo numeros y tener entre 8 y 9 caracteres");
            }
          }

          while (true) {
            System.out.println("Ingrese AFP (min 3 - max 30 caracteres): ");
            String afpCliente = sc.nextLine();
            if (afpCliente.length() >= 3 && afpCliente.length() <= 30 && afpCliente.matches("[a-zA-Z ]+")) {
              System.out.println("Telefono registrado: " + afpCliente);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("El AFP debe estar entre 3 y 30 caracteres y ser solo letras");
            }
          }

          while (true) {
            System.out.println("Ingrese Sistema de Salud (1 Fonasa - 2 Isapre): ");
            try {
              int sistemaSaludCliente = sc.nextInt();
              sc.nextLine();
              if (sistemaSaludCliente == 1) {
                System.out.println("Sistema de salud registrado: Fonasa");
                System.out.println("----------------------------------------");
                break;
              } else if (sistemaSaludCliente == 2) {
                System.out.println("Sistema de salud registrado: Isapre");
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("El Sistema de salud debe estar entre 1 y 2 y ser solo numeros");
              }
            } catch (InputMismatchException e) {
              System.out.println("Error de entrada del dato...");
              sc.next();
            }
          }

          while (true) {
            System.out.println("Ingrese Direccion (max 70 caracteres): ");
            String direccionCliente = sc.nextLine();
            if (direccionCliente.length() <= 70 && direccionCliente.matches("^[a-zA-Z0-9 ]+$")) {
              System.out.println("Direccion registrada: " + direccionCliente);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("La direccion tiene un max de 70 caracteres y espacios");
            }
          }
          while (true) {
            System.out.println("Ingrese Comuna (max 50 caracteres): ");
            String comunaCliente = sc.nextLine();
            if (comunaCliente.length() <= 50 && comunaCliente.matches("^[a-zA-Z0-9 ]+$")) {
              System.out.println("Comuna registrada: " + comunaCliente);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("La comuna tiene un max de 50 caracteres y espacios");
            }
          }
          break;

        case 3:
          // Guardar un profesional
          System.out.println(GREEN_BOLD + """

              ************************************
              *    Registro de Profesionales     *
              ************************************
              """ + RESET_COLOR);
          // ingreso nombre del titulo profesional
          while (true) {
            System.out.println("Ingrese su titulo profesional: (min 10 - max 50 caracteres)");
            String tituloProfesional = sc.nextLine();
            if (tituloProfesional.length() <= 50 && tituloProfesional.matches("^[a-zA-Z ]+")) {
              System.out.println("titulo registrado: " + tituloProfesional);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("El titulo tiene un max de 50 caracteres y espacios");
            }
          }
          // ingreso de la fecha de ingreso
          while (true) {
            System.out.println("Ingrese fecha de ingreso (dd/mm/yyyy): ");
            String fecha = sc.nextLine();
            try {
              Date fechaIngresoProfesional = sdf.parse(fecha);
              System.out.println("Fecha de ingreso registrada: " + fechaIngresoProfesional);
              break;
            } catch (ParseException e) {
              System.out.println("Formato de la fecha invalido, use (dd/mm/yyyy)");
            }
          }
          break;
        case 4:
          // Guardar un Administrativo
          System.out.println(GREEN_BOLD + """

              ************************************
              *    Registro de Administrativos   *
              ************************************
              """ + RESET_COLOR);
          // ingreso area del administrativo
          while (true) {
            System.out.println("Ingrese area: (min 5 - max 20 caracteres)");
            String areaAdministrativo = sc.nextLine();
            if (areaAdministrativo.length() >= 5 && areaAdministrativo.length() <= 50
                && areaAdministrativo.matches("^[a-zA-Z ]+")) {
              System.out.println("area registrada: " + areaAdministrativo);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("El area tiene un max de 20 caracteres y espacios");
            }
          }

          // ingreso experiencia previa
          while (true) {
            System.out.println("Ingrese experiencia previa: (max 100 caracteres)");
            String experienciaPrevia = sc.nextLine();
            if (experienciaPrevia.length() >= 5 && experienciaPrevia.length() <= 50
                && experienciaPrevia.matches("^[a-zA-Z ]+")) {
              System.out.println("Experiencia previa registrada!...");
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("La experiencia previa tiene un max de 100 caracteres y espacios");
            }
          }
          break;

        case 5:
          // Guardar Capacitacion
          System.out.println(GREEN_BOLD + """

              ************************************
              *    Registro de Capacitaciones    *
              ************************************
              """ + RESET_COLOR);

          // generar identificador de la capacitacion
          int identificadorCapacitacion = identificadorRandom(1000, 9999);
          System.out.println("""
              Se ha generado un Identificador...
              Identificador: """ + identificadorCapacitacion + """
              """);
          // registrar rut del cliente de la capacitacion
          System.out.println("Ingrese Rut Cliente Capacitacion: ");
          int rutClienteCapacitacion = sc.nextInt();
          while (rutClienteCapacitacion <= 7000000 || rutClienteCapacitacion > 99999999) {
            System.out.println("Rut no valido, ingrese un Rut: ");
            rutClienteCapacitacion = sc.nextInt();
          }
          System.out.println("Rut Cliente registrado: " + rutClienteCapacitacion);
          System.out.println("----------------------------------------");
          sc.nextLine(); // Consume la nueva línea restante

          // ingreso dia de la capacitacion
          while (true) {
            System.out.println("Ingrese día de capacitación (Lunes a Domingo): ");
            String diaCapacitacion = sc.nextLine();
            if (diaCapacitacion.matches("(?i)^(lunes|martes|mi[ée]rcoles|jueves|viernes|s[áa]bado|domingo)$")) {
              System.out.println("Día registrado! :" + diaCapacitacion);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("El día de la semana debe coincidir con Lunes a Domingo.");
            }
          }
          // ingresar hora de la capacitacion
          while (true) {
            System.out.println("Ingrese una hora: (hh:mm)");
            String horaCapacitacion = sc.nextLine();

            if (horaCapacitacion.matches(regexHora)) {
              System.out.println("Hora registrada: " + horaCapacitacion);
              break;
            } else {
              System.out.println("Ingresa una hora valida (hh:mm)");
            }
          }
          // ingresar lugar de la capacitacion
          while (true) {
            System.out.println("Ingrese el lugar de la capacitacion: (min 10 - max 50 caracteres");
            String lugarCapacitacion = sc.nextLine();

            if (lugarCapacitacion.length() >= 5 && lugarCapacitacion.length() <= 50
                && lugarCapacitacion.matches("^[a-zA-Z0-9 ]+$")) {
              System.out.println("Lugar registrado: " + lugarCapacitacion);
              break;
            } else {
              System.out.println("El lugar debe tener un min de 10 y max de 50");
            }
          }

          // duracion de la capacitacion
          while (true) {
            System.out.println("Ingrese la duracion de la capacitacion: ");
            String duracionCapacitacion = sc.nextLine();
            if (duracionCapacitacion.length() > 3 && duracionCapacitacion.length() <= 70
                && duracionCapacitacion.matches("^[a-zA-Z0-9 ]+$")) {
              System.out.println("Duracion registrada: " + duracionCapacitacion);
              break;
            } else {
              System.out.println("Ingrese la duracion con un maximo de 70 caracteres");
            }
          }
          // cantidad de asistentes
          while (true) {
            System.out.println("Ingrese la cantidad de asistentes:");

            try {
              int cantidadAsistentesCapacitacion = sc.nextInt();
              sc.nextLine();
              if (cantidadAsistentesCapacitacion > 0 && cantidadAsistentesCapacitacion < 1000) {
                System.out.println("Cantidad asistentes registrada: " + cantidadAsistentesCapacitacion);
                break;
              } else {
                System.out.println("La cantidad debe ser mayor a 0 y menor que 1000");
              }
            } catch (InputMismatchException e) {
              System.out.println("Error de entrada del dato...");
              sc.next();
            }
          }
          break;

        case 10:
          // Salir
          System.out.println("Saliendo del programa...");
          break;

        default:
          System.out.println("Opción no válida. Por favor, ingrese una opción entre 1 y 10.");
          break;
      }
    } while (opcion != 10);
    sc.close();

  }

}
