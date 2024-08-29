package com.sprint;

import java.util.Date;

public class Administrativo extends Usuario {
  private String area;
  private String experienciaPrevia;

  // constructores

  public Administrativo() {
  }

  public Administrativo(String nombre, Date fechaNacimiento, int run, String area,
      String experienciaPrevia) {
    super(nombre, fechaNacimiento, run);
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

  @Override
  public String toString() {
    return "Administrativo{" +
        "area='" + area + '\'' +
        ", experienciaprevia='" + experienciaPrevia + '\'' +
        '}';
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