# ☁️ Azure - Computação, Máquinas Virtuais, Containers e Serviços de Aplicativos (Resumo 5)

Aqui, vamos nos aprofundar nos principais serviços de computação da plataforma, abordando:

- Máquinas Virtuais
- Conjuntos de Disponibilidade
- Área de Trabalho Virtual (AVD)
- Serviços de Containers (ACI e AKS)
- Azure Functions e App Services
- O portal do Azure e escalabilidade automática

Este resumo foi feito com foco em **aprendizado prático** e pode ser usado como **guia de estudos** por outros alunos e desenvolvedores.

---

## 🖥️ 1. Serviços de Computação e Máquinas Virtuais (VMs)

### 📌 O que são?

As **Máquinas Virtuais (VMs)** são emulações completas de computadores físicos, criadas e executadas em um ambiente de nuvem. Elas oferecem controle total sobre o sistema operacional, configurações e software.

### 🛠️ Principais características:

- **Personalização total:** escolha de CPU, memória, disco, sistema operacional (Windows/Linux), entre outros.
- **Alta disponibilidade:** suporte a balanceamento de carga e replicação.
- **Redes Virtuais (VNets):** permitem que VMs se comuniquem entre si em redes isoladas.
- **Suporte a autoscaling:** podem crescer de acordo com a carga de trabalho.
- **Snapshots e backups:** você pode restaurar estados anteriores da VM.
- **Pagamentos por uso:** você paga apenas pelo tempo em que a VM está ligada.

### 💡 Quando usar?

- Para aplicações legadas que requerem infraestrutura tradicional.
- Para desenvolvimento/testes de software com mais controle.
- Para hospedar bancos de dados, servidores web e APIs.
- Em ambientes com necessidades específicas de rede ou segurança.

---

## 🧱 2. Conjuntos de Disponibilidade (Availability Sets)

### 🛡️ O que são?

Os **Conjuntos de Disponibilidade** aumentam a confiabilidade de suas VMs, distribuindo-as em diferentes infraestruturas físicas e ciclos de manutenção.

### 🔍 Como funcionam?

- **Domínio de Falha (Fault Domain - FD):** separação física das VMs em racks diferentes no datacenter. Protege contra falhas de hardware ou energia.
- **Domínio de Atualização (Update Domain - UD):** separa VMs para que atualizações de software ocorram em momentos diferentes. Evita que todas sejam reiniciadas simultaneamente.

### 🧠 Exemplo prático:

Imagine que você tem três VMs que fazem parte de um sistema crítico. Colocando-as em um Availability Set, mesmo que uma delas esteja sendo atualizada ou tenha uma falha, as outras continuarão funcionando.

---

## 💼 3. Área de Trabalho Virtual (Azure Virtual Desktop)

### 🌐 O que é?

O **Azure Virtual Desktop (AVD)** é um serviço de desktop como serviço (DaaS). Ele permite entregar um ambiente de trabalho completo (com Windows 10/11, por exemplo) para usuários por meio da nuvem.

### 🎯 Benefícios:

- **Acesso remoto seguro** ao ambiente de trabalho.
- **Redução de custos com hardware** para os usuários finais.
- **Gerenciamento centralizado** de todas as máquinas.
- Integração com o Microsoft 365 e autenticação via Azure AD.
- Suporte a múltiplas sessões por máquina, reduzindo custos.

### 🛠️ Casos de uso:

- Ambientes corporativos com **trabalho remoto**.
- Call centers, escolas, empresas que usam software específico.
- Laboratórios virtuais para testes e desenvolvimento.

---

## 📦 4. Containers no Azure

### 📌 O que são containers?

Containers são unidades de software que **empacotam código, bibliotecas e dependências**, permitindo que uma aplicação rode de forma **consistente** em qualquer lugar. Eles são mais leves e rápidos que VMs, pois **compartilham o mesmo kernel do sistema operacional host**.

---

### 🧩 Azure Container Instances (ACI)

Um serviço ideal para workloads simples e curtos.

#### Características:
- Criação quase instantânea de containers.
- Não requer gerenciamento de servidores ou orquestradores.
- Paga apenas pelo tempo de execução.
- Ótimo para **testes rápidos, scripts, bots ou APIs leves**.

---

