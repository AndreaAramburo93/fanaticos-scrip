package com.iudigital.floristeriaapi.models;
import jakarta.persistence.*;

@Entity
@Table(name = "flores_arreglos_florales")
public class FloresArreglosFloralesModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private long id_flores_arreglo;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_arreglo")
  private ArreglosFloralesModel arreglo;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_flor")
  private FloresModel flor;

  @Column(nullable = false)
  private int cantidad;

  public long getId_flores_arreglo() {
    return id_flores_arreglo;
  }

  public void setId_flores_arreglo(long id_flores_arreglo) {
    this.id_flores_arreglo = id_flores_arreglo;
  }

  public ArreglosFloralesModel getArreglo() {
    return arreglo;
  }

  public void setArreglo(ArreglosFloralesModel id_arreglo) {
    this.arreglo = id_arreglo;
  }

  public FloresModel getFlor() {
    return flor;
  }

  public void setFlor(FloresModel id_flor) {
    this.flor = id_flor;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
}
