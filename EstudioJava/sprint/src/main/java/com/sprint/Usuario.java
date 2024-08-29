package com.sprint;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public abstract class Usuario implements Asesoria {
    private String nombre;
    private Date fechaNacimiento;
    private int run;

    // constructores
    public Usuario() {

    }

    public Usuario(String nombre, Date fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
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

    // metodo to string

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run='" + run + '\'' +
                '}';
    }

    // otros metodos pedidos
    public String mostrarEdad() {
        LocalDate fechaNacimientoLocalDate = fechaNacimiento.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        LocalDate fechaActual = LocalDate.now();

        int edad = Period.between(fechaNacimientoLocalDate, fechaActual).getYears();
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