### ☸️ Azure Kubernetes Service (AKS)

Uma plataforma gerenciada para orquestração de containers.

#### Vantagens:
- Suporte completo a **Kubernetes**, o padrão de mercado.
- Escalabilidade automática de pods e clusters.
- Monitoramento, balanceamento de carga e atualizações automáticas.
- Ideal para **microserviços, SaaS, CI/CD, grandes aplicações web**.

---

### ⚖️ Containers vs VMs

| Característica         | Container                 | VM                             |
|------------------------|---------------------------|--------------------------------|
| Peso                   | Leve                      | Pesada                         |
| Tempo de inicialização | Segundos                  | Minutos                        |
| Portabilidade          | Alta (Docker)             | Menor                          |
| Custo                  | Menor                     | Maior                          |
| Casos de uso           | Microserviços, APIs, bots | Servidores, aplicações legadas |

---

## ⚡ 5. Azure Functions

### 🧬 O que é?

**Azure Functions** é a solução *serverless* da Azure. Isso significa que você escreve apenas **o código que executa sua lógica**, sem se preocupar com servidores, infraestrutura, escalonamento ou disponibilidade.

### 🎯 Vantagens:

- Execução **baseada em eventos** (webhooks, timers, mensagens).
- **Escala automática** com base em demanda.
- Pagamento apenas por execução (modelo "pay per invocation").
- Suporte a várias linguagens: C#, JavaScript, Python, Java, etc.
- Integração com outros serviços da Azure (Blob Storage, Event Grid, Service Bus, etc).

### 🛠️ Casos de uso:

- Envio de e-mails automáticos.
- Processamento de imagens, logs, notificações.
- Agendamento de tarefas (ex: backups diários).

---

## 🌐 6. Serviço de Aplicativo (App Service)

### 🧩 O que é?

O **Azure App Service** é uma plataforma de hospedagem para **web apps, APIs REST e backends móveis**, com suporte a linguagens como .NET, Java, Node.js, PHP, Python e mais.

### 🛠️ Principais recursos:

- Deploys automáticos com GitHub, Azure DevOps, FTP.
- Slots de staging para testes sem afetar produção.
- SSL grátis, backup, monitoramento integrado.
- **Autoescalabilidade** de instâncias conforme o tráfego.
- Ambiente gerenciado, com patch de segurança e atualizações.

### 💼 Casos de uso:

- Sites corporativos ou blogs.
- APIs REST com Node.js/Python.
- Portais internos e externos de empresas.

---

## 🧭 7. O Portal do Azure e Escalabilidade

### 🧰 Portal do Azure

O **Portal do Azure** é uma interface gráfica baseada na web que permite **criar, configurar, monitorar e deletar recursos** da nuvem Azure de forma simples e visual.

#### Funcionalidades:

- Gerenciar VMs, redes, bancos de dados, containers, funções, etc.
- Monitoramento em tempo real de consumo de CPU, memória, IOPS, tráfego.
- Gerenciamento de identidade (Azure AD), permissões e grupos de recursos.
- Acesso a logs, diagnósticos e ferramentas de segurança.

---

### 🚀 Escalabilidade no Azure

**Escalar** significa aumentar (ou diminuir) a capacidade computacional conforme a necessidade.

#### 📈 Tipos de escalabilidade:

- **Escala Vertical:** aumento de CPU/RAM da VM.
- **Escala Horizontal:** aumento do número de instâncias.
- **Escala Automática (Autoscale):** baseada em regras (ex: "aumentar para 3 instâncias se CPU > 70% por 5 min").

#### 🕐 Tempo de escalamento:

- Em média, o escalamento leva de **5 a 10 minutos**, mas pode variar com base na complexidade do recurso e da configuração.

---

## 📚 Conclusão

A computação em nuvem na Azure oferece ferramentas extremamente poderosas para construir, hospedar e escalar qualquer tipo de aplicação — de **microserviços leves** até **infraestruturas complexas com alta disponibilidade**.

- Use **VMs** para controle total.
- Use **Containers** para leveza, portabilidade e microserviços.
- Use **App Services** para sites e APIs com deploy contínuo.
- Use **Azure Functions** para tarefas pontuais e serverless.
- Use **AVD** para ambientes de trabalho remotos e centralizados.

