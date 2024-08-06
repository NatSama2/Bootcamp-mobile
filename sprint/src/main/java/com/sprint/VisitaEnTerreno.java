package com.sprint;

public class VisitaEnTerreno {

  private int idrev;
  private int idvisita;
  private String nombrerev;
  private String detalle;
  private int estado;

  public VisitaEnTerreno(int idrev, int idvisita, String nombrerev, String detalle, int estado) {
    this.idrev = idrev;
    this.idvisita = idvisita;
    this.nombrerev = nombrerev;
    this.detalle = detalle;
    this.estado = estado;
  }

  public VisitaEnTerreno() {

  }

  @Override
  public String toString() {
    return "VisitaEnTerreno [idrev=" + idrev + ", idvisita=" + idvisita + ", nombrerev=" + nombrerev + ", detalle="
        + detalle + ", estado=" + estado + ", toString()=" + super.toString() + "]";
  }

  public int getIdrev() {
    return idrev;
  }

  public void setIdrev(int idrev) {
    this.idrev = idrev;
  }

  public int getIdvisita() {
    return idvisita;
  }

  public void setIdvisita(int idvisita) {
    this.idvisita = idvisita;
  }

  public String getNombrerev() {
    return nombrerev;
  }

  public void setNombrerev(String nombrerev) {
    this.nombrerev = nombrerev;
  }

  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
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