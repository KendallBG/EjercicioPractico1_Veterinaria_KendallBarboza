/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.veterinaria.Controllers;

import com.veterinaria.veterinaria.Domain.Servicio;
import com.veterinaria.veterinaria.Service.ServicioService;
import com.veterinaria.veterinaria.Service.TipoServicioService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author kenjo
 */
@Controller
@RequestMapping("/servicios")
public class ServicioController {

    private final ServicioService servicioService;
    private final TipoServicioService tipoServicioService;

    public ServicioController(
            ServicioService servicioService,
            TipoServicioService tipoServicioService) {
        this.servicioService = servicioService;
        this.tipoServicioService = tipoServicioService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("servicios", servicioService.listarTodos());
        return "servicios/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("servicio", new Servicio());
        model.addAttribute("tiposServicio",
                tipoServicioService.listarTodos());
        model.addAttribute("titulo", "Nuevo servicio");
        return "servicios/formulario";
    }

    @PostMapping("/guardar")
public String guardar(
        @ModelAttribute Servicio servicio,
        @RequestParam("tipoServicio.id") Long tipoId,
        RedirectAttributes redirectAttributes) {

    Optional<com.veterinaria.veterinaria.Domain.TipoServicio> tipo =
            tipoServicioService.buscarPorId(tipoId);

    if (tipo.isEmpty()) {
        redirectAttributes.addFlashAttribute(
                "error", "Seleccioná un tipo de servicio válido.");
        return "redirect:/servicios/nuevo";
    }

    servicio.setTipoServicio(tipo.get());
    servicioService.guardar(servicio);

    redirectAttributes.addFlashAttribute(
            "mensaje", "Servicio guardado correctamente.");

    return "redirect:/servicios";
}

    @GetMapping("/editar/{id}")
    public String editar(
            @PathVariable Long id,
            Model model,
            RedirectAttributes redirectAttributes) {

        Optional<Servicio> resultado =
                servicioService.buscarPorId(id);

        if (resultado.isEmpty()) {
            redirectAttributes.addFlashAttribute(
                    "error", "El servicio no existe.");
            return "redirect:/servicios";
        }

        model.addAttribute("servicio", resultado.get());
        model.addAttribute("tiposServicio",
                tipoServicioService.listarTodos());
        model.addAttribute("titulo", "Editar servicio");

        return "servicios/formulario";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(
            @PathVariable Long id,
            RedirectAttributes redirectAttributes) {

        try {
            servicioService.eliminar(id);
            redirectAttributes.addFlashAttribute(
                    "mensaje", "Servicio eliminado correctamente.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(
                    "error", "No se pudo eliminar el servicio.");
        }

        return "redirect:/servicios";
    }
}