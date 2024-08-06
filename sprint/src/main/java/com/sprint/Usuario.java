package com.sprint;

import java.util.Date;

public abstract class Usuario implements Asesoria {
    private String nombre;
    private Date fechaNacimiento;
    private int run;
    private int edad;

    // constructores
    public Usuario() {

    }

    public Usuario(String nombre, Date fechaNacimiento, int run, int edad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.edad = edad;
    }

    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // metodo to string

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run='" + run + '\'' +
                ", edad=" + edad +
                '}';
    }

    // otros metodos pedidos
    public String mostrarEdad() {
        return "El usuario tiene: " + edad + "años";
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre + ", run: " + run);
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