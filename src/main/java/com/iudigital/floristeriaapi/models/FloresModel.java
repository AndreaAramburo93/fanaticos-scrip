package com.iudigital.floristeriaapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "flores")
public class FloresModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_flor;
  private String nombre;
  private String color;
  private String variedad;
  private int cantidad_disponible;
  private double precio_compra;
  private double precio_venta;

  public int getId_flor() {
    return id_flor;
  }
  public void setIdFlor(int id_flor) {
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
  public int getCantidadDisponible() {
    return cantidad_disponible;
  }
  public void setCantidadDisponible(int cantidad_disponible) {
    this.cantidad_disponible = cantidad_disponible;
  }
  public double getPrecioCompra() {
    return precio_compra;
  }
  public void setPrecioCompra(double precio_compra) {
    this.precio_compra = precio_compra;
  }
  public double getPrecioVenta() {
    return precio_venta;
  }
  public void setPrecioVenta(double precio_venta) {
    this.precio_venta = precio_venta;
  }
  
}
