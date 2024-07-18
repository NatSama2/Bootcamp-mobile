import java.util.Scanner;

public class EjercicioIndividual19 {

  public static void main(String[] args) {
    
//     Utiliza tipos de datos, operadores, sentencias de control, ciclos y colecciones de Java
// para resolver un problema de baja complejidad

// Planteamiento del Problema:

// Desarrolle un programa en lenguaje Java tal que, al ingresar una cadena de texto o String por
// teclado, tome dicha cadena y la lea carácter por carácter, y los despliegue por consola.

// De acuerdo con la cantidad de caracteres del String, debe crear un arreglo del mismo tamaño, e
// ingresar en él cada letra anterior, en el mismo orden en el que aparecen en la cadena. Esto
// independiente del tipo de carácter.

// Finalmente, debe desplegar las letras del abecedario por consola, y al costado de cada una debe
// indicar la cantidad de letras encontradas, sin hacer diferencia entre mayúsculas y minúsculas para
// estos efectos.

// Nota 1: Se debe validar que la cadena ingresada no esté vacía; si eso sucede, debe pedirlo
// nuevamente.
  
// Nota 2: Recuerde que para obtener un carácter de un String puede usar el método CharAt.


//Capturar la cadena ingresada por usuario
Scanner ingresar = new Scanner(System.in);
        String text;

        // Validar que la cadena ingresada no esté vacía
        do {
            System.out.println("Ingrese el texto:");
            text = ingresar.nextLine();
            if (text.isEmpty()) {
                System.out.println("La cadena no debe estar vacía. Intente nuevamente.");
            }
        } while (text.isEmpty());

        // Convertir la cadena a minúsculas para evitar distinciones entre mayúsculas y minúsculas
        text = text.toLowerCase();

        // Leer carácter por carácter y mostrar en consola
        for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(i);
            System.out.println("Caracter en la posición " + i + ": " + caracter);
        }

        // Crear un arreglo del mismo tamaño que la cadena
        char[] caracteres = new char[text.length()];

        // Almacenar en el arreglo cada letra en el mismo orden
        for (int i = 0; i < text.length(); i++) {
            caracteres[i] = text.charAt(i);
        }

        // Contador de letras del abecedario
        int[] contador = new int[26];

        // Contar la cantidad de cada letra en el texto
        for (char c : caracteres) {
            if (c >= 'a' && c <= 'z') {
                contador[c - 'a']++;
            }
        }

        // Desplegar las letras del abecedario y la cantidad de cada una
        System.out.println("Frecuencia de letras en el texto:");
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('a' + i);
            System.out.println(letra + ": " + contador[i]);
        }
    }
}