  import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);

        String nombre;

        do {
            System.out.print("Ingrese el nombre: ");
            nombre = scanner.nextLine();
            if (!Persona.validarNombre(nombre)) {
                System.out.println("El nombre solo debe contener letras.");
            }
        } while (!Persona.validarNombre(nombre));




        String edad;
        do {
            System.out.print("Ingrese la edad: ");
            edad = scanner.nextLine();
            if (!Persona.validarEdad(edad)) {
                System.out.println("La edad debe ser un número entero positivo menor o igual a 120.");
            }
        } while (!Persona.validarEdad(edad));



        String correo;
        do {
          
            System.out.print("Ingrese el correo: ");
            correo = scanner.nextLine();
            if (!Persona.validarCorreo(correo)) {
                System.out.println("El correo electrónico no es válido.");
            }
        } while (!Persona.validarCorreo(correo));


    }
}
