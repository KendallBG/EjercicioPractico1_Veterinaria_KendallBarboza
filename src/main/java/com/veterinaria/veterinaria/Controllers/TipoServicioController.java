/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.veterinaria.Controllers;

import com.veterinaria.veterinaria.Domain.TipoServicio;
import com.veterinaria.veterinaria.Service.TipoServicioService;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
/**
 *
 * @author kenjo
 */
@Controller
@RequestMapping("/tipos-servicio")
public class TipoServicioController {

    private final TipoServicioService tipoServicioService;

    public TipoServicioController(TipoServicioService tipoServicioService) {
        this.tipoServicioService = tipoServicioService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("tiposServicio",
                tipoServicioService.listarTodos());
        return "tipos-servicio/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("tipoServicio", new TipoServicio());
        model.addAttribute("titulo", "Nuevo tipo de servicio");
        return "tipos-servicio/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(
            @ModelAttribute TipoServicio tipoServicio,
            RedirectAttributes redirectAttributes) {

        tipoServicioService.guardar(tipoServicio);
        redirectAttributes.addFlashAttribute(
                "mensaje", "Tipo de servicio guardado correctamente.");

        return "redirect:/tipos-servicio";
    }

    @GetMapping("/editar/{id}")
    public String editar(
            @PathVariable Long id,
            Model model,
            RedirectAttributes redirectAttributes) {

        Optional<TipoServicio> tipo =
                tipoServicioService.buscarPorId(id);

        if (tipo.isEmpty()) {
            redirectAttributes.addFlashAttribute(
                    "error", "El tipo de servicio no existe.");
            return "redirect:/tipos-servicio";
        }

        model.addAttribute("tipoServicio", tipo.get());
        model.addAttribute("titulo", "Editar tipo de servicio");

        return "tipos-servicio/formulario";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(
            @PathVariable Long id,
            RedirectAttributes redirectAttributes) {

        try {
            tipoServicioService.eliminar(id);
            redirectAttributes.addFlashAttribute(
                    "mensaje", "Tipo de servicio eliminado correctamente.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(
                    "error", "No se puede eliminar este tipo si tiene servicios asociados.");
        }

        return "redirect:/tipos-servicio";
    }
}