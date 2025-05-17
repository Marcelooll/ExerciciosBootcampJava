# ☁️ Modelos de Nuvem: IaaS, PaaS, SaaS e Responsabilidade Compartilhada

Aqui você vai encontrar uma explicação clara e detalhada sobre os principais modelos de serviço em nuvem e o conceito fundamental do Modelo de Responsabilidade Compartilhada.

---

## 🚀 Os 3 Modelos de Serviço na Nuvem

### 1. IaaS - Infrastructure as a Service (Infraestrutura como Serviço)

O provedor entrega a infraestrutura essencial — servidores, rede e armazenamento — e você gerencia o sistema operacional, os aplicativos e tudo que roda ali dentro.

**Imagine:** alugar um terreno onde você constrói sua própria casa do jeito que quiser, cuidando de cada detalhe.

**Exemplos:**  
Amazon EC2, Azure Virtual Machines, Google Compute Engine.

---

### 2. PaaS - Platform as a Service (Plataforma como Serviço)

O provedor entrega uma plataforma pronta para você desenvolver, testar e rodar suas aplicações. Ele cuida do sistema operacional, middleware, bancos de dados, e você só foca no código.

**Imagine:** alugar um apartamento mobiliado, pronto para morar, onde você só traz suas coisas.

**Exemplos:**  
Azure App Service, Google App Engine, Heroku.

---

### 3. SaaS - Software as a Service (Software como Serviço)

Aqui, o provedor entrega o software pronto para você usar pela internet. Você não precisa se preocupar com nada além de usar a aplicação.

**Imagine:** alugar um quarto completo, com tudo funcionando, só para você usar.

**Exemplos:**  
Microsoft 365, Google Workspace, Salesforce.

---

## 🔄 Modelo de Responsabilidade Compartilhada

Esse modelo define claramente o que é responsabilidade do provedor de nuvem e o que é responsabilidade do cliente em cada serviço.

| Responsabilidade      | IaaS     | PaaS     | SaaS                |
|-----------------------|----------|----------|---------------------|
| Infraestrutura física | Provedor | Provedor | Provedor            |
| Rede e virtualização  | Provedor | Provedor | Provedor            |
| Sistema operacional   | Cliente  | Provedor | Provedor            |
| Middleware & runtime  | Cliente  | Provedor | Provedor            |
| Aplicações            | Cliente  | Cliente  | Provedor            |
| Dados                 | Cliente  | Cliente  | Cliente / Provedor* |

\* No SaaS, o cliente é responsável pelo uso adequado dos dados, mesmo que o provedor cuide da segurança.

---

### Exemplo prático para facilitar:

Se você usa uma máquina virtual (IaaS) para hospedar seu site:

- **Você** instala e mantém o sistema operacional, servidor web e segurança da aplicação.
- **O provedor** mantém o hardware, data center e rede.

Já em SaaS, o provedor cuida de tudo, e você só usa o software.

---

## ✨ Resumo rápido

- **IaaS:** você tem controle total, mas precisa gerenciar tudo.
- **PaaS:** o provedor cuida da plataforma, você só do app.
- **SaaS:** tudo pronto para usar, sem preocupações técnicas.
- **Responsabilidade Compartilhada:** divide o que você e o provedor devem cuidar.

