# [Curso de SOLID com Java: princípios da programação orientada a objetos](https://cursos.alura.com.br/course/solid-orientacao-objetos-java)

***

## 01. Orientação a Objetos

### 1.1 Apresentação:

* **SOLID**
    1. **S**ingle Reponsibility Principle(princípio da responsabilidade única)
    2. **O**pen Closed Principle(princípio aberto e fechado)
    3. **L**iskov Substitution Principle(princípio da substituição de Liskov),
    4. **I**nterface Segregation Principle(princípio da segregação de interface)
    5. **D**ependency Inversion Principle(princípio da inversão de dependências)

---

### OBS:

* São **três princípios** importantes na orientação a objetos.
    1. Princípio da coesão
    2. Encapsulamento
    3. Acoplamento.
* Os princípios do SOLID estão diretamente ligados com os da orientação a objetos.

---

### 1.3.Coesão:

* "União Harmônica enrte uma coisa e outra"
    * União harmônica seria as coisas que tem dentro de uma classe.
    * Os atributos e os métodos devem estar em harmonia, devem estar unidos e devem representar coisas em comum.
* "Classes não coesas tendem a crescer indefinidamente, o que as tornam difícies de manter"
* Cada classe deve ser responsável por apenas uma coisa, e deve executar esta tarefa muito bem

---

### 1.5.Encapsulamento:

* "Incluir ou proteger algo numa cápsula"
    * "Classes não encapsuladas permitem violação de regras de negócio, além de aumentarem o acoplamento"
        * Colocar os métodos "getters" e "setters" para fazer acesso a esses atributos de fora da classe, não completa
          100% o acoplamento pois o método **"setter"** permite-me acessar e manipular o atributo, logo não protegendo o
          atributo.
* Encapsulamento ajuda no uso correto dos objetos.
    * Ao encapsular o acesso a determinados dados, liberando acesso apenas ao necessário, os objetos da nossa classe se
      tornam mais fáceis de serem utilizados.

---

### 1.7.Acoplamento:

* Ação de acoplar. Agrupar pares
    * Acoplar é quando dois componentes interligados entre si, causam uma dependência entre eles, uma classe que faz a
      utilização de outra classe, uma classe A que chama uma classe B.
* É impossível criar um bom sistema sem nenhum acoplamento

***

## 02. Melhorando a coesão: (Aula focada em "mão na massa")

### 2.3 Single Responsibility Principle

* O princípio da responsabilidade única.Uma classe (ou módulo, função, etc) deve ter um e apenas um motivo para mudar

***

## 03. Reduzindo o acoplamento: (Aula focada em "mão na massa")

### 3.4 Open Closed Principle

* "Entidades de software (classes, módulos, funções, etc) devem estar abertas para extensão, porém fechadas para
  modificação"
    * Que cada classe deve conhecer e ser responsável por suas próprias regras de negócio;
        * Isso significa que devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar
          muitas classes já existentes
        * Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie de refatoração.
    * Garantir que cada ação/responsabilidade esteja na classe correta, garante que o sistema seja extensível

***

## 04. Herança indesejada

### 4.3 Utilizando herança da maneira errada..

* Extends, herança é um excelente recurso da orientação a objetos. Porém isso pode gerar um
  efeito contrário.
* No código de exemplo, terceirizado é "extends Funcionario", então estou dizendo "Terceirizado" é um funcionário.
    * Será que realmente isso é válido para esse projeto?
    * Um terceirizado é um funcionário?
        * Pode até fazer sentido, ele é um funcionário. Ele vai trabalhar na empresa, ele tem alguns atributos
          semelhantes ao funcionário
        * Mas quem realmente cuida dos detalhes de aumento e promoção é a empresa que
          terceirizou, então a empresa responsável é que adeve fazer isso e não a "nossa" classe "funcionário"

---

### 4.5 Liskov Substituton Principle

* "If It looks like a Duck, Quacks like a duck, _but needs batteries_ - **You probably have the wrong abstraction**"
    * Se parece com pato, se faz 'quack' igual um pato, mas precisa de baterias, então não é um pato, você está usando
      uma abstração errada".
* Uma alteranativa quando a henraça não fizer sentido é a Composição. Essa é uma das maneiras de evitar a herança
  sem duplicação de código.
* o Princípio de Substituição de Liskov (LSP) diz que devemos poder substituir classes base por suas classes
  derivadas em qualquer lugar, sem problema.

***

## 05. Trabalhando com abstrações

### 5.2 Criando abstrações com interfaces e polimorfismo

* Classe é um código que mexemos o tempo inteiro, logo sendo algo **instável**.
* Uma **interface costuma ser mais estável**, costuma mudar menos porque a interface está só definindo um
  contrato. Logo, automaticamente se diminui o acoplamento.

---

### 5.3 Dependency Inversion Principle

* "Abstrações **não devem** depender de implementações. Implementações **devem depender de abstrações**"
* Caso uma determinada implementação mude, o resto não será afetado, pois, dependesse apenas de uma interface.

---

### 5.4 Interface Segregation Principle

* "Uma classe não deveria ser forçada a depender de métodos que não utilizará."
    * Uma classe não deve ser obrigada a implementar um método de determinada interface, se ele não será útil. Para
      isso, uma interface deverá ser extraída apenas com os métodos necessários.

***

# [Certificado](https://cursos.alura.com.br/certificate/wesleyschwartzz/solid-orientacao-objetos-java)




