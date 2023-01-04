# [Design Patterns em Java II: avançando nas boas práticas de programação](https://cursos.alura.com.br/course/solid-orientacao-objetos-java)

***

## 01. **Adapters** para reutilizar dependências

### 1.1 Apresentação:

* "Solução comum para um problema recorrente ao utilizar o paradigma da orientação a objetos"
* Padrões - **Estruturais**:
    * Adapter
    * Decorator
    * Composite
    * Facade
    * Proxy

---

### 1.2 API de registro de orçamento

* Quando um orçamento for finalizado, temos mais uma ação que precisamos disparar, precisamos registrar esse orçamento
  em uma API externa.
* Depender sempre de abstrações, e não de implementações específicas.
    * Inclusive, esse é um dos princípio de SOLID (Dependency Inversion Principle, a letra D). Devemos sempre preferir
      depender de abstrações, ou seja, interfaces ou classes abstratas, sempre que possível, ao invés de implementações
      específicas.

### 1.4 Aplicando o pattern Adapter

* Usa adaptadores sem mexer no código existente. Isso gera flexibilidade ao código.
* Detalhes de infraestrutura devem ser abstraídos através de interfaces
* Como o padrão Adapter pode nos ajudar a trocar detalhes de infraestrutura, sem muitas dores de cabeça
* [Mais sobre o Adapter](https://refactoring.guru/design-patterns/adapter)

---

## 02. Mais de um imposto com **Decorators**.

### 2.3 Aplicando o pattern Decorator

* O padrão Decorator permite adicionar novos comportamentos a um objeto, tornando o código bastante flexível e
  dinâmico.
* [Mais sobre o **Decorator**](https://refactoring.guru/design-patterns/decorator)

---

## 03. Compondo orçamentos com **Composite**

### 3.2 Compondo orçamentos

* O Composite é um padrão de projeto estrutural que permite a composição de objetos em estruturas de árvores e então
  trabalhe com essas estruturas como se elas fossem objetos individuais.
* [Mais sobre o *Composite*](https://refactoring.guru/design-patterns/composite)

---

## 04. Facade para gerar pedidos

* Facade é um padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, um framework, ou
  qualquer conjunto complexo de classes.
* [Mais Sobre o *Facade*](https://refactoring.guru/pt-br/design-patterns/facade)

## 05. Proxy para cache

* O Proxy é um padrão de projeto estrutural que permite que você forneça um substituto ou um espaço reservado para
  outro objeto.
* Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do
  pedido chegar ao objeto original.
* [Mais sobre *Proxy*](https://refactoring.guru/pt-br/design-patterns/proxy)

---
[Certifcado](https://cursos.alura.com.br/certificate/wesleyschwartz/avancando-design-patterns-java)