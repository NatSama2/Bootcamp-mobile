package com.sprint;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
  private List<Asesoria> asesorias = new ArrayList<>();
  private List<Capacitacion> capacitaciones = new ArrayList<>();

  // Método para agregar un cliente
  public void almacenarCliente(Cliente cliente) {
    asesorias.add(cliente);
  }

  // Método para agregar un profesional
  public void almacenarProfesional(Profesional profesional) {
    asesorias.add(profesional);
  }

  // Método para agregar un administrativo
  public void almacenarAdministrativo(Administrativo administrativo) {
    asesorias.add(administrativo);
  }

  // Método para agregar una capacitación
  public void almacenarCapacitacion(Capacitacion capacitacion) {
    capacitaciones.add(capacitacion);
  }

  // Método para eliminar un usuario por RUN
  public void eliminarUsuario(int run) {
    asesorias.removeIf(usuario -> ((Usuario) usuario).getRun() == run);
  }

  // Otros métodos...

  public void listarUsuarios() {
    // asesorias.forEach(usuario -> {
    // if (usuario instanceof Usuario) {
    // System.out.println(usuario);
    // }
    // });
    for (Asesoria asesoria : asesorias) {
      asesoria.analizarUsuario();
    }
  }

  // public void listarUsuariosPorTipo(Class<? extends Usuario> tipo) {
  // asesorias.forEach(usuario -> {
  // if (tipo.isInstance(usuario)) {
  // System.out.println(usuario);
  // }
  // });
  // }

  public void listarUsuariosPorTipo(Class<?> tipo) {
    for (Asesoria asesoria : asesorias) {
      if (tipo.isInstance(asesoria)) {
        asesoria.analizarUsuario();
      }
    }
  }

  public void listarCapacitaciones() {
    // capacitaciones.forEach(capacitacion -> {
    // System.out.println(capacitacion);
    // });
    for (Capacitacion capacitacion : capacitaciones) {
      System.out.println(capacitacion.mostrarDetalle());
    }
  }
}
