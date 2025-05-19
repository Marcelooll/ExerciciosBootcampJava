# ☁️ Azure: Arquitetura, Regiões, Grupos e Assinaturas

Este resumo aborda conceitos fundamentais da Azure Cloud para organizar, escalar e proteger aplicações e recursos. Ele é útil tanto para seu aprendizado quanto para quem acessar este repositório.

---

## ☁️ Componentes de Arquitetura do Azure

A arquitetura da Azure é composta por:

- **Regiões**: Conjuntos físicos de datacenters agrupados geograficamente (ex: Brazil South, East US).
- **Zonas de Disponibilidade (Availability Zones)**: Subdivisões dentro de uma região com datacenters fisicamente separados para garantir alta disponibilidade.
- **Datacenters**: Instalações físicas que armazenam os servidores.
- **Edge Locations**: Pontos próximos do usuário para cache e aceleração de conteúdo (CDN).
- **VNET (Virtual Network)**: Redes privadas para comunicação segura entre recursos na nuvem.
- **Serviços de computação**: Como máquinas virtuais, containers, Kubernetes, App Services etc.
- **Serviços de armazenamento**: Blobs, discos, arquivos, filas e tabelas.
- **Banco de Dados como Serviço**: SQL, PostgreSQL, Cosmos DB, entre outros.

---

## 🌍 Pares de Regiões e Replicação (Region Pairs)

A Microsoft organiza regiões em **pares (region pairs)** para garantir:

- **Recuperação de desastres (Disaster Recovery)**: caso uma região falhe, a outra pode assumir.
- **Atualizações controladas**: quando uma região está em manutenção, a outra permanece disponível.
- **Replicação geográfica automática**: para recursos como Azure Storage.

📌 Exemplo: `Brazil South` é pareada com `South Central US`.

---

## 📦 Grupos de Recursos (Resource Groups)

- Um **Resource Group** é um "container lógico" para recursos da Azure.
- Permite **organizar, monitorar e controlar permissões** em projetos.
- Você pode aplicar políticas, tags, e controle de acesso (RBAC) ao grupo todo.
- Ideal para separar ambientes (produção, teste, dev) ou diferentes aplicações.

---

## 🔐 Assinaturas (Subscriptions) e Grupos de Gerenciamento (Management Groups)

### 📄 Assinatura (Subscription)

- É a **unidade de cobrança** e onde os recursos são implantados.
- Permite aplicar cotas de uso e políticas.
- Cada assinatura pode conter múltiplos Resource Groups e recursos.

### 📁 Grupos de Gerenciamento (Management Groups)

- Permitem **agrupar várias assinaturas** para aplicar políticas, RBAC e compliance em escala.
- Ideal para empresas com várias assinaturas (por projeto, por departamento ou por cliente).

### 🧱 Hierarquia da Estrutura do Azure

- Management Group (nível mais alto, opcional)
- Subscription (assinatura da Azure)
- Resource Group (grupo de recursos)
- Recursos individuais (VMs, bancos de dados, redes, etc)


Cada nível herda configurações e permissões do nível acima, o que facilita a governança em ambientes corporativos.

---

## 📌 Observações Finais

- Para projetos diferentes que compartilham recursos (como uma mesma API), é mais eficiente usar **uma única assinatura** com múltiplos **Resource Groups**, ao invés de criar várias contas diferentes.
- O **Azure Portal** permite gerenciar visualmente todos os serviços, mas o **Azure CLI** é recomendado para automações e tarefas avançadas.
- O CLI suporta comandos em loop (`for`, `az`, etc.), útil para DevOps e scripts de implantação.




