/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.veterinaria.veterinaria.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
    public String enviarFormulario(
            @RequestParam("nombre") String nombre,
            @RequestParam("correo") String correo,
            @RequestParam("nombreMascota") String nombreMascota,
            @RequestParam("mensaje") String mensaje,
            RedirectAttributes redirectAttributes) {

        redirectAttributes.addFlashAttribute(
                "mensaje",
                "¡Gracias, " + nombre
                + "! Recibimos tu mensaje sobre "
                + nombreMascota
                + ". Pronto nos comunicaremos con vos."
        );

        return "redirect:/contacto";
    }
}