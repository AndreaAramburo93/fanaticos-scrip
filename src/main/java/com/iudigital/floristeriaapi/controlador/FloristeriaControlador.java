package com.iudigital.floristeriaapi.controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FloristeriaControlador {

    @GetMapping("/inventario")
    public String inventario() {
        return "inventario";
    }
    @GetMapping("/pedidos")
    public String mostrarPedidos() {
        return "pedidos"; // Nombre del archivo HTML correspondiente
    }

    @GetMapping("/arreglos")
    public String mostrarArreglos() {
        return "arreglos"; // Nombre del archivo HTML correspondiente
    }

    @GetMapping("/entregas")
    public String mostrarEntregas() {
        return "entregas"; // Nombre del archivo HTML correspondiente
    }

    @GetMapping("/finanzas")
    public String mostrarFinanzas() {
        return "finanzas"; // Nombre del archivo HTML correspondiente
    }

    @GetMapping("/informes")
    public String mostrarInformes() {
        return "informes"; // Nombre del archivo HTML correspondiente
    }
}
