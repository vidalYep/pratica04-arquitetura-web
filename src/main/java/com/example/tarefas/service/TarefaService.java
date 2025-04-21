package com.example.tarefas.service;

import com.example.tarefas.model.Tarefa;
import com.example.tarefas.repository.TarefaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> listarTarefa() {
        return repository.findAll();
    }

    public Tarefa criarTarefa(@Valid Tarefa tarefa) {
        tarefa.setDataCriacao(LocalDateTime.now());
        return repository.save(tarefa);
    }

    public Tarefa atualizarTarefa(String id, @Valid Tarefa tarefaAtualizada) {
        Optional<Tarefa> tarefaOptional = repository.findById(id);
        if (tarefaOptional.isEmpty()) {
            throw new RuntimeException("Tarefa não encontrada!");
        }

        Tarefa tarefa = tarefaOptional.get();
        tarefa.setTitulo(tarefaAtualizada.getTitulo());
        tarefa.setDescricao(tarefaAtualizada.getDescricao());
        tarefa.setStatus(tarefaAtualizada.getStatus());

        return repository.save(tarefa);
    }

    public void excluirTarefa(String id) {
        repository.deleteById(id);
    }
}


