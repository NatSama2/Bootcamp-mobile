package com.sprint;

public class Accidente {

  private int id;
  private int rut;
  private String dia;
  private String hora;
  private String lugar;
  private String origen;
  private String consecuencias;

  public Accidente() {
  }

  public Accidente(int id, int rut, String dia, String hora, String lugar, String origen, String consecuencias) {
    this.id = id;
    this.rut = rut;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.origen = origen;
    this.consecuencias = consecuencias;
  }

  @Override
  public String toString() {
    return "Accidente [id=" + id + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora + ", lugar=" + lugar
        + ", origen=" + origen + ", consecuencias=" + consecuencias + ", toString()=" + super.toString() + "]";
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

  public String getOrigen() {
    return origen;
  }

  public void setOrigen(String origen) {
    this.origen = origen;
  }

  public String getConsecuencias() {
    return consecuencias;
  }

  public void setConsecuencias(String consecuencias) {
    this.consecuencias = consecuencias;
  }

}

/*
 * Identificador del accidente: obligatorio, número interno manejado por la
 * compañía.
 * - RUT Cliente: obligatorio
 * - Día: fecha del accidente, independiente si lo declara como una fecha o un
 * String,
 * debe ser desplegado con el formato DD/MM/AAAA
 * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a
 * 23, minutos entre 0 y 59)
 * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
 * - Origen: máximo 100 caracteres
 * - Consecuencias: máximo 100 caracteres
 */