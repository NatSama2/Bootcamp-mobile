package com.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Acciones implements Bd {

  private List<Pais> listaPaises;
  Pais pais = new Pais();

  public Acciones() {
    this.listaPaises = new ArrayList<>();
  }

  @Override
  public void agregar(Pais pais) {

    // Convertir el nombre del nuevo país a minúsculas para comparación insensible a
    // mayúsculas/minúsculas
    String nombreNuevoPais = pais.getNombre().toLowerCase();

    // validar si el pais existe en la lista
    for (Pais p : listaPaises) {
      if (p.getNombre().toLowerCase().equals(nombreNuevoPais)) {
        System.out.println("El pais ya existe en la lista");
        return;
      }
    }
    listaPaises.add(pais);
    System.out.println("El pais esta Agregado exitosamente");

  }

  @Override
  public Pais buscar(String nombre) {
    String nombreBuscado = pais.getNombre().toLowerCase();

    // buscar el pais en la lista
    for (Pais p : listaPaises) {
      if (p.getNombre().toLowerCase().equals(nombreBuscado)) {
        return p;
      }

    }

    System.out.println("Pais no encontrado");
    return null;

  }

  @Override
  public void actualizar(String nombre, String nuevaCapital) {
    // Buscar el país y actualizar su capital
    // foreach
    for (Pais p : listaPaises) {

      if (p.getNombre().equals(nombre)) {
        p.setCapital(nuevaCapital);
        System.out.println("Pais Actualizado Correctamente");
        return;
      }

    }
    System.out.println("Pais no encontrado");

  }

  @Override
  public void eliminar(String nombre) {
    // Buscar y eliminar el país de la lista

    for (Pais p : listaPaises) {
      if (p.getNombre().equals(nombre)) {
        listaPaises.remove(p);
        System.out.println("Pais Eliminado Exitosamente");
        return;
      }
    }
    System.out.println("Pais No Encontrado");
  }

  public void mostrarTodos() {

    for (Pais p : listaPaises) {
      System.out.println("p");
    }

  }

}
