package com.iudigital.floristeriaapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.iudigital.floristeriaapi.models.ArreglosFloralesModel;
import com.iudigital.floristeriaapi.models.FloresArreglosFloralesModel;
import com.iudigital.floristeriaapi.services.ArreglosFloralesService;
import com.iudigital.floristeriaapi.services.FloresArreglosFloralesService;
import com.iudigital.floristeriaapi.services.FloresService;

import com.iudigital.floristeriaapi.models.FloresModel;


@Controller
@RequestMapping("/arreglos-florales")
public class ArreglosFloralesController {
  @Autowired
  private ArreglosFloralesService arreglosFloralesService;

  @Autowired
  private FloresService floresService;

  @Autowired
  private FloresArreglosFloralesService floresArreglosFloralesService;

  @GetMapping("crear")
  public String createArreglosFlorales(Model model){
    try {
      List<ArreglosFloralesModel> arreglosFlorales = arreglosFloralesService.getAllArreglosFlorales();
      List<FloresModel> flores = floresService.getAllFlores();
      model.addAttribute("inventarioFlores", flores);
      model.addAttribute("arreglosFlorales",arreglosFlorales);
      return "/crear-arreglos";
    } catch (Exception e) {
      return "error";
    }
  }

  @GetMapping("listar")
  public String showArreglosFlorales(Model model){
    try {
      List<ArreglosFloralesModel> arreglosFlorales = arreglosFloralesService.getAllArreglosFlorales();
      for (ArreglosFloralesModel arreglo : arreglosFlorales) {
        List<FloresArreglosFloralesModel> floresArreglosFlorales = floresArreglosFloralesService.getFloresArreglosByArreglo(arreglo.getId_arreglo());
        arreglo.floresArreglosFlorales = floresArreglosFlorales;
      }
      model.addAttribute("arreglosFlorales",arreglosFlorales);
      return "/lista-arreglos";
    } catch (Exception e) {
      return "error";
    }
  }

  @PostMapping()
  @ResponseBody
  public ResponseEntity<ArreglosFloralesModel> saveAreglosFlorales(@RequestBody ArreglosFloralesModel arreglo) {
    ArreglosFloralesModel arregloGuardado = arreglosFloralesService.saveArregloFloral(arreglo);
    return ResponseEntity.ok().body(arregloGuardado);
  }
  
}
