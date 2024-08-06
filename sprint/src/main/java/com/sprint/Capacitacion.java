package com.sprint;

public class Capacitacion {

  private int id;
  private int rut;

  private String dia;
  private String hora;
  private String lugar;
  private String duracion;
  private int cantidad;

  @Override
  public String toString() {
    return "Capacitacion [id=" + id + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
        + ", duracion=" + duracion + ", cantidad=" + cantidad + ", toString()=" + super.toString() + "]";
  }

  public Capacitacion(int id, int rut, String dia, String hora, String lugar, String duracion, int cantidad) {
    this.id = id;
    this.rut = rut;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.duracion = duracion;
    this.cantidad = cantidad;
  }

  public Capacitacion() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getRut() {
    return rut;
  }

  public void setRut(int rut) {
    this.rut = rut;
  }

  public String getDia() {
    return dia;
  }

  public void setDia(String dia) {
    this.dia = dia;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public String getLugar() {
    return lugar;
  }

  public void setLugar(String lugar) {
    this.lugar = lugar;
  }

  public String getDuracion() {
    return duracion;
  }

  public void setDuracion(String duracion) {
    this.duracion = duracion;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

}

/*
 * Identificador: obligatorio, número interno de la capacitación manejado por la
 * empresa
 * - RUT cliente: obligatorio
 * - Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y
 * “Domingo”
 * (en ese formato)
 * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a
 * 23, minutos entre 0 y 59)
 * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
 * - Duración: máximo 70 caracteres
 * - Cantidad de asistentes: obligatorio, número entero menor que 1000
 */