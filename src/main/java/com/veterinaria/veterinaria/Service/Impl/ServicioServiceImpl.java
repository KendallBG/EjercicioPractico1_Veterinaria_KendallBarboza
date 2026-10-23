/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.veterinaria.Service.Impl;

import com.veterinaria.veterinaria.Domain.Servicio;
import com.veterinaria.veterinaria.Repository.ServicioRepository;
import com.veterinaria.veterinaria.Service.ServicioService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
/**
 *
 * @author kenjo
 */
@Service
public class ServicioServiceImpl implements ServicioService {

    private final ServicioRepository repositorio;

    public ServicioServiceImpl(ServicioRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Servicio> listarTodos() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Servicio> buscarPorId(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Servicio guardar(Servicio servicio) {
        return repositorio.save(servicio);
    }

    @Override
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}