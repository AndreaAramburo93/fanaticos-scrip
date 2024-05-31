package com.iudigital.floristeriaapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "flores")
public class FloresModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private long id_flor;

  @Column(length = 100)
  private String nombre;

  @Column(length = 50)
  private String color;

  @Column(length = 50)
  private String variedad;

  @Column(nullable = false)
  private int cantidad_disponible;

  @Column(nullable = false)
  private double precio_compra;

  @Column(nullable = false)
  private double precio_venta;

  public long getId_flor() {
    return id_flor;
  }
  public void setIdFlor(long id_flor) {
    this.id_flor = id_flor;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getVariedad() {
    return variedad;
  }
  public void setVariedad(String variedad) {
    this.variedad = variedad;
  }
  public int getCantidad_disponible() {
    return cantidad_disponible;
  }
  public void setCantidad_disponible(int cantidad_disponible) {
    this.cantidad_disponible = cantidad_disponible;
  }
  public double getPrecio_compra() {
    return precio_compra;
  }
  public void setPrecio_compra(double precio_compra) {
    this.precio_compra = precio_compra;
  }
  public double getPrecio_venta() {
    return precio_venta;
  }
  public void setPrecio_venta(double precio_venta) {
    this.precio_venta = precio_venta;
  }
  
}
