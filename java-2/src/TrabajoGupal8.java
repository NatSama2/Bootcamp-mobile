  import java.util.Scanner;

public class TrabajoGupal8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nusuarios = 0;

        // Validación para la cantidad de usuarios a ingresar
        while (true) {
            System.out.print("Ingrese la cantidad de usuarios a ingresar: ");
            if (sc.hasNextInt()) {
                nusuarios = sc.nextInt();
                if (nusuarios > 0) {
                    break;
                } else {
                    System.out.println("Error: La cantidad de usuarios debe ser mayor que cero.");
                }
            } else {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.next(); // Limpiar entrada inválida
            }
        }

        sc.nextLine(); // Limpiar el buffer

        int countClientes = 0;
        int countProfesionales = 0;
        int countAdministrativos = 0;

        for (int i = 1; i <= nusuarios; i++) {
            System.out.println("Ingresará la información del Usuario " + i);

            // Validación para el nombre
            String nombre;
            while (true) {
                System.out.print("Ingrese nombre: ");
                nombre = sc.nextLine();
                if (!nombre.isEmpty()) {
                    break;
                } else {
                    System.out.println("Error: El nombre no puede estar vacío.");
                }
            }

            // Validación para la fecha de nacimiento
            int fechadenacimiento;
            while (true) {
                System.out.print("Ingrese fecha de nacimiento (solo año): ");
                if (sc.hasNextInt()) {
                    fechadenacimiento = sc.nextInt();
                    if (fechadenacimiento > 1900 && fechadenacimiento <= 2023) {
                        break;
                    } else {
                        System.out.println("Error: Ingrese un año válido.");
                    }
                } else {
                    System.out.println("Error: Debe ingresar un número entero.");
                    sc.next(); // Limpiar entrada inválida
                }
            }

            sc.nextLine(); // Limpiar el buffer

            // Validación para el RUT
            String rut;
            while (true) {
                System.out.print("Ingrese RUT: ");
                rut = sc.nextLine();
                if (!rut.isEmpty()) {
                    break;
                } else {
                    System.out.println("Error: El RUT no puede estar vacío.");
                }
            }

            // Selección del tipo de usuario con validación
            int tipouser = 0;
            while (true) {
                System.out.println("Seleccione un número según tipo de usuario:");
                System.out.println("1. Clientes");
                System.out.println("2. Profesional");
                System.out.println("3. Administrativo");
                if (sc.hasNextInt()) {
                    tipouser = sc.nextInt();
                    if (tipouser >= 1 && tipouser <= 3) {
                        break;
                    } else {
                        System.out.println("Error: Seleccione un número válido (1, 2 o 3).");
                    }
                } else {
                    System.out.println("Error: Debe ingresar un número entero.");
                    sc.next(); // Limpiar entrada inválida
                }
            }

            sc.nextLine(); // Limpiar el buffer

            // Variables para guardar datos adicionales según el tipo de usuario
            String direccion = "", ntelefono = "", departamento = "", cargo = "", nSuperior = "";
            int nempleados = 0, añosexp = 0;

            switch (tipouser) {
                case 1:
                    System.out.println("Se ha seleccionado perfil de Cliente.");
                    System.out.print("Ingrese dirección: ");
                    direccion = sc.nextLine();
                    System.out.print("Ingrese teléfono: ");
                    ntelefono = sc.nextLine();
                    System.out.print("Ingrese cantidad de empleados: ");
                    nempleados = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    countClientes++;
                    break;
                case 2:
                    System.out.println("Se ha seleccionado perfil de Profesional.");
                    System.out.print("Ingrese años de experiencia: ");
                    añosexp = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese nombre de departamento relacionado: ");
                    departamento = sc.nextLine();
                    countProfesionales++;
                    break;
                case 3:
                    System.out.println("Se ha seleccionado perfil Administrativo.");
                    System.out.print("Ingrese función: ");
                    cargo = sc.nextLine();
                    System.out.print("Ingrese nombre de superior: ");
                    nSuperior = sc.nextLine();
                    countAdministrativos++;
                    break;
            }

            // Imprimir los datos ingresados del usuario
            System.out.println("\nDatos del Usuario " + i + ":");
            System.out.println("Nombre: " + nombre);
            System.out.println("Fecha de Nacimiento: " + fechadenacimiento);
            System.out.println("RUT: " + rut);
            switch (tipouser) {
                case 1:
                    System.out.println("Tipo de Usuario: Cliente");
                    System.out.println("Dirección: " + direccion);
                    System.out.println("Teléfono: " + ntelefono);
                    System.out.println("Cantidad de Empleados: " + nempleados);
                    break;
                case 2:
                    System.out.println("Tipo de Usuario: Profesional");
                    System.out.println("Años de Experiencia: " + añosexp);
                    System.out.println("Departamento: " + departamento);
                    break;
                case 3:
                    System.out.println("Tipo de Usuario: Administrativo");
                    System.out.println("Función: " + cargo);
                    System.out.println("Nombre de Superior: " + nSuperior);
                    break;
            }
            System.out.println(); // Línea en blanco para separar usuarios
        }

        // Imprimir cantidad de usuarios por cada perfil
        System.out.println("Cantidad de Clientes: " + countClientes);
        System.out.println("Cantidad de Profesionales: " + countProfesionales);
        System.out.println("Cantidad de Administrativos: " + countAdministrativos);
    }
}

