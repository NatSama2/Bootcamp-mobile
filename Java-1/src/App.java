import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("¿Cómo están?");
        System.out.println("*******************************");

        // Declaración de variables
        String valor = "soy un String 1";
        int numeroEntero = 10;
        double numeroDecimal = 5.5;
        float numeroFlotante = 3.14f;

        // Carácter o una letra
        char letra = 'A';
        boolean esVerdadero = true;

        byte numeroByte = 127;
        short numeroCorto = 32000;
        long numeroLargo = 10000000L;

        // Imprimir variables
        System.out.println("Número Entero: " + numeroEntero);
        System.out.println("Letra: " + letra);
        System.out.println("Unión de variables: " + numeroCorto + " " + numeroByte);

        String texto = "Hola Mundo";
        int[] numeros = {1, 2, 3, 4};

        System.out.println("Texto: " + texto);
        System.out.println("Número: " + Arrays.toString(numeros));

        // Crear una instancia de Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su Nombre");
        String nombre = input.nextLine();

        System.out.println("Ingrese Edad");
        int edad = input.nextInt();

        System.out.println("Ingrese su correo Electrónico");
        String correo = input.next();

        System.out.println("LOS DATOS INGRESADOS SON: " + nombre + " " + edad + " " + correo);

        // Cerrar el Scanner
        input.close();
    }
}
