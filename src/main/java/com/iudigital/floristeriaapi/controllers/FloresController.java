package com.iudigital.floristeriaapi.controllers;
import java.util.List;
import java.util.Optional;
import com.iudigital.floristeriaapi.models.FloresModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.iudigital.floristeriaapi.services.FloresService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class FloresController {
  
  
  
    private  FloresService floresService;
 
  public FloresController (FloresService floresService){
      this.floresService=floresService;
  }
  @GetMapping("/inventario")

  public String showFlores(Model model){
    try {
      List<FloresModel> flores = floresService.getAllFlores();
      model.addAttribute("floresParaInventario",flores);
      return "/inventario";
    } catch (Exception e) {
      return "error";
    }
  }

  
  @PostMapping("/guardarflor")
  public String saveFlor(@ModelAttribute FloresModel flor) {
    this.floresService.saveFlor(flor);
    return "redirect:/inventario";
  }
  @GetMapping(path = "/{id}")
  public Optional<FloresModel> getFlorById(@PathVariable("id") long id) {
    return this.floresService.getFlorById(id);
  }

  @PutMapping(path = "/{id}")
  public FloresModel updateById(@RequestBody FloresModel flor, @PathVariable("id") Integer id) {
    return this.floresService.updateById(flor, id);
  }

  @DeleteMapping(path = "/eliminarflor/{id}")
  public String deleteFlor(@PathVariable("id") Integer id) {
    boolean ok = this.floresService.deleteFlor(id);
    if (ok) return "redirect:/inventario";
    else return "error";
  }

  @GetMapping({"/flor","/"})
  public String crearFlor() {
      return "crear-flor";
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
