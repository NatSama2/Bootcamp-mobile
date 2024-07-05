import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        int numero1, numero2;
        char operando;
        double resultado;

        // Solicitar al usuario los números y el operando
        System.out.println("Ingrese el primer número:");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número:");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese el operando (+ para suma, - para resta, x para multiplicación, : para división, / para módulo):");
        operando = entrada.next().charAt(0);

        // Realizar la operación según el operando ingresado
        switch (operando) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 'x':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case ':':
                resultado = (double) numero1 / numero2; // División como double para precisión
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                resultado = numero1 % numero2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operando no válido");
                break;
        }

        // Cerrar el Scanner
        entrada.close();
    }
}