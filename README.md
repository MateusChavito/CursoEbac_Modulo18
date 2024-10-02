# 📚 Projeto de Anotações em Java

Este projeto demonstra a utilização de anotações em Java para definir metadados em classes. No exemplo, a anotação `@Tabela` é usada para especificar o nome de uma tabela associada a uma classe de cliente.

## 🔧 Funcionalidades

- **Anotações Personalizadas**: Implementação de uma anotação chamada `@Tabela`, que pode ser utilizada em classes para definir o nome de uma tabela.
- **Reflexão em Java**: O projeto utiliza a reflexão para verificar se a classe `Cliente` possui a anotação `@Tabela` e exibe o nome da tabela correspondente.

## 📋 Tecnologias Usadas

- **Java**: Linguagem de programação utilizada para desenvolver o projeto.
- **Anotações**: Conceito de metaprogramação que permite adicionar informações sobre o código que podem ser processadas em tempo de execução.

## 📊 Estrutura do Projeto

- **Classe `Cliente`**: Define os atributos `nome` e `idade`, além de métodos getters e setters. A classe é anotada com `@Tabela` para definir o nome da tabela associada.
- **Classe `Main`**: Ponto de entrada do aplicativo, que verifica a presença da anotação e exibe o nome da tabela correspondente.
- **Anotação `@Tabela`**: Define o comportamento da anotação, especificando que ela pode ser aplicada a classes e deve estar disponível em tempo de execução.

## 🛠️ Como Usar

1. Compile o código Java.
2. Execute a classe `Main` para ver o nome da tabela associado à classe `Cliente`.
