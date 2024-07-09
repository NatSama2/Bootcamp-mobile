import java.util.Scanner;

// Individual 17
public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Pedir al usuario que ingrese una cadena no vacía
        do {
            System.out.print("Ingresa una cadena de texto: ");
            input = scanner.nextLine().trim(); // Leer la cadena y eliminar espacios en blanco al inicio y final
        } while (input.isEmpty()); // Validar que la cadena no esté vacía

        // Contadores de vocales y consonantes
        int vocales = 0;
        int consonantes = 0;

        // Recorrer la cadena carácter por carácter
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i)); // Obtener el carácter en minúscula

            // Verificar si el carácter es una letra del alfabeto
            if (Character.isLetter(ch)) {
                // Verificar si es una vocal
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vocales++;
                } else { // Si no es vocal, es consonante
                    consonantes++;
                }
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);

        scanner.close();
    }
} 

      // javac src/ContadorVocalesConsonantes.java
      // java -cp . src.ContadorVocalesConsonantes