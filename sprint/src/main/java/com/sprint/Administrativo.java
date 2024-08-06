package com.sprint;

import java.util.Date;

public class Administrativo extends Usuario {
  private String area;
  private String experienciaPrevia;

  // constructores

  public Administrativo() {
  }

  public Administrativo(String nombre, Date fechaNacimiento, int run, int edad, String area, String experienciaPrevia) {
    super(nombre, fechaNacimiento, run, edad);
    this.area = area;
    this.experienciaPrevia = experienciaPrevia;
  }
  // getters y setters

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getExperienciaPrevia() {
    return experienciaPrevia;
  }

  public void setExperienciaPrevia(String experienciaPrevia) {
    this.experienciaPrevia = experienciaPrevia;
  }

  // metodo tostring

  @Override
  public String toString() {
    return super.toString() + ", Area: " + area + ", experiencia previa: " + experienciaPrevia;
  }

  @Override
  public void analizarUsuario() {
    super.analizarUsuario();
    System.out.println("Área: " + area + ", Experiencia Previa: " + experienciaPrevia);
  }

}

/*
 * Área: obligatorio, mínimo 5 caracteres, máximo 20
 * - Experiencia previa: máximo 100 caracteres
 */