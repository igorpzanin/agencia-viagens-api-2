# Travel Agency API

A **Travel Agency API** é uma aplicação desenvolvida com **Spring Boot** que permite a gestão de destinos turísticos e usuários em uma agência de viagens. A API está integrada com um banco de dados PostgreSQL e implementa autenticação e autorização usando **Spring Security**.

---

## Funcionalidades

- **Gestão de Destinos**:
  - Listar todos os destinos.
  - Adicionar novos destinos.
- **Gestão de Usuários**:
  - Cadastro de novos usuários com autenticação via banco de dados.
- **Segurança**:
  - Autenticação baseada em roles (`ROLE_ADMIN`, `ROLE_USER`).
  - Rotas protegidas com controle de acesso.

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Security**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
