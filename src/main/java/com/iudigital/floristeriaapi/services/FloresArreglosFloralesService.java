package com.iudigital.floristeriaapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.floristeriaapi.models.FloresArreglosFloralesModel;
import com.iudigital.floristeriaapi.repositories.IFloresArreglosFloralesRepository;

@Service
public class FloresArreglosFloralesService {

  @Autowired
  private IFloresArreglosFloralesRepository floresArreglosFloralesRepository;

  public FloresArreglosFloralesService(IFloresArreglosFloralesRepository floresArreglosFloralesRepository){
    this.floresArreglosFloralesRepository = floresArreglosFloralesRepository;
  }

  public List<FloresArreglosFloralesModel> saveAllFloresArreglos(List<FloresArreglosFloralesModel> floresArreglosFlorales) {
    return this.floresArreglosFloralesRepository.saveAll(floresArreglosFlorales);
  }

  public List<FloresArreglosFloralesModel> getFloresArreglosByArreglo(Long idArreglo) {
    return this.floresArreglosFloralesRepository.findByArregloId(idArreglo);
  }
}
