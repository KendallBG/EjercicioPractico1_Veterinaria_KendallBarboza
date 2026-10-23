/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.veterinaria.Service;

import com.veterinaria.veterinaria.Domain.Servicio;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author kenjo
 */
public interface ServicioService {

    List<Servicio> listarTodos();

    Optional<Servicio> buscarPorId(Long id);

    Servicio guardar(Servicio servicio);

    void eliminar(Long id);
}