# VUTTR API - Very Useful Tools to Remember

Este projeto é uma **API RESTful** desenvolvida em **Java com Spring Boot** para a aplicação **VUTTR (Very Useful Tools to Remember)**. A aplicação permite gerenciar ferramentas úteis com seus respectivos nomes, links, descrições e tags.

Desafio proposto pelo repositório de [Backend Challenges da BossaBox](https://github.com/CollabCodeTech/backend-challenges).

---

## ⚙️ Tecnologias utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Flyway** para versionamento de banco de dados
- **Lombok**
- **Swagger (Springdoc OpenAPI)** para documentação da API
- **JUnit + Mockito** para testes
- **Docker** e **Docker Compose** (opcional)
- **Maven** como gerenciador de dependências

---

## 📦 Como executar o projeto

### Pré-requisitos

- Java 17+
- PostgreSQL
- Maven
- Docker (opcional)

### 1. Clone o repositório

```bash
git clone https://github.com/eduardafbz/useful-tools.git
cd useful-tools
````

### 2. Configure o ambiente

Crie ou edite o arquivo `src/main/resources/application.properties`:

```properties
server.port=3000

spring.datasource.url=jdbc:postgresql://localhost:5432/vuttr_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true
```

> A aplicação foi configurada para rodar na porta **3000**, conforme especificação do desafio.

### 3. Execute a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação estará disponível em:

```
http://localhost:3000
```

---

## 📌 Funcionalidades

* [x] Listar todas as ferramentas
* [x] Buscar ferramentas por tag
* [x] Adicionar uma nova ferramenta
* [x] Remover uma ferramenta por ID

---

## ✅ Diferenciais (Bônus)

* [x] **Organização em camadas (Controller, Service, Repository)**
* [ ] **Migrations com Flyway**
* [ ] **Testes automatizados**
* [ ] **Swagger (OpenAPI)**
* [ ] Autenticação JWT (opcional)
* [ ] Conteinerização com Docker (opcional)

---

## 🙋 Sobre

Desenvolvido por Maria Eduarda Braz(https://github.com/eduardafbz) como parte do desafio da [BossaBox](https://github.com/CollabCodeTech/backend-challenges).
