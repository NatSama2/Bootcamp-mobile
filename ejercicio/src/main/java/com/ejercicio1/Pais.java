package com.ejercicio1;

public class Pais {
  // ATRIBUTOS

  String nombre;
  String capital;

  // default o vacio
  public Pais() {
  }

  // Constructor parametros
  public Pais(String nombre, String capital) {

    this.nombre = nombre;
    this.capital = capital;
  }

  // get and set
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

  // imprimir
  @Override
  public String toString() {
    return "Pais{" + "nombre=" + nombre + ", capital=" + capital + '}';
  }

}