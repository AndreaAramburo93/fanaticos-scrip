package com.iudigital.floristeriaapi.models;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "arreglos_florales")
public class ArreglosFloralesModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private long id_arreglo;

  @Column(length = 200)
  private String descripcion;

  @Column(nullable = false)
  private double precio;

  @OneToMany(mappedBy = "id_arreglo", fetch = FetchType.LAZY)
  List<FloresArreglosFloralesModel> floresArreglosFlorales;

  // Getters and Setters
  public long getId_arreglo() {
    return id_arreglo;
  }

  public void setId_arreglo(long id_arreglo) {
    this.id_arreglo = id_arreglo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

}
