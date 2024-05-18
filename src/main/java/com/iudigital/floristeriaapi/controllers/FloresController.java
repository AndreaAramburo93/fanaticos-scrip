package com.iudigital.floristeriaapi.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.iudigital.floristeriaapi.services.FloresService;


@Controller

public class FloresController {
  
  
  
    private  FloresService floresService;
 
  public FloresController (FloresService floresService){
      this.floresService=floresService;
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
  

}
