// package com.iudigital.floristeriaapi.controllers;
// import java.util.List;
// import java.util.Optional;
// import com.iudigital.floristeriaapi.models.FloresModel;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;
// import com.iudigital.floristeriaapi.services.FloresService;

// @RestController
// @RequestMapping("/flores")
// public class FloresController {
  
//   @Autowired
//   private  FloresService floresService;

//   @GetMapping("/inventario")
//   public String showFlores(Model model){
//     try {
//       List<FloresModel> flores = floresService.getAllFlores();
//       model.addAttribute("floresParaInventario",flores);
//       return "/inventario";
//     } catch (Exception e) {
//       return "error";
//     }
//   }

//     @GetMapping("/")
//     public String inicio() {
//         return "index";
//     }

//   @GetMapping("/eliminarflor/{id_flor}")
//   public String deleteFlor(@PathVariable("id_flor") Long id_flor){
//       floresService.deleteFlorById(id_flor);
//       return "redirect:/inventario";
//   }
  
//   @GetMapping(path = "/{id}")
//   public Optional<FloresModel> getFlorById(@PathVariable("id") long id) {
//     return this.floresService.getFlorById(id);
//   }

//   @PutMapping(path = "/{id}")
//   public FloresModel updateById(@RequestBody FloresModel flor, @PathVariable("id") Integer id) {
//     return this.floresService.updateById(flor, id);
//   }

//   @GetMapping({"/flor","/"})
//   public String crearFlor() {
//       return "crear-flor";
//   }
// }
// @Controller

// public class FloresController {
 
//     @GetMapping("/entregas")
//     public String mostrarEntregas() {
//         return "entregas";  
//     }

//     @GetMapping("/finanzas")
//     public String mostrarFinanzas() {
//         return "finanzas";  
//     }

//     @GetMapping("/informes")
//     public String mostrarInformes() {
//         return "informes";  
//     } 
// }