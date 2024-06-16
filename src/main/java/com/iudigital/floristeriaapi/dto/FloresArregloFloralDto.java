package com.iudigital.floristeriaapi.dto;

public class FloresArregloFloralDto {
  private Long idFlor;
  private Long idArreglo;
  private int cantidad;
  
  public Long getIdFlor() {
    return idFlor;
  }
  public void setIdFlor(Long idFlor) {
    this.idFlor = idFlor;
  }
  public Long getIdArreglo() {
    return idArreglo;
  }
  public void setIdArreglo(Long idArreglo) {
    this.idArreglo = idArreglo;
  }
  public int getCantidad() {
    return cantidad;
  }
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
  
}
