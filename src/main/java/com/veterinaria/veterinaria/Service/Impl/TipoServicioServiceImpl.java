/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veterinaria.veterinaria.Service.Impl;

import com.veterinaria.veterinaria.Domain.TipoServicio;
import com.veterinaria.veterinaria.Repository.TipoServicioRepository;
import com.veterinaria.veterinaria.Service.TipoServicioService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author kenjo
 */
@Service
public class TipoServicioServiceImpl implements TipoServicioService {

    private final TipoServicioRepository repositorio;

    public TipoServicioServiceImpl(TipoServicioRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<TipoServicio> listarTodos() {
        return repositorio.findAll();
    }

    @Override
    public Optional<TipoServicio> buscarPorId(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public TipoServicio guardar(TipoServicio tipoServicio) {
        return repositorio.save(tipoServicio);
    }

    @Override
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}