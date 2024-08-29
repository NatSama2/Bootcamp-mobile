
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // objtect Scanner para leer desde teclado
        Scanner scanner = new Scanner(System.in);

        // array list para guardar personas
        ArrayList<SerHumano> listaPersonas = new ArrayList<>();

        System.out.println("¿Cuántas personas quieres registrar?");
        int numeroPersonas = scanner.nextInt();
        scanner.nextLine();

        // ciclo para ingresar personas
        for (int i = 0; i < numeroPersonas; i++) {

            // instanciar persona
            Persona persona = new Persona();
            System.out.println("Ingresando datos para la persona " + (i + 1));
            System.out.println("********************************************");

            // VALIDAR NOMBRE
            while (true) {

                System.out.println("Ingrese el nombre");
                String nombre = scanner.nextLine();

                if (nombre.matches("^[a-zA-Z\\s]+$")) {

                    persona.setNombre(nombre);
                    break;

                } else {

                    System.out.println("Nombre Inválido deber contener sólo letras");
                }

            }

            // VALIDAR EDAD
            while (true) {

                System.out.println("Ingrese La edad");
                String edadStr = scanner.nextLine();

                try {

                    int edad = Integer.parseInt(edadStr);
                    if (edad > 0 && edad < 150) {

                        persona.setEdad(edad);
                        break;

                    } else {

                        System.out.println("Edad inválida. Debe ser un número entre 1 y 149.");
                    }

                } catch (Exception e) {

                    System.out.println("Edad inválida. Debe ser un número.");
                }

            }

            // VALIDAR CORREO
            while (true) {

                System.out.println("Ingrese el Correo");
                String correo = scanner.nextLine();

                if (correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

                    persona.setCorreo(correo);
                    break;

                } else {

                    System.out.println("Correo Inválido deber tener un formato correcto");
                }

            }

            // VALIDAR TALEFONO
            while (true) {

                System.out.println("Ingrese el Telefono");
                String telefono = scanner.nextLine();

                if (telefono.matches("^[0-9]{9}$")) {

                    persona.setTelefono(telefono);
                    break;

                } else {

                    System.out.println("Teléfono inválido");
                }

            }

            listaPersonas.add(persona);
        } // cierre del for

        // IMPRESION DE LOS DATOS
        System.out.println("Los datos Ingresados:");
        System.out.println("*********************");

        for (int i = 0; i < listaPersonas.size(); i++) {
            // Persona persona = listaPersonas.get(i);

            System.out.println("Persona" + (i + 1) + " :");

        }
        scanner.close();
    }
}
