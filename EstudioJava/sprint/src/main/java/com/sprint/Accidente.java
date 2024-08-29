package com.sprint;

public class Accidente {
  private int identificadorAccidente;
  private String rutCliente;
  private String dia; // Formato DD/MM/AAAA
  private String hora; // Formato HH:MM
  private String lugar;
  private String origen;
  private String consecuencias;

  public Accidente() {
  }

  public Accidente(int identificadorAccidente, String rutCliente, String dia, String hora,
      String lugar, String origen, String consecuencias) {
    this.identificadorAccidente = identificadorAccidente;
    this.rutCliente = rutCliente;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.origen = origen;
    this.consecuencias = consecuencias;
  }

  // Métodos accesores y mutadores
  public int getIdentificadorAccidente() {
    return identificadorAccidente;
  }

  public void setIdentificadorAccidente(int identificadorAccidente) {
    this.identificadorAccidente = identificadorAccidente;
  }

  public String getRutCliente() {
    return rutCliente;
  }

  public void setRutCliente(String rutCliente) {
    this.rutCliente = rutCliente;
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

  @Override
  public String toString() {
    return "Identificador del Accidente: " + identificadorAccidente + ", RUT Cliente: " + rutCliente +
        ", Día: " + dia + ", Hora: " + hora + ", Lugar: " + lugar + ", Origen: " + origen +
        ", Consecuencias: " + consecuencias;
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