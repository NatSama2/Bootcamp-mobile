
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Introducimos los datos
        String nombre = "";
        while (!nombre.matches("[a-zA-Z]+")) {
            System.out.println("Introduce el nombre (solo letras)");
            nombre = sc.next();
            if (!nombre.matches("[a-zA-Z]+")) {
                System.out.println("Nombre inválido. Solo se permiten letras");
            }
        }

        int edad = -1;
        while (edad < 0) {
            System.out.println("Introduce la edad (número entero positivo)");
            while (!sc.hasNextInt()) {
                System.out.println("Edad inválida. Introduce un número entero positivo");
                sc.next(); // limpiar el input inválido
            }
            edad = sc.nextInt();
            if (edad < 0) {
                System.out.println("Edad inválida. Debe ser un número entero positivo");
            }
        }

        char sexo = ' ';
        while (sexo != 'H' && sexo != 'M') {
            System.out.println("Introduce el sexo (H para hombre, M para mujer)");
            sexo = sc.next().charAt(0);
            if (sexo != 'H' && sexo != 'M') {
                System.out.println("Sexo inválido. Introduce 'H' para hombre o 'M' para mujer");
            }
        }

        double peso = -1;
        while (peso < 0) {
            System.out.println("Introduce el peso (número positivo)");
            while (!sc.hasNextDouble()) {
                System.out.println("Peso inválido. Introduce un número positivo");
                sc.next(); // limpiar el input inválido
            }
            peso = sc.nextDouble();
            if (peso < 0) {
                System.out.println("Peso inválido. Debe ser un número positivo");
            }
        }

        double altura = -1;
        while (altura < 0) {
            System.out.println("Introduce la altura (número positivo en metros)");
            while (!sc.hasNextDouble()) {
                System.out.println("Altura inválida. Introduce un número positivo en metros");
                sc.next(); // limpiar el input inválido
            }
            altura = sc.nextDouble();
            if (altura < 0) {
                System.out.println("Altura inválida. Debe ser un número positivo en metros");
            }
        }

        // Creamos objetos con cada constructor
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        // Los datos que no estén completos los insertamos con los métodos set
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);

        persona2.setPeso(90.5);
        persona2.setAltura(1.80);

        // Usamos métodos para realizar la misma acción para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());

        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());

        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }

    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona está en su peso ideal");
                break;
            case Persona.INFRAPESO:
                System.out.println("La persona está por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                System.out.println("La persona está por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorDeEdad(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}
