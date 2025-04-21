package com.example.tarefas.repository;

// importar a classe 'Tarefa' da pasta model
import com.example.tarefas.model.Tarefa;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// MongoRepository<Tarefa, String>: fornece todos os métodos básicos (findAll, findById, save, deleteById, etc).
@Repository
public interface TarefaRepository extends MongoRepository<Tarefa, String>{ // Passamos a classe e o tipo de varivel que é o ID
    
}
