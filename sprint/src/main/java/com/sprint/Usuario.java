package com.sprint;

public class Usuario {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private String nombre;
    private String nacimiento;
    private String run;

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", nacimiento=" + nacimiento + ", run=" + run + ", toString()="
                + super.toString() + "]";
    }

    public Usuario(String nombre, String nacimiento, String run) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.run = run;
    }

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

}

/*
 * Usuario:
 * - Nombre: obligatorio, mínimo 10 caracteres, máximo 50
 * - Fecha de nacimiento: obligatorio, independiente si lo declara como una
 * fecha o
 * string, debe ser desplegado con el formato DD/MM/AAAA
 * - RUN: corresponde a un número menor a 99.999.999
 */