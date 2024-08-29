package com.sprint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static final String CYAN_COLOR = "\033[0;36m";
  public static final String GREEN_BOLD = "\033[1;32m";
  public static final String RED_BOLD = "\033[1;31m";
  public static final String YELLOW_BOLD = "\033[1;33m";
  public static final String RESET_COLOR = "\u001B[0m";

  private static Random random = new Random();

  // Metodo para un numero random
  private static int identificadorRandom(int min, int max) {
    return random.nextInt(max - min + 1) + min;
  }

  public static void main(String[] args) {

    // Regex para dia, hora
    String regexHora = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$";

    Contenedor contenedor = new Contenedor();
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setLenient(false); // Para evitar fechas invalidas

    // Menú principal
    int opcion;
    int runUsuario;

    // Ciclo do-while para mostrar el menu
    do {
      System.out.println(YELLOW_BOLD + """
          |1| Guardar Cliente
          |2| Guardar Profesional
          |3| Guardar Administrativo
          |4| Guardar Capacitacion
          |5| Eliminar Usuario
          |6| Listar Usuarios
          |7| Listar Usuarios por Tipo
          |8| Listar Capacitaciones
          |9| Salir
          """ + RESET_COLOR);
      opcion = sc.nextInt();
      sc.nextLine(); // Limpiar el buffer

      switch (opcion) {
        case 1:
        case 2:
        case 3:
          Date fechaUsuario = null;
          String fecha;
          String nombreUsuario;
          // Registro de usuarios
          System.out.println(GREEN_BOLD + """
              ************************************
              *      Registro de Usuarios        *
              ************************************
              """ + RESET_COLOR);

          // Ingreso nombre del usuario
          System.out.println("Ingrese nombre (min 10 - max 50 caracteres): ");
          nombreUsuario = sc.nextLine();
          while (nombreUsuario.length() < 10 || nombreUsuario.length() > 50 || !nombreUsuario.matches("[a-zA-Z ]+")) {
            System.out.println("Nombre no válido, ingrese un nombre: ");
            nombreUsuario = sc.nextLine();
          }
          System.out.println("Nombre registrado: " + nombreUsuario);
          System.out.println("----------------------------------------");

          // Ingreso fecha de nacimiento
          while (true) {
            System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy): ");
            fecha = sc.nextLine();
            try {
              fechaUsuario = sdf.parse(fecha);
              System.out.println("Fecha de nacimiento registrada: " + fechaUsuario);
              System.out.println("----------------------------------------");
              break;
            } catch (ParseException e) {
              System.out.println("Formato de la fecha inválido, use (dd/MM/yyyy)");
            }
          }

          // Validación del RUT
          while (true) {
            System.out.println("Ingrese RUT: ");
            String rut = sc.nextLine().replace(".", "").replace("-", ""); // Elimina puntos y guiones del RUT
            if (rut.matches("^[0-9]+$")) { // Solo números
              try {
                runUsuario = Integer.parseInt(rut);
              } catch (NumberFormatException e) {
                System.out.println("RUT no válido, ingrese un RUT (solo números): ");
                continue;
              }
              if (runUsuario >= 7000000 && runUsuario <= 99999999) {
                System.out.println("RUT registrado: " + runUsuario);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("RUT no válido, ingrese un RUT entre 7000000 y 99999999: ");
              }
            } else {
              System.out.println("RUT no válido, ingrese un RUT (solo números): ");
            }
          }

          if (opcion == 1) {
            // Definición de variables CLiente
            int rutCliente;
            String rutClienteStr;
            String nombreCliente = "";
            String apellidoCliente = "";
            String telefonoCliente = "";
            String afp = "";
            int sistemaSalud = 0;
            String direccion = "";
            String comuna = "";
            int edad = 0;
            // Guardar un cliente
            System.out.println(GREEN_BOLD + """
                ************************************
                *        Registro de Cliente       *
                ************************************
                """ + RESET_COLOR);

            // Ingreso Rut
            System.out.println("Ingrese Rut Cliente: ");
            rutClienteStr = sc.nextLine().replace(".", "").replace("-", ""); // Elimina puntos y guiones del RUT
            // Validación del RUT
            if (rutClienteStr.matches("^[0-9]+$")) { // Solo números
              try {
                rutCliente = Integer.parseInt(rutClienteStr);
              } catch (NumberFormatException e) {
                System.out.println("Rut no valido, ingrese un Rut (solo números): ");
                continue;
              }
              while (rutCliente < 7000000 || rutCliente > 99999999) {
                System.out.println("Rut no valido, ingrese un Rut entre 7000000 y 99999999: ");
                rutClienteStr = sc.nextLine().replace(".", "").replace("-", ""); // Elimina puntos y guiones del RUT
                if (rutClienteStr.matches("^[0-9]+$")) {
                  rutCliente = Integer.parseInt(rutClienteStr);
                } else {
                  System.out.println("Rut no valido, ingrese un Rut (solo números): ");
                  continue;
                }
              }
              System.out.println("Rut registrado: " + rutCliente);
            } else {
              System.out.println("Rut no valido, ingrese un Rut (solo números): ");
            }
            System.out.println("----------------------------------------");

            // Ingreso y validación del nombre
            while (true) {
              System.out.println("Ingrese nombres (min 5 - max 30 caracteres): ");
              nombreCliente = sc.nextLine();
              if (nombreCliente.length() >= 5 && nombreCliente.length() <= 30 && nombreCliente.matches("[a-zA-Z ]+")) {
                System.out.println("Nombre registrado: " + nombreCliente);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("El nombre debe tener entre 5 y 30 caracteres, solo letras y un espacio");
              }
            }

            // Ingreso apellido
            while (true) {
              System.out.println("Ingrese apellidos (min 5 - max 30 caracteres): ");
              apellidoCliente = sc.nextLine();
              if (apellidoCliente.length() >= 5 && apellidoCliente.length() <= 30
                  && apellidoCliente.matches("[a-zA-Z ]+")) {
                System.out.println("apellidos registrados: " + apellidoCliente);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("El apellido debe tener entre 5 y 30 caracteres, solo letras y un espacio");
              }
            }

            // Ingreso telefono
            while (true) {
              System.out.println("Ingrese telefono (min 8 - max 9 numeros): ");
              telefonoCliente = sc.nextLine();
              if (telefonoCliente.length() >= 8 && telefonoCliente.length() <= 9
                  && telefonoCliente.matches("^[0-9]{8,9}$")) {
                System.out.println("Telefono registrado: " + telefonoCliente);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("El telefono debe ser solo numeros y tener entre 8 y 9 caracteres");
              }
            }

            // Ingreso AFP
            while (true) {
              System.out.println("Ingrese AFP (min 3 - max 30 caracteres): ");
              afp = sc.nextLine();
              if (afp.length() >= 3 && afp.length() <= 30 && afp.matches("[a-zA-Z ]+")) {
                System.out.println("AFP registrada: " + afp);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("La AFP debe estar entre 3 y 30 caracteres y ser solo letras");
              }
            }

            // Ingreso Sistema de Salud
            while (true) {
              System.out.println("Ingrese Sistema de Salud (1 Fonasa - 2 Isapre): ");
              try {
                sistemaSalud = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
                if (sistemaSalud == 1) {
                  System.out.println("Sistema de salud registrado: Fonasa");
                  System.out.println("----------------------------------------");
                  break;
                } else if (sistemaSalud == 2) {
                  System.out.println("Sistema de salud registrado: Isapre");
                  System.out.println("----------------------------------------");
                  break;
                } else {
                  System.out.println("El Sistema de salud debe estar entre 1 y 2 y ser solo números");
                }
              } catch (InputMismatchException e) {
                System.out.println("Error de entrada del dato...");
                sc.next(); // Limpiar el buffer del scanner
              }
            }

            // Ingreso Dirección
            while (true) {
              System.out.println("Ingrese Dirección (max 70 caracteres): ");
              direccion = sc.nextLine();
              if (direccion.length() <= 70 && direccion.matches("^[a-zA-Z0-9 ]+$")) {
                System.out.println("Dirección registrada: " + direccion);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println(
                    "La dirección tiene un máximo de 70 caracteres y puede contener letras, números y espacios");
              }
            }

            // Ingreso Comuna
            while (true) {
              System.out.println("Ingrese Comuna (max 50 caracteres): ");
              comuna = sc.nextLine();
              if (comuna.length() <= 50 && comuna.matches("^[a-zA-Z0-9 ]+$")) {
                System.out.println("Comuna registrada: " + comuna);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out
                    .println("La comuna tiene un máximo de 50 caracteres y puede contener letras, números y espacios");
              }
            }
            // Ingreso edad
            while (true) {
              System.out.println("Ingrese Edad: ");
              edad = sc.nextInt();
              if (edad >= 0 || edad < 150) {
                System.out.println("Edad: " + edad);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("La edad debe ser mayor a cero, menor a 150  y solo números");
              }
            }

            // Llamar método de guardar cliente
            Cliente cliente = new Cliente(nombreUsuario, fechaUsuario, runUsuario, rutClienteStr, nombreCliente,
                apellidoCliente, telefonoCliente, afp, sistemaSalud, direccion, comuna, edad);
            contenedor.almacenarCliente(cliente);
            System.out.println("Cliente registrado con éxito.");

          } else if (opcion == 2) {
            String tituloProfesional;
            Date fechaIngreso = null;

            // Guardar un profesional
            System.out.println(GREEN_BOLD + """
                ************************************
                *    Registro de Profesionales     *
                ************************************
                """ + RESET_COLOR);

            // Ingreso nombre del título profesional
            while (true) {
              System.out.println("Ingrese su título profesional (min 10 - max 50 caracteres):");
              tituloProfesional = sc.nextLine();
              if (tituloProfesional.length() >= 10 && tituloProfesional.length() <= 50
                  && tituloProfesional.matches("^[a-zA-Z ]+$")) {
                System.out.println("Título registrado: " + tituloProfesional);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("El título debe tener entre 10 y 50 caracteres y ser solo letras");
              }
            }

            // Ingreso fecha de ingreso
            while (true) {
              System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
              fecha = sc.nextLine();
              try {
                fechaIngreso = sdf.parse(fecha);
                System.out.println("Fecha de ingreso registrada: " + fechaIngreso);
                System.out.println("----------------------------------------");
                break;
              } catch (ParseException e) {
                System.out.println("Formato de la fecha inválido, use (dd/MM/yyyy)");
              }
            }

            Profesional profesional = new Profesional(nombreUsuario, fechaUsuario, runUsuario, tituloProfesional,
                fechaIngreso);
            contenedor.almacenarProfesional(profesional);
            System.out.println("Profesional registrado con éxito.");

          } else if (opcion == 3) {
            String experienciaLaboral;
            String areaAdministrativa;

            // Guardar un administrativo
            System.out.println(GREEN_BOLD + """
                ************************************
                *      Registro de Administrativo   *
                ************************************
                """ + RESET_COLOR);

            // Ingreso área administrativa
            while (true) {
              System.out.println("Ingrese área administrativa (min 5 - max 30 caracteres): ");
              areaAdministrativa = sc.nextLine();
              if (areaAdministrativa.length() >= 5 && areaAdministrativa.length() <= 30
                  && areaAdministrativa.matches("^[a-zA-Z ]+$")) {
                System.out.println("Área administrativa registrada: " + areaAdministrativa);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("El área administrativa debe tener entre 5 y 30 caracteres y ser solo letras");
              }
            }
            // Ingreso experiencia laboral
            while (true) {
              System.out.println("Ingrese experiencia laboral (min 5 - max 200 caracteres): ");
              experienciaLaboral = sc.nextLine();
              if (experienciaLaboral.length() >= 5 && experienciaLaboral.length() <= 200) {
                System.out.println("Experiencia laboral registrada: " + experienciaLaboral);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("La experiencia laboral debe tener entre 5 y 200 caracteres");
              }
            }

            Administrativo administrativo = new Administrativo(nombreUsuario, fechaUsuario, runUsuario,
                areaAdministrativa, experienciaLaboral);
            contenedor.almacenarAdministrativo(administrativo);
            System.out.println("Administrativo registrado con éxito.");
          }
          break;

        case 4:
          // Definición de variables
          String rutClienteCapacitacion;
          String diaCapacitacion;
          String horaCapacitacion = "";
          String lugarCapacitacion = "";
          String duracionCapacitacion = "";
          int cantidadAsistentesCapacitacion = 0;

          // Guardar Capacitacion
          System.out.println(GREEN_BOLD + """

              ************************************
              *    Registro de Capacitaciones    *
              ************************************
              """ + RESET_COLOR);

          // Generar identificador de la capacitacion
          int identificadorCapacitacion = identificadorRandom(1000, 9999);
          System.out.println("""
              Se ha generado un Identificador...
              Identificador: """ + identificadorCapacitacion + """
              """);

          // Registrar rut del cliente de la capacitacion
          while (true) {
            System.out.println("Ingrese RUT Cliente Capacitación: ");
            rutClienteCapacitacion = sc.nextLine().replace(".", "").replace("-", "");

            // Validación del RUT
            if (rutClienteCapacitacion.matches("^[0-9]+$")) { // Solo números
              try {
                int rutNumero = Integer.parseInt(rutClienteCapacitacion);

                if (rutNumero >= 7000000 && rutNumero <= 99999999) {
                  System.out.println("RUT registrado: " + rutClienteCapacitacion);
                  System.out.println("----------------------------------------");
                  break;
                } else {
                  System.out.println("RUT no válido, ingrese un RUT entre 7000000 y 99999999: ");
                }
              } catch (NumberFormatException e) {
                System.out.println("RUT no válido, ingrese un RUT (solo números): ");
              }
            } else {
              System.out.println("RUT no válido, ingrese un RUT (solo números): ");
            }
          }

          // Ingreso del día de la capacitación
          while (true) {
            System.out.println("Ingrese día de capacitación (Lunes a Domingo): ");
            diaCapacitacion = sc.nextLine();
            if (diaCapacitacion.matches("(?i)^(lunes|martes|mi[ée]rcoles|jueves|viernes|s[áa]bado|domingo)$")) {
              System.out.println("Día registrado: " + diaCapacitacion);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("El día de la semana debe coincidir con Lunes a Domingo.");
            }
          }

          // Ingreso de la hora de la capacitación
          while (true) {
            System.out.println("Ingrese una hora: (hh:mm)");
            horaCapacitacion = sc.nextLine();

            if (horaCapacitacion.matches(regexHora)) {
              System.out.println("Hora registrada: " + horaCapacitacion);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("Ingrese una hora válida en el formato (hh:mm).");
            }
          }

          // Ingreso del lugar de la capacitación
          while (true) {
            System.out.println("Ingrese el lugar de la capacitación (min 10 - max 50 caracteres):");
            lugarCapacitacion = sc.nextLine();

            if (lugarCapacitacion.length() >= 10 && lugarCapacitacion.length() <= 50
                && lugarCapacitacion.matches("^[a-zA-Z0-9 ]+$")) {
              System.out.println("Lugar registrado: " + lugarCapacitacion);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println(
                  "El lugar debe tener un mínimo de 10 y un máximo de 50 caracteres y puede contener letras, números y espacios.");
            }
          }

          // Duración de la capacitación
          while (true) {
            System.out.println("Ingrese la duración de la capacitación (en horas o minutos):");
            duracionCapacitacion = sc.nextLine();
            if (duracionCapacitacion.matches("^[0-9]+(h|m)?$")) {
              // Verifica que sea un número seguido opcionalmente
              // por 'h' o 'm'
              System.out.println("Duración registrada: " + duracionCapacitacion);
              System.out.println("----------------------------------------");
              break;
            } else {
              System.out.println("Ingrese una duración válida, por ejemplo: '2h' o '30m'.");
            }
          }

          // Cantidad de asistentes
          while (true) {
            System.out.println("Ingrese la cantidad de asistentes:");

            try {
              cantidadAsistentesCapacitacion = sc.nextInt();
              sc.nextLine(); // Consume la nueva línea restante
              if (cantidadAsistentesCapacitacion > 0 && cantidadAsistentesCapacitacion < 1000) {
                System.out.println("Cantidad de asistentes registrada: " + cantidadAsistentesCapacitacion);
                System.out.println("----------------------------------------");
                break;
              } else {
                System.out.println("La cantidad debe ser mayor a 0 y menor que 1000.");
              }
            } catch (InputMismatchException e) {
              System.out.println("Error de entrada de dato. Por favor, ingrese un número entero válido.");
              sc.next(); // Limpiar el buffer del scanner
            }
          }

          Capacitacion capacitacion = new Capacitacion(identificadorCapacitacion,
              rutClienteCapacitacion, diaCapacitacion, horaCapacitacion,
              lugarCapacitacion, duracionCapacitacion, cantidadAsistentesCapacitacion);
          contenedor.almacenarCapacitacion(capacitacion);
          System.out.println("Capacitación registrada con éxito.");
          break;

        case 5:
          // Eliminar usuario
          System.out.println(RED_BOLD + """

              ************************************
              *        Eliminar Usuario          *
              ************************************
              """ + RESET_COLOR);

          System.out.println("Ingrese el RUT del usuario que desea eliminar:");
          String rut = sc.nextLine().replace(".", "").replace("-", ""); // Elimina puntos y guiones del RUT
          if (rut.matches("^[0-9]+$")) { // Solo números
            try {
              runUsuario = Integer.parseInt(rut);
            } catch (NumberFormatException e) {
              System.out.println("RUT no válido, ingrese un RUT (solo números): ");
              continue;
            }
            if (runUsuario >= 7000000 && runUsuario <= 99999999) {
              System.out.println("Buscando rut: " + runUsuario);
              System.out.println("----------------------------------------");
              try {

                contenedor.eliminarUsuario(runUsuario);

                System.out.println(
                    GREEN_BOLD + "El usuario con RUT " + runUsuario + " ha sido eliminado correctamente."
                        + RESET_COLOR);
                System.out.println("----------------------------------------");
              } catch (NumberFormatException e) {
                System.out
                    .println(
                        RED_BOLD + "El RUT ingresado no es válido. Por favor, ingrese un rut válido." + RESET_COLOR);
                System.out.println("----------------------------------------");
              }
              break;
            } else {
              System.out.println("RUT no válido, ingrese un RUT entre 7000000 y 99999999: ");
            }
          } else {
            System.out.println("RUT no válido, ingrese un RUT (solo números): ");
          }

        case 6:
          System.out.println(GREEN_BOLD + """
              ************************************
              *        Listado de Usuarios       *
              ************************************
              """ + RESET_COLOR);
          contenedor.listarUsuarios();
          System.out.println("----------------------------------------");
          break;

        case 7:
          System.out.println(GREEN_BOLD + """
              ************************************
              *    Listado de Usuarios por Tipo  *
              ************************************
              """ + RESET_COLOR);
          System.out.println("Ingrese el tipo de usuario (Cliente, Profesional, Administrativo): ");
          String tipoUsuario = sc.nextLine();
          Class<? extends Usuario> tipoClase;
          if (tipoUsuario.equalsIgnoreCase("Cliente")) {
            tipoClase = Cliente.class;
          } else if (tipoUsuario.equalsIgnoreCase("Profesional")) {
            tipoClase = Profesional.class;
          } else if (tipoUsuario.equalsIgnoreCase("Administrativo")) {
            tipoClase = Administrativo.class;
          } else {
            System.out.println("Tipo de usuario no válido.");
            continue;
          }
          contenedor.listarUsuariosPorTipo(tipoClase);
          System.out.println("----------------------------------------");
          break;

        case 8:
          // Listar Capacitaciones
          System.out.println(GREEN_BOLD + """
              ************************************
              *     Listado de Capacitaciones    *
              ************************************
              """ + RESET_COLOR);
          contenedor.listarCapacitaciones();
          System.out.println("----------------------------------------");
          break;

        case 9:
          System.out.println(CYAN_COLOR + "Saliendo del programa..." + RESET_COLOR);
          sc.close(); // Cerrar el scanner
          break;

        default:
          System.out.println(RED_BOLD + "Opción inválida. Por favor, seleccione una opción del menú." + RESET_COLOR);
      }

    } while (opcion != 9);

  }
}