package com.sprint;

public class Profesional extends Usuario {

  private String titulo;
  private String ingreso;

  public Profesional(String titulo, String ingreso) {
    this.titulo = titulo;
    this.ingreso = ingreso;
  }

  public Profesional() {
  }

  @Override
  public String toString() {
    return "Profesional [titulo=" + titulo + ", ingreso=" + ingreso + ", toString()=" + super.toString() + "]";
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getIngreso() {
    return ingreso;
  }

  public void setIngreso(String ingreso) {
    this.ingreso = ingreso;
  }
}

/*
 * Título: obligatorio, mínimo 10 caracteres, máximo 50
 * - Fecha de ingreso: independiente si lo declara como una fecha o un String,
 * debe
 * ser desplegado con el formato DD/MM/AAAA
 */