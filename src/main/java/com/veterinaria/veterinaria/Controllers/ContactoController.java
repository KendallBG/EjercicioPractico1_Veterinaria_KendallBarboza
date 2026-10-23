/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.veterinaria.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author kenjo
 */
@Controller
public class ContactoController {

    @GetMapping("/contacto")
    public String mostrarFormulario() {
        return "contacto";
    }

    @PostMapping("/contacto")
    public String enviarFormulario(Model model) {
        model.addAttribute(
                "mensaje",
                "¡Gracias por contactar a nuestra clínica veterinaria! "
                + "Pronto nos comunicaremos con vos."
        );

        return "redirect:/contacto/gracias";
    }

    @GetMapping("/contacto/gracias")
    public String mostrarGracias(Model model) {
        model.addAttribute(
                "mensaje",
                "¡Gracias por contactar a nuestra clínica veterinaria! "
                + "Pronto nos comunicaremos con vos."
        );

        return "contacto-gracias";
    }
}