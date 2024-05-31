package com.iudigital.floristeriaapi.models;
import jakarta.persistence.*;

@Entity
@Table(name = "flores_arreglos_florales")
public class FloresArreglosFloralesModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private long id_flores_arreglo;

  @ManyToOne
  @JoinColumn(name = "id_arreglo", referencedColumnName = "id_arreglo")
  private long id_arreglo;

  @ManyToOne
  @JoinColumn(name = "id_flor", referencedColumnName = "id_flor")
  private long id_flor;

  @Column(nullable = false)
  private int cantidad;

  // Getters and Setters
  public long getId_flores_arreglo() {
    return id_flores_arreglo;
  }

  public void setId_flores_arreglo(long id_flores_arreglo) {
    this.id_flores_arreglo = id_flores_arreglo;
  }

  public long getId_arreglo() {
    return id_arreglo;
  }

  public void setId_arreglo(long id_arreglo) {
    this.id_arreglo = id_arreglo;
  }

  public long getId_flor() {
    return id_flor;
  }

  public void setId_flor(long id_flor) {
    this.id_flor = id_flor;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
  
}
