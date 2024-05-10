package com.iudigital.floristeriaapi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.iudigital.floristeriaapi.models.FloresModel;
import com.iudigital.floristeriaapi.services.FloresService;



@Controller

public class FloresController {
  
  @GetMapping({"/index","/"})
  public String index() {
      return "index";
  }
  @GetMapping("/inventario")
  public String mostrarInventario() {
      return "inventario";
  }
   @GetMapping("/pedidos")
    public String mostrarPedidos() {
        return "pedidos";  
    }

    @GetMapping("/arreglos")
    public String mostrarArreglos() {
        return "arreglos";  
    }

    @GetMapping("/entregas")
    public String mostrarEntregas() {
        return "entregas";  
    }

    @GetMapping("/finanzas")
    public String mostrarFinanzas() {
        return "finanzas";  
    }

    @GetMapping("/informes")
    public String mostrarInformes() {
        return "informes";  
    }
  

  
  @Autowired
  private FloresService floresService;

  @GetMapping
  public ArrayList<FloresModel> getFlores() {
    return this.floresService.getFlores();
  }

  @GetMapping(path = "/{id}")
  public Optional<FloresModel> getFlorById(@PathVariable("id") Integer id) {
    return this.floresService.getFlorById(id);
  }

  @PostMapping
  public FloresModel saveFlor(@RequestBody FloresModel flor) {
    return this.floresService.saveFlor(flor);
  }

  @PutMapping(path = "/{id}")
  public FloresModel updateById(@RequestBody FloresModel flor, @PathVariable("id") Integer id) {
    return this.floresService.updateById(flor, id);
  }

  @DeleteMapping(path = "/{id}")
  public String deleteFlor(@PathVariable("id") Integer id) {
    boolean ok = this.floresService.deleteFlor(id);
    if (ok) return "Se eliminó la flor con id " + id;
    else return "No se pudo eliminar la flor con id " + id;
  }
}
