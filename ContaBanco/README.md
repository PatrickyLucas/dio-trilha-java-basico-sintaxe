# ContaBanco

Este projeto, desenvolvido como parte do desafio do bootcamp **DIO - Bradesco - Java Cloud Native**, tem como objetivo simular a criação de uma conta bancária. Utilizando Java, ele permite que o usuário insira informações via terminal e exibe uma mensagem personalizada com os dados coletados.

## 📝 Funcionalidades

- Solicita ao usuário os seguintes dados:
  - Número da agência
  - Número da conta
  - Nome do cliente
  - Saldo inicial
- Exibe uma mensagem formatada contendo as informações fornecidas:
Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque.


## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada.
- **Scanner**: Classe do Java usada para entrada de dados no terminal.

## 🚀 Como Executar o Projeto

1. Certifique-se de ter o **Java Development Kit (JDK)** instalado em sua máquina.
2. Clone este repositório ou copie o código fonte do projeto.
3. Compile o arquivo `ContaTerminal.java`:
 ```
bash
 javac ContaTerminal.java
```
Execute o programa:
```
bash
java ContaTerminal
```
Insira os dados solicitados no terminal para visualizar o funcionamento.

📂 Estrutura do projeto:

O projeto contém apenas um arquivo principal:

ContaTerminal.java: Arquivo principal que contém o código para execução do programa.

____

📚 Conceitos Abordados:

Este projeto foi desenvolvido para exercitar os seguintes conceitos:

Declaração de variáveis e tipos de dados.

Uso da classe ```Scanner``` para entrada de dados via terminal.

Manipulação de strings utilizando o método ```concat()```.

Estrutura básica de um programa em Java com o método ```main```.
___

✨ Exemplos de Entrada e Saída:

**Entrada:**

Por favor, digite o número da Agência:

1234-5

Por favor, digite o número da Conta:

56789

Por favor, digite o nome do Cliente:

Lucas Silva

Por favor, digite o saldo inicial:

1500,50


**Saída:**

Olá Lucas Silva, obrigado por criar uma conta em nosso banco, sua agência é 1234-5, conta 56789 e seu saldo R$ 1500,50 já está disponível para saque.

🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request caso tenha ideias de melhorias.

Desenvolvido com ❤️ por Patricky Lucas.
