package com.ejercicio1;

import java.util.Scanner;

public class Ejecutora {

  public static void main(String[] args) {

    Acciones acciones = new Acciones();
    Scanner scanner = new Scanner(System.in);
    int opcion = 0;

    do {
      System.out.println("=== Menú de Gestión de Países ===");
      System.out.println("1. Agregar país");
      System.out.println("2. Buscar país");
      System.out.println("3. Actualizar país");
      System.out.println("4. Eliminar país");
      System.out.println("5. Mostrar todos los países");
      System.out.println("6. Salir");
      System.out.print("Seleccione una opción: ");

      // Validar que la entrada sea un número entero
      while (!scanner.hasNextInt()) {
        System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
        scanner.next(); // Consumir la entrada no válida
        System.out.print("Seleccione una opción: ");
      }

      opcion = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de línea

      switch (opcion) {
        case 1:
          // Agregar país
          String nombreAgregar = leerNombre(scanner, "Ingrese el nombre del país: ");
          String capitalAgregar = leerNombre(scanner, "Ingrese la capital del país: ");
          Pais nuevoPais = new Pais(nombreAgregar, capitalAgregar);
          acciones.agregar(nuevoPais);
          break;

        case 2:
          // Buscar país
          String nombreBuscar = leerNombre(scanner, "Ingrese el nombre del país a buscar: ");
          Pais paisBuscado = acciones.buscar(nombreBuscar);
          if (paisBuscado != null) {
            System.out.println("País encontrado: " + paisBuscado.toString());
          }
          break;

        case 3:
          // Actualizar país
          String nombreActualizar = leerNombre(scanner, "Ingrese el nombre del país a actualizar: ");
          String nuevaCapital = leerNombre(scanner, "Ingrese la nueva capital del país: ");
          acciones.actualizar(nombreActualizar, nuevaCapital);
          break;

        case 4:
          // Eliminar país
          String nombreEliminar = leerNombre(scanner, "Ingrese el nombre del país a eliminar: ");
          acciones.eliminar(nombreEliminar);
          break;

        case 5:
          // Mostrar todos los países
          acciones.mostrarTodos();
          break;

        case 6:
          // Salir
          System.out.println("Saliendo del programa...");
          break;

        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
          break;
      }
    } while (opcion != 6);

    scanner.close();
  }

  // Método para leer y validar entradas de texto para nombres de países
  private static String leerNombre(Scanner scanner, String mensaje) {
    String input;
    do {
      System.out.print(mensaje);
      input = scanner.nextLine().trim();
      if (input.isEmpty()) {
        System.out.println("El nombre no puede estar vacío. Inténtelo de nuevo.");
      }
    } while (input.isEmpty());
    return input;
  }

}