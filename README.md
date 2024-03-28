<div align="center">
  <h1>Challenge Mail Service</h1>
  <p>Challenge Mail Service é um serviço de envio de e-mails que possui a abstração entre dois provedores de serviços de e-mail diferentes. Se um dos serviços falhar, seu serviço poderá falhar rapidamente para um provedor diferente sem afetar seus clientes. Desenvolvido utilizando clean architecture. Desafio proposto pela Uber.</p>
</div>

# 📒 Índice
* [Descrição](#descrição)
* [Requisitos Funcionais](#requisitos)
  * [Features](#features)
* [Tecnologias](#tecnologias)
* [Endpoints](#endpoints)
* [Instalação](#instalação)
* [Licença](#licença)

# 📃 <span id="descrição">Descrição</span>
Challenge Mail Service é um serviço de envio de e-mails que possui a abstração entre dois provedores de serviços de e-mail diferentes. Se um dos serviços falhar, seu serviço poderá falhar rapidamente para um provedor diferente sem afetar seus clientes. Desenvolvido utilizando clean architecture. Desafio proposto pela [**Uber**](https://github.com/uber), foi utilizado as tecnologias como [**Spring**](https://spring.io/) e [**Lombok**](https://projectlombok.org/).

# 📌 <span id="requisitos">Requisitos Funcionais</span>
- [x] Envios de e-mail por provedores diferentes<br>
- [x] Utilização de uma arquitetura<br>

## Features
- [x] Suporte a AmazonSES(Amazon Simple Email Service)<br>

# 💻 <span id="tecnologias">Tecnologias</span>
- **Java**
- **Spring Boot**
- **Spring Web**
- **Spring Boot DevTools**
- **Lombok**

# 📍 <span id="endpoints">Endpoints</span>
| Endpoint               | Resumo                                          
|----------------------|-----------------------------------------------------
| <kbd>POST /api/email</kbd>     | Responsável pelo envio do e-mail

# 🚀 <span id="instalação">Instalação</span>
```bash
  # Clone este repositório:
  $ git clone https://github.com/CleilsonAndrade/challenge-mail-service.git
  $ cd ./challenge-mail-service

  # Instalar as dependências:
  $ mvn clean instal

  # Executar:
  $ mvn spring-boot:run
```

# 📝 <span id="licença">Licença</span>
Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<p align="center">
  Feito com 💜 by CleilsonAndrade
</p>