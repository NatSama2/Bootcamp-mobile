package com.juego;

import java.util.Scanner;

public class JuegoDados implements Juego {

  public static final String CYAN_COLOR = "\033[0;36m";
  public static final String GREEN_BOLD = "\033[1;32m";
  public static final String RED_BOLD = "\033[1;31m";
  public static final String YELLOW_BOLD = "\033[1;33m";
  public static final String RESET_COLOR = "\u001B[0m";

  private int dado1;
  private int dado2;
  private static String jugador1 = "";
  private static String jugador2 = "";
  private static Scanner scanner = new Scanner(System.in);

  // GETERS TEST

  public String getJugador1() {

    return jugador1;
  }

  public String getJugador2() {

    return jugador2;
  }

  @Override
  public void iniciar() {
    while (true) {
      System.out.println(GREEN_BOLD + "Ingrese el nombre del primer jugador" + RESET_COLOR);
      jugador1 = scanner.nextLine().trim();
      if (!jugador1.isEmpty() && jugador1.matches("[a-zA-Z]+")) {
        break;
      } else {
        System.out.println("Nombre no válido, por favor ingrese un nombre válido");
      }
    }

    while (true) {
      System.out.println(RED_BOLD + "Ingrese el nombre del segundo jugador" + RESET_COLOR);
      jugador2 = scanner.nextLine().trim();
      if (!jugador2.isEmpty() && jugador2.matches("[a-zA-Z]+")) {
        break;
      } else {
        System.out.println("Nombre no válido, por favor ingrese un nombre válido");
      }
    }
    System.out.println("Jugador 1: " + jugador1);
    System.out.println("Jugador 2: " + jugador2);
  }

  @Override
  public void jugar() {
    boolean seguirJugando = true;
    while (seguirJugando) {
      System.out.println(" " + CYAN_COLOR);
      System.out.println("******************************************************" + CYAN_COLOR);
      System.out.println("*                                                    *" + CYAN_COLOR);
      System.out.println("*                    Welcome to Dado                 *" + CYAN_COLOR);
      System.out.println("*                         Game                       *" + CYAN_COLOR);
      System.out.println("*                                                    *" + CYAN_COLOR);
      System.out.println("******************************************************\n" + CYAN_COLOR);
      System.out.print(RESET_COLOR);

      dado1 = 1 + (int) (Math.random() * 1000);
      dado2 = 1 + (int) (Math.random() * 1000);

      System.out.println(jugador1 + " obtuvo el siguiente valor: " + dado1);
      System.out.println(jugador2 + " obtuvo el siguiente valor: " + dado2);

      String respuesta;
      while (true) {
        System.out.println("¿Deseas jugar nuevamente? (si/no)");
        respuesta = scanner.nextLine().trim().toLowerCase();
        if (respuesta.equals("si") || respuesta.equals("no")) {
          break;
        } else {
          System.out.println("Respuesta no válida. Por favor, escribe 'si' o 'no'.");
        }
      }

      if (respuesta.equals("no")) {
        seguirJugando = false;
      }
    }
  }

  @Override
  public void finalizar() {
    if (dado1 > 1000 || dado1 < 1 || dado2 > 1000 || dado2 < 1) {
      System.out.println("Error: los valores están fuera del rango permitido.");
    }

    if (dado1 > dado2) {
      System.out.println(GREEN_BOLD + "GANASTE " + jugador1 + " con un valor de " + dado1 + RESET_COLOR);
    } else if (dado2 > dado1) {
      System.out.println(RED_BOLD + "GANASTE " + jugador2 + " con un valor de " + dado2 + RESET_COLOR);
    } else {
      System.out.println(
          YELLOW_BOLD + "Empataron con los siguientes valores: " + jugador1 + " = " + dado1 + " " + jugador2 + " = "
              + dado2 + RESET_COLOR);
    }

    scanner.close();
  }

}