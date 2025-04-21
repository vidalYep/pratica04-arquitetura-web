package com.example.tarefas.controller;

// importar classes do model e repository
import com.example.tarefas.model.Tarefa;
import com.example.tarefas.service.TarefaService;

import jakarta.validation.Valid;

// importar listas
import java.util.List;

// importar spring boot
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tarefas") // Defini o caminho base da API
public class TarefaController {
    
    @Autowired
    private TarefaService service;

    @GetMapping
    public ResponseEntity<List<Tarefa>> listar() {
        return ResponseEntity.ok(service.listarTarefa());
    }

    @PostMapping
    public ResponseEntity<Tarefa> criar(@Valid @RequestBody Tarefa tarefa) {
        return ResponseEntity.ok(service.criarTarefa(tarefa));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable String id, @Valid @RequestBody Tarefa tarefa) {
        return ResponseEntity.ok(service.atualizarTarefa(id, tarefa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable String id) {
        service.excluirTarefa(id);
        return ResponseEntity.noContent().build();
    }
}
