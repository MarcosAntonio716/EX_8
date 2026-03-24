package com.example.Base.controller;

import com.example.Base.entity.Departamento;
import com.example.Base.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @PostMapping
    public Departamento salvar(@RequestBody Departamento departamento) {
        return service.salvar(departamento);
    }

    @GetMapping
    public List<Departamento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Departamento> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}