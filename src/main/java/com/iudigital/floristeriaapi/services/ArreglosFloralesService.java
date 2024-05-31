package com.iudigital.floristeriaapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.floristeriaapi.models.ArreglosFloralesModel;
import com.iudigital.floristeriaapi.repositories.IArreglosFloralesRepository;

@Service
public class ArreglosFloralesService {

  @Autowired
  private IArreglosFloralesRepository arreglosFloralesRepository;

  public ArreglosFloralesService(IArreglosFloralesRepository arreglosFloralesRepository){
    this.arreglosFloralesRepository = arreglosFloralesRepository;
  }

  public ArreglosFloralesModel saveArregloFloral(ArreglosFloralesModel arregloFloral) {
    return this.arreglosFloralesRepository.save(arregloFloral);
  }

}
