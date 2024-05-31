package com.iudigital.floristeriaapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.floristeriaapi.repositories.IFloresArreglosFloralesRepository;

@Service
public class FloresArreglosFloralesService {

  @Autowired
  private IFloresArreglosFloralesRepository floresArreglosFloralesRepository;
}
