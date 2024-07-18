import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto;
        String textoFinal;

        while (true) {
            System.out.println("Ingrese texto a procesar (cadena vacía para salir):");
            texto = leer.nextLine();
            texto = texto.trim();

            if (texto.length() == 0) {
                break;
            }

            textoFinal = changeCase(texto);
            System.out.println("Texto con cambio de mayúsculas y minúsculas: " + textoFinal);
            textoFinal = omitSpaces(textoFinal);
            imprimirTexto(textoFinal);
        }

        leer.close();
    }

    public static String changeCase(String texto) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isUpperCase(caracter)) {
                resultado.append(Character.toLowerCase(caracter));
            } else {
                resultado.append(Character.toUpperCase(caracter));
            }
        }

        return resultado.toString();
    }

    public static String omitSpaces(String texto) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter != ' ') {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }

    public static void imprimirTexto(String texto) {
        System.out.println("Texto procesado: " + texto);
        System.out.println("");
    }
}