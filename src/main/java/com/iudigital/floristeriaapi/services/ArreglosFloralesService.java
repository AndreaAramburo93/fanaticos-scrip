package com.iudigital.floristeriaapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.floristeriaapi.models.ArreglosFloralesModel;
import com.iudigital.floristeriaapi.repositories.IArreglosFloralesRepository;

@Service
public class ArreglosFloralesService {

  @Autowired
  private IArreglosFloralesRepository arreglosFloralesRepository;

  // public ArreglosFloralesService(IArreglosFloralesRepository arreglosFloralesRepository){
  //   this.arreglosFloralesRepository = arreglosFloralesRepository;
  // }

  // public ArreglosFloralesModel saveArregloFloral(ArreglosFloralesModel arregloFloral) {
  //   return this.arreglosFloralesRepository.save(arregloFloral);
  // }

  // public ArreglosFloralesModel updateArregloFloral(ArreglosFloralesModel arregloFloral) {
  //   return arreglosFloralesRepository.save(arregloFloral);
  // }

  // public void deleteArregloFloralById(long id_arreglo_floral) {
  //   this.arreglosFloralesRepository.deleteById(id_arreglo_floral);
  // }

  // public ArreglosFloralesModel updateById(ArreglosFloralesModel arregloFloral, Integer id) {
  //   return this.arreglosFloralesRepository.save(arregloFloral);
  // }

  public List<ArreglosFloralesModel> getAllArreglosFlorales() {
    return this.arreglosFloralesRepository.findAll();
  }

  // public ArreglosFloralesModel getArregloFloralById(long id) {
  //   return this.arreglosFloralesRepository.findById(id).orElse(null);
  // }
}
