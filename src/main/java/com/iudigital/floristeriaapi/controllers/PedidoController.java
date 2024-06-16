package com.iudigital.floristeriaapi.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.stereotype.Controller;
=======
>>>>>>> development
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iudigital.floristeriaapi.models.ArreglosFloralesModel;
import com.iudigital.floristeriaapi.models.FloresModel;
import com.iudigital.floristeriaapi.services.ArreglosFloralesService;
import com.iudigital.floristeriaapi.services.FloresService;
import com.iudigital.floristeriaapi.services.PedidosService;







@Controller
public class PedidoController {

    private FloresService floresService;
    @Autowired
    private ArreglosFloralesService arreglosFloralesService;

    public PedidoController(FloresService floresService) {
        this.floresService = floresService;
    }

    @GetMapping("/pedidos")
    public String showFlores(Model model) {
        List<FloresModel> flores = floresService.getAllFlores();
        List<ArreglosFloralesModel> arreglos = arreglosFloralesService.getAllArreglosFlorales();
        model.addAttribute("arreglosParaPedidos", arreglos);
        model.addAttribute("floresParaPedidos", flores);
        return "/pedidos";
    }

    // @GetMapping("/totalpedidos")
    // public String showPedido (Model model){
    // try {
    //     List <PedidoModel> pedido= pedidosService.getAllPedidos();
    //     model.addAttribute("pedidosParaInventario",pedido);
    //     return "/totalpedidos";
    // } catch (Exception e){
    //         return "error";
    //     }
    // }

    // @PostMapping("/guardarpedido")
    // public String savePedido (@ModelAttribute PedidoModel pedido){
    //     this.pedidosService.savePedido(pedido);
    //     return "redirect/totalpedido";
    // }

    // @GetMapping(path ="/{id}")
    // public Optional <PedidoModel> getPedidoById (@PathVariable("id") long id){
    //     return this.pedidosService.getPedidoById(id);
    // }

    // @PutMapping(path = "/{id}")
    // public PedidoModel updateById (@RequestBody PedidoModel pedido, @PathVariable("id") Long id){
    //     return this.pedidosService.updateById(pedido, id);
    // }

    // @DeleteMapping (path ="/eliminarpedido/{id}")
    // public String deletePedido (@PathVariable ("id")Long id){
    //     boolean ok = this.pedidosService.deletePedido(id);
    //     if (ok) return "redirect/totalpedidos";
    //     else return "error";
    // }

  

  






