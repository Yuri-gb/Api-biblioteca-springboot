# 📚 API Biblioteca

API REST desenvolvida com o objetivo de praticar conceitos fundamentais do ecossistema Spring Boot e do desenvolvimento Back-end com Java.

## 🚀 Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven
* Swagger/OpenAPI
* Git e GitHub

## 🎯 Objetivos do Projeto

Este projeto foi criado para consolidar conhecimentos em:

* Desenvolvimento de APIs REST
* Operações CRUD (Create, Read, Update e Delete)
* Persistência de dados com JPA/Hibernate
* Integração com PostgreSQL
* Arquitetura em camadas
* Tratamento de erros e códigos HTTP
* Documentação de APIs com Swagger
* Controle de versão com Git e GitHub

## 📂 Estrutura do Projeto

```text
src/main/java
├── controller  -> Recebe as requisições HTTP
├── service     -> Regras de negócio
├── repository  -> Acesso aos dados
├── model       -> Entidades do sistema
```

## 📖 Funcionalidades

* ✅ Cadastrar livros
* ✅ Listar todos os livros
* ✅ Buscar livros por gênero
* ✅ Atualizar livros
* ✅ Remover livros
* ✅ Persistência de dados com PostgreSQL
* ✅ Documentação automática com Swagger
* ✅ Tratamento de recurso não encontrado (404)

## 🔗 Endpoints

| Método | Endpoint                | Descrição         |
| ------ | ----------------------- | ----------------- |
| POST   | /livros                 | Cadastrar livro   |
| GET    | /livros                 | Listar livros     |
| GET    | /livros/genero/{genero} | Buscar por gênero |
| PUT    | /livros/{id}            | Atualizar livro   |
| DELETE | /livros/{id}            | Remover livro     |

## ▶️ Executando o Projeto

1. Clone o repositório

```bash
git clone <url-do-repositorio>
```

2. Configure o PostgreSQL

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/livros
spring.datasource.username=postgres
spring.datasource.password=sua_senha
```

3. Execute a aplicação

```bash
./mvnw spring-boot:run
```

4. Acesse a documentação da API

```text
http://localhost:8080/swagger-ui.html
```

## 📌 Status do Projeto

🚧 Em desenvolvimento

