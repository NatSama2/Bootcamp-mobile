package dia9;

import java.util.Scanner;

/**
 * Inserta un título en la clase descripción.
 * Al ser el título obligatorio, si es nulo o vacío se lanzará
 * una excepción.
 *
 * @param titulo El nuevo título de la descripción.
 * @throws IllegalArgumentException Si titulo es null, está vacío o contiene
 *                                  sólo espacios.
 * @author Michelle, Giselle, Iris, Matias, Sebastian, Camila
 * @version 0.1
 */

public class Grupal9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nombre, día, hora, lugar, duración y cantidad de asistentes.
        String[] capacitacion = new String[6];
        String[][] asistentes;
        String[] empresa = new String[5];
        int edad1 = 0, edad2 = 0, edad3 = 0;

        System.out.print("Ingrese nombre de la capacitación: ");
        capacitacion[0] = sc.nextLine(); // nombre
        System.out.print("Ingrese día de la capacitación: ");
        capacitacion[1] = sc.nextLine(); // día
        System.out.print("Ingrese hora de la capacitación: ");
        capacitacion[2] = sc.nextLine(); // hora
        System.out.print("Ingrese lugar de la capacitación: ");
        capacitacion[3] = sc.nextLine(); // lugar
        System.out.print("Ingrese duración de la capacitación: ");
        capacitacion[4] = sc.nextLine(); // duración
        System.out.print("Ingrese cantidad de asistentes: ");
        int cantidad = sc.nextInt(); // cantidad
        sc.nextLine(); // Consumir la nueva línea restante
        capacitacion[5] = Integer.toString(cantidad);

        asistentes = new String[cantidad][2];

        // Ingresar datos de la empresa que solicita la capacitación RUT del cliente, su
        // nombre, dirección, comuna y número de teléfono
        System.out.print("Ingrese RUT de la empresa: ");
        empresa[0] = sc.nextLine(); // RUT
        System.out.print("Ingrese nombre de la empresa: ");
        empresa[1] = sc.nextLine(); // nombre
        System.out.print("Ingrese dirección de la empresa: ");
        empresa[2] = sc.nextLine(); // dirección
        System.out.print("Ingrese comuna de la empresa: ");
        empresa[3] = sc.nextLine(); // comuna
        System.out.print("Ingrese teléfono de la empresa: ");
        empresa[4] = sc.nextLine(); // teléfono

        // Solicitar nombre y edad de los asistentes
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del asistente " + (i + 1) + ": ");
            asistentes[i][0] = sc.nextLine();
            System.out.print("Ingrese edad del asistente " + (i + 1) + ": ");
            int edad = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea restante
            asistentes[i][1] = Integer.toString(edad);

            // Sumar al contador de edad
            if (edad < 25) {
                edad1++;
            } else if (edad >= 26 && edad <= 35) {
                edad2++;
            } else {
                edad3++;
            }
        }

        // Imprimir datos de la empresa
        System.out.println("\nDatos de la empresa:");
        System.out.println("RUT: " + empresa[0]);
        System.out.println("Nombre: " + empresa[1]);
        System.out.println("Dirección: " + empresa[2]);
        System.out.println("Comuna: " + empresa[3]);
        System.out.println("Teléfono: " + empresa[4]);

        // Imprimir datos de la capacitación
        System.out.println("\nDatos de la capacitación:");
        System.out.println("Nombre: " + capacitacion[0]);
        System.out.println("Día: " + capacitacion[1]);
        System.out.println("Hora: " + capacitacion[2]);
        System.out.println("Lugar: " + capacitacion[3]);
        System.out.println("Duración: " + capacitacion[4]);
        System.out.println("Cantidad de asistentes: " + capacitacion[5]);

        // Imprimir datos de los asistentes
        System.out.println("\nDatos de los asistentes:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Asistente " + (i + 1) + ": " + asistentes[i][0] + ", Edad: " + asistentes[i][1]);
        }

        // Imprimir el resumen de edades
        System.out.println("\nCantidad de personas menores a 25 años: " + edad1);
        System.out.println("Cantidad de personas entre 26 y 35 años: " + edad2);
        System.out.println("Cantidad de personas mayores a 35 años: " + edad3);

        // Cerrar el Scanner
        sc.close();
    }
}
