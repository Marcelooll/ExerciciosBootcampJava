# 💳 Desafio Banco Digital (DIO) — Versão Melhorada

Este projeto é uma **resolução aprimorada** do desafio **Banco Digital** proposto pela [Digital Innovation One (DIO)](https://web.dio.me/).  
Ele simula um sistema bancário simples com contas, depósitos, saques e histórico de transações.

Foram adicionadas diversas melhorias:

- 📦 **Maven** para gerenciamento do projeto
- 🧠 **Lombok** para reduzir código repetitivo
- 🧱 **Arquitetura limpa** com separação por pacotes
- 📜 **Histórico de transações** com tipo, valor e data
- ✅ Código todo em **Inglês**

---

## 🧠 Diagrama das classes (Mermaid)

```mermaid
classDiagram
    class Bank {
        - List~Account~ accounts
        + addAccount(Account account)
        + getAccounts(): List~Account~
    }

    class Account {
        - static int accountNumberSequence
        - int number
        - double balance
        - Client client
        - List~Transaction~ transactions
        + deposit(double amount)
        + withdraw(double amount)
        + getStatement(): String
    }

    class Client {
        - String name
        + getName(): String
    }

    class Transaction {
        - double amount
        - TransactionType type
        - LocalDateTime timestamp
        + toString(): String
    }

    enum TransactionType {
        DEPOSIT
        WITHDRAW
    }

    Bank "1" --> "*" Account
    Account "1" --> "1" Client
    Account "1" --> "*" Transaction
    Transaction "*" --> "1" TransactionType
