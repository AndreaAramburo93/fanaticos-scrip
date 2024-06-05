package com.iudigital.floristeriaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.iudigital.floristeriaapi.models.ArreglosFloralesModel;
import com.iudigital.floristeriaapi.services.ArreglosFloralesService;
import com.iudigital.floristeriaapi.services.FloresService;
import com.iudigital.floristeriaapi.models.FloresModel;

@Controller
@RequestMapping("/arreglos-florales")
public class ArreglosFloralesController {
  @Autowired
  private ArreglosFloralesService arreglosFloralesService;

  @Autowired
  private FloresService floresService;

  @GetMapping()
  public String showArreglosFlorales(Model model){
    try {
      List<ArreglosFloralesModel> arreglosFlorales = arreglosFloralesService.getAllArreglosFlorales();
      List<FloresModel> flores = floresService.getAllFlores();
      System.out.println("aquiii");
      System.out.println(flores);
      model.addAttribute("inventarioFlores", flores);
      model.addAttribute("arreglosFlorales",arreglosFlorales);
      // model.addAttribute("title", "Arreglos Florales");
      return "/arreglos";
    } catch (Exception e) {
      return "error";
    }
  }
}
