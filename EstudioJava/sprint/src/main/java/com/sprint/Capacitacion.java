package com.sprint;

public class Capacitacion {
  private int identificador;
  private String rutCliente;
  private String dia;
  private String hora;
  private String lugar;
  private String duracion;
  private int cantidadAsistentes;

  // constructores

  public Capacitacion() {
  }

  public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duracion,
      int cantidadAsistentes) {
    this.identificador = identificador;
    this.rutCliente = rutCliente;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.duracion = duracion;
    this.cantidadAsistentes = cantidadAsistentes;
  }

  // getters y setters

  public int getIdentificador() {
    return identificador;
  }

  public void setIdentificador(int identificador) {
    this.identificador = identificador;
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

  public String getDuracion() {
    return duracion;
  }

  public void setDuracion(String duracion) {
    this.duracion = duracion;
  }

  public int getCantidadAsistentes() {
    return cantidadAsistentes;
  }

  public void setCantidadAsistentes(int cantidadAsistentes) {
    this.cantidadAsistentes = cantidadAsistentes;
  }

  // metodo to string

  @Override
  public String toString() {
    return "Capacitacion{" +
        "identificador=" + identificador +
        ", rutCliente='" + rutCliente + '\'' +
        ", dia='" + dia + '\'' +
        ", hora='" + hora + '\'' +
        ", Lugar='" + lugar + '\'' +
        ", duracion='" + duracion + '\'' +
        ", cantidadAsistentes=" + cantidadAsistentes +
        '}';
  }

  // metodo adicional
  public String mostrarDetalle() {
    return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia +
        " y durará " + duracion + " minutos";
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