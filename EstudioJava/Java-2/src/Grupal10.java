import java.util.Scanner;

public class Grupal10 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos de la capacitación
        String[] capacitacion = new String[6];

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

        // Arreglos para nombres y calificaciones
        String[] nombres = new String[cantidad];
        int[] calificaciones = new int[cantidad];

        // Captura de nombres y calificaciones
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese nombre del asistente " + (i+1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese calificación (entre 1 y 7) para " + nombres[i] + ": ");
            calificaciones[i] = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea restante
        }

        // Calcular promedio
        double sumaCalificaciones = 0;
        int calificacionMayor = calificaciones[0];
        int calificacionMenor = calificaciones[0];

        for (int calificacion : calificaciones) {
            sumaCalificaciones += calificacion;

            if (calificacion > calificacionMayor) {
                calificacionMayor = calificacion;
            }

            if (calificacion < calificacionMenor) {
                calificacionMenor = calificacion;
            }
        }

        double promedio = sumaCalificaciones / cantidad;

        // Mostrar resultados
        System.out.println("\nDatos de la capacitación:");
        System.out.println("Nombre: " + capacitacion[0]);
        System.out.println("Día: " + capacitacion[1]);
        System.out.println("Hora: " + capacitacion[2]);
        System.out.println("Lugar: " + capacitacion[3]);
        System.out.println("Duración: " + capacitacion[4]);
        System.out.println("Cantidad de asistentes: " + capacitacion[5]);
        System.out.println("\nPromedio de calificaciones: " + promedio);
        System.out.println("Calificación más alta: " + calificacionMayor);
        System.out.println("Calificación más baja: " + calificacionMenor);

        sc.close();
    }
}
