# 🔐 Identidade, Acesso e Segurança no Azure

## 1. 🧩 Conceitos Fundamentais

### ✅ Identidade
- No contexto do Azure, **identidade** representa qualquer entidade que possa ser autenticada:
    - Usuários
    - Aplicativos
    - Dispositivos
    - Serviços

### 🔐 Acesso
- Define **quais recursos** uma identidade pode acessar e **o que pode fazer com eles**.
- No Azure, isso é gerenciado principalmente por **RBAC (Role-Based Access Control)**, que associa **funções (roles)** a **usuários ou grupos**.

### 🛡️ Segurança
- Abrange políticas, ferramentas e práticas para **proteger identidades, dados e infraestrutura**.
- No Azure, a segurança envolve:
    - Autenticação multifator (MFA)
    - Acesso condicional
    - Monitoramento com Microsoft Defender for Cloud

---

## 2. 👥 Microsoft Entra ID (Azure Active Directory)

### 📌 O que é
- É o **sistema de gerenciamento de identidade baseado em nuvem** do Azure (anteriormente chamado Azure AD).
- Fornece **Single Sign-On (SSO)**, autenticação, autorização, integração com apps SaaS e políticas de acesso.

### ⚙️ Funcionalidades principais
- **Criação de usuários e grupos**
- **Atribuição de funções e permissões**
- **Integração com Microsoft 365, apps externos (Google, Salesforce etc.)**
- **Autenticação com protocolos como OAuth2, OpenID Connect, SAML**

### 🌍 Integração com ambientes híbridos
- Pode ser sincronizado com o Active Directory local (via Azure AD Connect).
- Permite gestão unificada de identidades **on-premises e na nuvem**.

---

## 3. 🏢 Microsoft Entra Domain Services (Azure AD DS)

### 📌 O que é
- Serviço gerenciado que oferece **recursos de domínio sem necessidade de DCs (Domain Controllers)** locais.
- É útil para aplicações que precisam de:
    - **Autenticação LDAP**
    - **Kerberos/NTLM**
    - **Junção de máquinas virtuais ao domínio (join domain)**

### ⚙️ Como funciona
- É **ligado ao Entra ID**, mas funciona separadamente.
- Pode ser usado por VMs no Azure para simular um ambiente corporativo tradicional.
- Suporta políticas de grupo (GPOs), como um Active Directory convencional.

---

## 4. 🔑 Autenticação vs Autorização no Azure

| Conceito         | Definição                                                   | Exemplo prático no Azure                             |
|------------------|-------------------------------------------------------------|------------------------------------------------------|
| **Autenticação** | Processo de **verificar a identidade** (quem é você)        | Login com senha + MFA usando Microsoft Authenticator |
| **Autorização**  | Processo de **atribuir permissões** (o que você pode fazer) | Atribuir a role "Reader" em uma subscription         |

### 🔐 Tipos de autenticação suportados:
- Senha + MFA (autenticador, SMS, biometria)
- Certificados
- Autenticação federada com ADFS
- Autenticação de aplicativos via tokens

---

## 5. ⚙️ RBAC (Role-Based Access Control)

- Sistema que permite **atribuir permissões baseadas em funções** (roles).
- As permissões são definidas em três níveis:
    - Subscription
    - Resource Group
    - Recurso específico

### Exemplos de roles no Azure:
- **Owner**: acesso total ao recurso
- **Contributor**: pode criar e gerenciar recursos
- **Reader**: só pode visualizar

---

## 6. 🧠 Acesso Condicional (Conditional Access)

### 📌 O que é
- Funcionalidade do Entra ID que **aplica políticas dinâmicas de acesso** com base em condições específicas.

### 🧩 Elementos das políticas de acesso condicional:
- **Usuário ou grupo alvo**
- **Aplicativo de destino**
- **Condições**:
    - Localização
    - Tipo de dispositivo
    - Status de compliance
    - Nível de risco do login
- **Ações**:
    - Bloquear acesso
    - Exigir MFA
    - Exigir dispositivo gerenciado

### ⚙️ Como funciona no Azure:
- São aplicadas **após a autenticação primária**.
- Exemplo: usuário fora do país → exige MFA.
- Integra com **Microsoft Defender for Identity** para detectar comportamentos suspeitos.

---

## 7. 🔒 Boas práticas de segurança no Azure

- **Ativar MFA obrigatoriamente**
- **Usar grupos para atribuição de permissões, e não usuários diretamente**
- **Monitorar logins suspeitos com Azure Monitor**
- **Aplicar políticas de acesso condicional sempre que possível**
- **Evitar uso de contas com permissões elevadas no dia a dia**

---

## ✅ Conclusão

A combinação de **Microsoft Entra ID**, **Domain Services**, **Autenticação e Autorização seguras**, e **Acesso Condicional** cria uma **estrutura poderosa e flexível de controle de identidade e segurança** no Azure.

Com essas ferramentas, é possível proteger sua organização contra ameaças, controlar o acesso com precisão e ainda oferecer uma boa experiência ao usuário final.

