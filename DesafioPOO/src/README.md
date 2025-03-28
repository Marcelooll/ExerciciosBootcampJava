# Desafio DIO - Trilha Java Básico: Modelagem e Diagramação de um Componente iPhone

## Objetivo

Neste desafio, o objetivo foi modelar e diagramar o componente `iPhone`, representando suas funcionalidades principais: **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador de Internet**. Em seguida, foi realizada a implementação das classes e interfaces correspondentes em Java.

## Funcionalidades a Modelar

1. **Reprodutor Musical**
    - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`

2. **Aparelho Telefônico**
    - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`

3. **Navegador na Internet**
    - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

## Diagrama UML

O diagrama UML abaixo, criado com a sintaxe do Mermaid, representa as classes e interfaces do sistema modelado, incluindo as funcionalidades do iPhone:

```mermaid
classDiagram
    class ReprodutorMusical {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class IPhone {
        -String musicaAtual
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class Main {
        +void main(String[] args)
    }

    ReprodutorMusical <|-- IPhone
    AparelhoTelefonico <|-- IPhone
    NavegadorInternet <|-- IPhone
