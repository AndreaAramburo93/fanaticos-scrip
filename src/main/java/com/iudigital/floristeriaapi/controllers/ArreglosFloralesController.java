package com.iudigital.floristeriaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.iudigital.floristeriaapi.models.ArreglosFloralesModel;
import com.iudigital.floristeriaapi.services.ArreglosFloralesService;

@RestController
@RequestMapping("/arreglos-florales")
public class ArreglosFloralesController {
  @Autowired
  private ArreglosFloralesService arreglosFloralesService;

  @GetMapping()
  public String showArreglosFlorales(Model model){
    try {
      List<ArreglosFloralesModel> arreglosFlorales = arreglosFloralesService.getAllArreglosFlorales();
      model.addAttribute("arreglosFlorales",arreglosFlorales);
      System.out.println("arreglosFlorales");
      System.out.println(arreglosFlorales);
      // model.addAttribute("title", "Arreglos Florales");
      return "arreglos";
    } catch (Exception e) {
      return "error";
    }
  }
}
