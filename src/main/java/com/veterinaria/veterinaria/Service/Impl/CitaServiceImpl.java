/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.veterinaria.Service.Impl;

import com.veterinaria.veterinaria.Domain.Cita;
import com.veterinaria.veterinaria.Repository.CitaRepository;
import com.veterinaria.veterinaria.Service.CitaService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author kenjo
 */
@Service
public class CitaServiceImpl implements CitaService {

    private final CitaRepository repositorio;

    public CitaServiceImpl(CitaRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Cita> listarTodas() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Cita> buscarPorId(Long id) {
        return repositorio.findById(id);
    }
}