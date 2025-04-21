# 📝 Projeto de Gerenciamento de Tarefas (Spring Boot + MongoDB)

Este é um projeto simples de API REST para gerenciamento de tarefas, desenvolvido com **Spring Boot** e **MongoDB**. Ele permite criar, listar, atualizar e deletar tarefas por meio de requisições HTTP.

---

## 📁 Estrutura do Projeto
```bash
└── main/
    ├── java/
    │   └── com/example/tarefas/
    │       ├── controller/
    │       ├── model/
    │       ├── repository/
    │       ├── service/
    │       └── TarefasApplication.java
    └── resources/
        └── application.properties  
```
        
---

## ⚙️ Tecnologias Utilizadas

- Java 21  
- Spring Boot 3.4.4  
  - Spring Web  
  - Spring Data MongoDB  
  - Spring Validation  
- MongoDB  
- Maven  

---

## 🛠️ Pré-requisitos

- [Java 21+](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)  
- [Maven](https://maven.apache.org/)  
- [MongoDB Community Edition](https://www.mongodb.com/try/download/community) instalado e rodando localmente  

---

## 🚀 Como executar o projeto

```bash
git clone https://github.com/seu-usuario/tarefas-api.git
cd tarefas-api
```

## 📥 Endpoints da API

| Método  | Endpoint         | Descrição                      |
|---------|-----------------|--------------------------------|
| GET     | `/tarefas`       | Lista todas as tarefas        |
| POST    | `/tarefas`       | Cria uma nova tarefa          |
| PUT     | `/tarefas/{id}`  | Atualiza uma tarefa existente |
| DELETE  | `/tarefas/{id}`  | Remove uma tarefa por ID      |


## 📌 Exemplo de requisição POST

- **URL:** `http://localhost:8080/tarefas`
- **Método:** `POST`
- **Body (JSON):**
```json
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Aprender sobre Controllers e Services",
  "status": "Em andamento"
}

