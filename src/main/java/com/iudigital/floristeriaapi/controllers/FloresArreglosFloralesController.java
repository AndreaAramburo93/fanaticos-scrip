package com.iudigital.floristeriaapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.iudigital.floristeriaapi.dto.FloresArregloFloralDto;
import com.iudigital.floristeriaapi.models.ArreglosFloralesModel;
import com.iudigital.floristeriaapi.models.FloresArreglosFloralesModel;
import com.iudigital.floristeriaapi.models.FloresModel;
import com.iudigital.floristeriaapi.services.ArreglosFloralesService;
import com.iudigital.floristeriaapi.services.FloresArreglosFloralesService;
import com.iudigital.floristeriaapi.services.FloresService;


@Controller
@RequestMapping("/flores-arreglos-florales")
public class FloresArreglosFloralesController {

  @Autowired
  private FloresArreglosFloralesService floresArreglosFloralesService;

  @Autowired
  private ArreglosFloralesService arreglosFloralesService;

  @Autowired
  private FloresService floresService;
  

  @PostMapping()
  public String saveAllFloresArreglos(@RequestBody List<FloresArregloFloralDto> floresArreglosFlorales) {
    List<FloresArreglosFloralesModel> guardarFloresArreglo = new ArrayList<>();
    for (FloresArregloFloralDto floresArregloFloral : floresArreglosFlorales) {
      FloresModel flor = floresService.getFlorById(floresArregloFloral.getIdFlor()).get();
      ArreglosFloralesModel arreglo = arreglosFloralesService.getArregloFloralById(floresArregloFloral.getIdArreglo()).get();
      FloresArreglosFloralesModel floresArreglo = new FloresArreglosFloralesModel();
      floresArreglo.setArreglo(arreglo);
      floresArreglo.setFlor(flor);
      floresArreglo.setCantidad(floresArregloFloral.getCantidad());
      guardarFloresArreglo.add(floresArreglo);
    }
    List<FloresArreglosFloralesModel> floresArregloGuardado = floresArreglosFloralesService.saveAllFloresArreglos(guardarFloresArreglo);
    System.out.println(floresArregloGuardado);
    return "redirect:/arreglos-florales/listar";
  }
}
