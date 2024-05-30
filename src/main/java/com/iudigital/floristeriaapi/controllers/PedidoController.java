package com.iudigital.floristeriaapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.iudigital.floristeriaapi.models.PedidoModel;
import com.iudigital.floristeriaapi.services.PedidosService;







@Controller
public class PedidoController {
    
    private PedidosService pedidosService;

    public PedidoController (PedidosService pedidosService){
        this.pedidosService=pedidosService;
    }
    
    @GetMapping("/totalpedidos")
    public String showPedido (Model model){
    try {
        List <PedidoModel> pedido= pedidosService.getAllPedidos();
        model.addAttribute("pedidosParaInventario",pedido);
        return "/totalpedidos";
    } catch (Exception e){
            return "error";
        }
    }

    @PostMapping("/guardarpedido")
    public String savePedido (@ModelAttribute PedidoModel pedido){
        this.pedidosService.savePedido(pedido);
        return "redirect/totalpedido";
    }

    @GetMapping(path ="/{id}")
    public Optional <PedidoModel> getPedidoById (@PathVariable("id") long id){
        return this.pedidosService.getPedidoById(id);
    }

    @PutMapping(path = "/{id}")
    public PedidoModel updateById (@RequestBody PedidoModel pedido, @PathVariable("id") Long id){
        return this.pedidosService.updateById(pedido, id);
    }

    @DeleteMapping (path ="/eliminarpedido/{id}")
    public String deletePedido (@PathVariable ("id")Long id){
        boolean ok = this.pedidosService.deletePedido(id);
        if (ok) return "redirect/totalpedidos";
        else return "error";
    }

    // @GetMapping({"/pedido","/"})
    // public String crearPedido() {
    //     return "crear-pedido";
    // }
    // @GetMapping("/arreglos")
    // public String mostrarArreglos() {
    //     return "arreglos";  
    // }

    // @GetMapping("/entregas")
    // public String mostrarEntregas() {
    //     return "entregas";  
    // }

    // @GetMapping("/finanzas")
    // public String mostrarFinanzas() {
    //     return "finanzas";  
    // }

    // @GetMapping("/informes")
    // public String mostrarInformes() {
    //     return "informes";  
    // }
  

}




