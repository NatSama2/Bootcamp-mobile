package com.sprint;

public class Revision {
  private int identificadorRevision;
  private int identificadorVisita;
  private String nombreRevision;
  private String detalleRevisar;
  private int estado; // 1 (sin problemas), 2 (con observaciones), 3 (no aprueba)

  public Revision() {
  }

  public Revision(int identificadorRevisión, int identificadorVisita, String nombreRevisión,
      String detalleRevisar, int estado) {
    this.identificadorRevision = identificadorRevisión;
    this.identificadorVisita = identificadorVisita;
    this.nombreRevision = nombreRevisión;
    this.detalleRevisar = detalleRevisar;
    this.estado = estado;
  }

  // Métodos accesores y mutadores
  public int getIdentificadorRevision() {
    return identificadorRevision;
  }

  public void setIdentificadorRevision(int identificadorRevisión) {
    this.identificadorRevision = identificadorRevisión;
  }

  public int getIdentificadorVisita() {
    return identificadorVisita;
  }

  public void setIdentificadorVisita(int identificadorVisita) {
    this.identificadorVisita = identificadorVisita;
  }

  public String getNombreRevision() {
    return nombreRevision;
  }

  public void setNombreRevision(String nombreRevisión) {
    this.nombreRevision = nombreRevisión;
  }

  public String getDetalleRevisar() {
    return detalleRevisar;
  }

  public void setDetalleRevisar(String detalleRevisar) {
    this.detalleRevisar = detalleRevisar;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return "Identificador de la Revisión: " + identificadorRevision + ", Identificador de la Visita: "
        + identificadorVisita +
        ", Nombre: " + nombreRevision + ", Detalle: " + detalleRevisar + ", Estado: " + estado;
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