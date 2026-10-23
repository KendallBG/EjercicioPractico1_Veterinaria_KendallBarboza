/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.veterinaria.veterinaria.Service;

import com.veterinaria.veterinaria.Domain.Cita;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author kenjo
 */
public interface CitaService {

    List<Cita> listarTodas();

    Optional<Cita> buscarPorId(Long id);
}