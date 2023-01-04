# [Design Patterns em Java I: boas práticas de programação](https://cursos.alura.com.br/course/introducao-design-patterns-java)

***

## 01. Strategy

### 1.1 Apresentação:

* Solução comum para um problema recorrente ao utilizar o paradigma da orientação a objetos
* O objetivo é estudar os principais e mais comuns padrões dessa categoria que são mais recorrentes do nosso dia a dia
  de desenvolvimento de software:
    * Strategy
    * Chain of Responsibility
    * Template Method
    * State
    * Command
    * Observer.

---

### 1.4 Aplicando o pattern Strategy

* O strategy Permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles
  intercambiáveis.
* Eliminamos o switch case/if else e usamos o Strategy, e usamos classes e interfaces para a lógica.
* [Mais sobre o Strategy](https://refactoring.guru/pt-br/design-patterns/strategy)

---

## 02. Chain of responsibility

### 2.5 Aplicando o pattern Chain of Responsability

* Vai se verificando qual delas precisa ser aplicada. Se uma não for aplicada, ele está ligado e tem
  um elo com a próxima e ele vai chamar a próxima. Se for aplicada, aplicou e encerrou. Se não for, chama o próximo,
  chama o próximo até chegar no fim dessa corrente.
* [Mais sobre o Chain of Responsability](https://refactoring.guru/design-patterns/chain-of-responsibility)

---

## 03. Template Method

### 3.2 Aplicando o pattern template Method & 3.4 Entendendo o pattern Template Method

* É um padrão de projeto comportamental que define o esqueleto de um algoritmo na superclasse mas deixa as subclasses
  sobrescreverem etapas específicas do algoritmo sem modificar sua estrutura.
* O padrão Template Method favorece o reaproveitamento de códigos comuns entre classes, evitando assim
  duplicações de códigos.
* [Mais sobre o Template Method](https://refactoring.guru/design-patterns/template-method)

---

## 04. State

### 4.4 Entendendo o State

* É um padrão de projeto comportamental que permite que um objeto altere seu comportamento quando seu estado interno
  muda. Parece como se o objeto mudasse de classe.
* [Mais sobre o State](https://refactoring.guru/design-patterns/state)
    * O padrão State é comumente usado em Java para converter enormes máquinas de estado baseadas no switch para dentro
      dos objetos.

---

## 05. Command

### 5.3 Aplicando o pattern Command

* É um padrão que tem uma representação de um comando que precisa ser executado.
* É utilizado em várias classes e cada uma delas vai ter um método em comum que é um método para executar alguma lógica.
* Command é, provavelmente, um dos que mais gera confusão, principalmente no mundo de desenvolvimento web em geral, já
  que alguns conceitos mais específicos pro mundo da web surgiram e são diferentes dos existentes em aplicações desktop.
* [Mais sobre o Command (definido no livro da GoF)](https://refactoring.guru/design-patterns/command)
    * Também é muito interessante o estudo de alguns padrões de arquitetura de software, como **Domain Driven Design e
      Clean Architecture** (padrão de Command Handlers)

---

## 06. Observer

* Um Command Handler tem como responsabilidade, apenas orquestrar as tarefas a serem executadas, ou seja,
  chamar as classes necessárias que realizam as tarefas desejadas.
* Por quais motivos separar cada uma das tarefas em classes distintas é benéfico?
    * Com classes menores e mais concisas, é mais fácil encontrar possíveis problemas.
    * Porque a implementação de cada tarefa pode mudar com o tempo e o Command Handler não deve precisar saber disso.
* Deixar a implementação de todas as tarefas de um caso de uso da aplicação na mesma classe pode trazer problemas:
  Dificuldade de manutenção;
    * Classes muito grandes e difíceis de ler;
    * Problemas quando precisar alterar a implementação de uma das tarefas.
    * Que é mais interessante separar cada ação em uma classe separada;
    * Como ligar um evento ocorrido com suas ações, através do padrão Observer.
* Observer é comumente utilizado por diversas bibliotecas que trabalham com eventos. Muitas tecnologias em Java, como o
  Spring e o CDI, possuem componentes que nos auxiliam a trabalhar com eventos.
* [Mais sobre Observer](https://refactoring.guru/design-patterns/observer)

---

## [Certificado](https://cursos.alura.com.br/user/wesleyschwartzz/course/introducao-design-patterns-java/certificate)









