# 📚 Guia de Inteligência Artificial com Azure (Parte 2)

Este guia foi elaborado para fornecer uma explicação profunda, prática e acessível sobre os recursos de **Inteligência Artificial da Microsoft Azure**, com foco em **Document Intelligence**, **Mineração de Conhecimento**, **Busca Cognitiva (Cognitive Search)** e **Enriquecimento com IA (AI Enrichment)**. É ideal para estudantes, entusiastas de IA e profissionais que desejam entender os usos reais dessas tecnologias.

---

## 🧾 1. Inteligência de Documentos (Azure Document Intelligence)

### 🧠 O que é?

A Inteligência de Documentos do Azure, anteriormente conhecida como **Form Recognizer**, é um serviço baseado em IA que permite extrair **informações estruturadas e semiestruturadas** de documentos digitais e escaneados, como PDFs, imagens (JPG/PNG), faturas, contratos, recibos, passaportes e muito mais.

Esse serviço é útil porque transforma documentos **não estruturados** (ou seja, que não seguem um padrão de banco de dados) em **dados prontos para uso e análise**, permitindo automações e economias significativas em operações corporativas.

---

### 🛠️ Componentes Principais

1. **Modelos Pré-construídos (Prebuilt Models):**
    - Permitem reconhecer dados em tipos comuns de documentos, como:
        - Faturas
        - Recibos
        - Cartões de identificação
        - Licenças
        - Passaportes

2. **Modelos Personalizados (Custom Models):**
    - Você pode **treinar modelos com seus próprios documentos**, marcando os campos desejados. Ideal para:
        - Formulários próprios da empresa
        - Relatórios financeiros internos
        - Documentos jurídicos específicos

3. **Layout Extraction:**
    - Extrai a **estrutura física do documento**, incluindo colunas, tabelas, caixas de seleção e linhas.

4. **Document Intelligence Studio:**
    - Interface visual para treinar modelos, testar entradas e ver resultados diretamente no navegador, sem código.

---

### 📦 Casos de Uso

- Automatização de processos de RH (análise de currículos e cadastros).
- Digitalização e arquivamento de contratos com extração automática de cláusulas.
- Análise contábil e financeira com extração automática de valores e datas.
- Extração de dados de documentos de identidade para onboarding de clientes (KYC).

---

## ⛏️ 2. Mineração de Conhecimento (Knowledge Mining)

### 🧠 Definição

A **Mineração de Conhecimento** (ou *Knowledge Mining*) refere-se ao uso de **IA para extrair insights úteis de grandes volumes de dados** textuais, geralmente não estruturados. O foco não é apenas extrair dados, mas gerar **conhecimento útil**, revelando padrões, relações e informações escondidas em textos, planilhas, imagens e documentos.

---

### 🚀 Ferramentas Envolvidas

- **Azure Cognitive Search** para indexação e pesquisa.
- **Azure AI Enrichment (Skillsets)** para extrair significado dos dados.
- **Azure Storage** como repositório dos documentos.
- **Power BI ou Synapse** para análise e visualização dos resultados.

---

### 📊 Exemplos Reais

- Explorar milhares de contratos para identificar cláusulas específicas ou padrões jurídicos.
- Analisar grandes volumes de artigos científicos, organizando por tema, data, autores e resumos automáticos.
- Vasculhar dados clínicos para insights sobre sintomas e diagnósticos correlacionados.

---

## 🔍 3. Azure Cognitive Search — Busca Cognitiva

### 📖 O que é?

O **Azure Cognitive Search** é um serviço de **busca de informação inteligente** que permite consultar dados armazenados em várias fontes usando **pesquisas simples, semânticas e inteligentes**.

Ele é ideal para sistemas que exigem **busca textual rápida, com filtros, sugestões, sinônimos e interpretação de linguagem natural**, como intranets, portais de conhecimento, sistemas de suporte, sites com conteúdo vasto, entre outros.

---

### 🔧 Recursos Importantes

- **Indexação inteligente:** Pode rastrear e indexar documentos no Azure Blob, Cosmos DB, SQL, etc.
- **Busca semântica:** Com IA, permite interpretar perguntas como um humano. Ex: "Qual é o prazo de entrega dos contratos com fornecedores do RJ?"
- **Autocompletar e sugestão de termos.**
- **Filtros dinâmicos (facets)** para categorizar e explorar os resultados.
- **Integração com LLMs (como o Azure OpenAI) para gerar resumos ou respostas diretas.**

---

### 🔗 Funciona assim:

1. Você conecta o Cognitive Search a uma **fonte de dados** (blobs, banco de dados, arquivos).
2. Aplica um **skillset (pipeline de IA)** que enriquece os documentos durante a indexação.
3. Um **indexador** transforma esses dados em **um índice de busca navegável**.
4. O índice é consultado por meio de uma **API RESTful** ou SDKs.

---

## 🧠 4. Enriquecimento com IA (AI Enrichment)

### 💡 O que é?

Durante o processo de indexação com Azure Cognitive Search, você pode usar **“skillsets”**, que são **conjuntos de transformações baseadas em IA**, para analisar e enriquecer os dados.

---

### 🧩 Exemplos de Habilidades (Skills):

- **OCR (Reconhecimento Óptico de Caracteres):** Converte imagens em texto pesquisável.
- **Detecção de Idioma:** Identifica o idioma de cada documento ou parágrafo.
- **Extração de Entidades Nomeadas:** Identifica nomes de pessoas, organizações, localizações, números, datas.
- **Análise de Sentimento:** Mede se o conteúdo é positivo, negativo ou neutro.
- **Tradução:** Usa o Azure Translator para traduzir conteúdo automaticamente.
- **Summarization:** Cria resumos automáticos com OpenAI ou modelos de PLN (NLP).

---

### 🧱 Como funciona um Skillset?

1. O indexador lê os dados da fonte.
2. Passa os dados por cada skill definido.
3. Cria campos adicionais com metadados, resumos, entidades etc.
4. O resultado final é adicionado ao índice de busca.

---

## 🧪 5. Document Intelligence + Busca Cognitiva + Enriquecimento

Essa combinação poderosa permite criar sistemas robustos como:

- **Sistemas Jurídicos Inteligentes:** Que escaneiam petições, reconhecem nomes de partes, prazos, e organizam os documentos por categoria.
- **Base de Conhecimento Interna:** Para empresas com milhares de documentos organizados, onde qualquer funcionário pode buscar usando linguagem natural.
- **Painéis Gerenciais Automatizados:** Com Power BI lendo dados indexados e enriquecidos para relatórios em tempo real.

---

## 📘 Referências e Cursos Recomendados (DIO e Microsoft)

- [Curso: Fundamentos de IA com Azure – DIO](https://www.dio.me)
- [Curso: IA com Azure - Análise de Documentos e Textos](https://www.dio.me)
- [Microsoft Learn - Azure AI Document Intelligence](https://learn.microsoft.com/en-us/azure/ai-services/document-intelligence/)
- [Microsoft Learn - Azure Cognitive Search](https://learn.microsoft.com/en-us/azure/search/search-what-is-azure-search)
- [Microsoft Learn - Knowledge Mining](https://learn.microsoft.com/en-us/azure/search/knowledge-mining-overview)
- [Microsoft Learn - Cognitive Skills](https://learn.microsoft.com/en-us/azure/search/cognitive-search-concept-intro)

---
