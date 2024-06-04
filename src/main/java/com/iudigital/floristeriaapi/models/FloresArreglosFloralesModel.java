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
  private ArreglosFloralesModel id_arreglo;

  @ManyToOne(fetch = FetchType.LAZY)
  private FloresModel id_flor;

  public long getId_flores_arreglo() {
    return id_flores_arreglo;
  }

  public void setId_flores_arreglo(long id_flores_arreglo) {
    this.id_flores_arreglo = id_flores_arreglo;
  }

  public ArreglosFloralesModel getId_arreglo() {
    return id_arreglo;
  }

  public void setId_arreglo(ArreglosFloralesModel id_arreglo) {
    this.id_arreglo = id_arreglo;
  }

  public FloresModel getId_flor() {
    return id_flor;
  }

  public void setId_flor(FloresModel id_flor) {
    this.id_flor = id_flor;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  @Column(nullable = false)
  private int cantidad;
}
