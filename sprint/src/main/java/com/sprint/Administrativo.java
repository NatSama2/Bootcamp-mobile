package com.sprint;

public class Administrativo extends Usuario {

  private String area;
  private String experiencia;

  public Administrativo(String area, String experiencia) {
    this.area = area;
    this.experiencia = experiencia;
  }

  public Administrativo() {

  }

  @Override
  public String toString() {
    return "Administrativo [area=" + area + ", experiencia=" + experiencia + ", toString()=" + super.toString()
        + "]";
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(String experiencia) {
    this.experiencia = experiencia;
  }

}

/*
 * Área: obligatorio, mínimo 5 caracteres, máximo 20
 * - Experiencia previa: máximo 100 caracteres
 */