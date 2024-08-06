package com.sprint;

public class VisitaEnTerreno {
  private int identificadorVisita;
  private String rutCliente;
  private String dia; // Formato DD/MM/AAAA
  private String hora; // Formato HH:MM
  private String lugar;
  private String comentarios;

  public VisitaEnTerreno() {
  }

  public VisitaEnTerreno(int identificadorVisita, String rutCliente, String dia, String hora,
      String lugar, String comentarios) {
    this.identificadorVisita = identificadorVisita;
    this.rutCliente = rutCliente;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.comentarios = comentarios;
  }

  // Métodos accesores y mutadores
  public int getIdentificadorVisita() {
    return identificadorVisita;
  }

  public void setIdentificadorVisita(int identificadorVisita) {
    this.identificadorVisita = identificadorVisita;
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

  public String getComentarios() {
    return comentarios;
  }

  public void setComentarios(String comentarios) {
    this.comentarios = comentarios;
  }

  @Override
  public String toString() {
    return "Identificador de la Visita: " + identificadorVisita + ", RUT Cliente: " + rutCliente +
        ", Día: " + dia + ", Hora: " + hora + ", Lugar: " + lugar + ", Comentarios: " + comentarios;
  }
}

/*
 * Identificador de la revisión: obligatorio, número interno manejado por la
 * compañía.
 * - Identificador de la visita en terreno: obligatorio, número de la vista a la
 * que se
 * asóciala revisión.
 * 
 * - Nombre alusivo a la revisión: obligatorio, mínimo 10 caracteres, máximo 50
 * - Detalle para revisar: máximo 100 caracteres
 * - Estado: 1 (sin problemas), 2 (con observaciones), 3 (no aprueba), solo se
 * pueden ingresar los valores antes indicados.
 */