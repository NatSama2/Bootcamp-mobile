package com.sprint;

public class Cliente extends Usuario {
  private String rut;
  private String nombres;
  private String apellidos;
  private String telefono;
  private String afp;
  private int salud;
  private String direccion;
  private String comuna;
  private int edad;

  @Override
  public String toString() {
    return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
        + ", afp=" + afp + ", salud=" + salud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad="
        + edad + ", toString()=" + super.toString() + "]";
  }

  public Cliente(String rut, String nombres, String apellidos, String telefono, String afp, int salud,
      String direccion, String comuna, int edad) {
    this.rut = rut;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.afp = afp;
    this.salud = salud;
    this.direccion = direccion;
    this.comuna = comuna;
    this.edad = edad;
  }

  public Cliente() {
  }

  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getAfp() {
    return afp;
  }

  public void setAfp(String afp) {
    this.afp = afp;
  }

  public int getSalud() {
    return salud;
  }

  public void setSalud(int salud) {
    this.salud = salud;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getComuna() {
    return comuna;
  }

  public void setComuna(String comuna) {
    this.comuna = comuna;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

}

/*
 * Cliente:
 * - RUT: corresponde a un número menor a 99.999.999
 * - Nombres: obligatorio, mínimo 5 caracteres, máximo 30
 * - Apellidos: obligatorio, mínimo 5 caracteres, máximo 30
 * - Teléfono: obligatorio
 * - AFP: mínimo 4 caracteres, máximo 30
 * - Sistema de salud: 1 (Fonasa) o 2 (Isapre), debe ser solo una de las dos
 * opciones
 * indicadas
 * 
 * - Dirección: máximo 70 caracteres
 * - Comuna: máximo 50 caracteres
 * - Edad: obligatorio, número mayor o igual a cero, y menor a 150
 */