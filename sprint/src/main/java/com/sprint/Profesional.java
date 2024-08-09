package com.sprint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesional extends Usuario {
  private String titulo;
  private Date fechaIngreso;

  // contructores
  public Profesional() {
  }

  public Profesional(String nombre, Date fechaNacimiento, int run, String titulo, Date fechaIngreso) {
    super(nombre, fechaNacimiento, run);
    this.titulo = titulo;
    this.fechaIngreso = fechaIngreso;
  }

  // getters y setters

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Date getFechaIngreso() {
    return fechaIngreso;
  }

  public void setFechaIngreso(Date fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  @Override
  public String toString() {
    return "Profesional{" +
        "titulo='" + titulo + '\'' +
        ", fechaingreso='" + fechaIngreso + '\'' +
        '}';
  }

  @Override
  public void analizarUsuario() {
    super.analizarUsuario();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Título: " + titulo + ", Fecha de Ingreso: " + sdf.format(fechaIngreso));
  }
}

/*
 * Título: obligatorio, mínimo 10 caracteres, máximo 50
 * - Fecha de ingreso: independiente si lo declara como una fecha o un String,
 * debe
 * ser desplegado con el formato DD/MM/AAAA
 */