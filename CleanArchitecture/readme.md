## [Java e Clean Architecture: descomplicando arquitetura de software](https://cursos.alura.com.br/course/java-clean-architecture)

### O que é Arquitetura de software?

* É algo muito subjetivo, cada autor tem a sua definição
    * IEEE o 1471-2000 define como práticas e fundamentos de como é organizado um sistema, relaciona os components, como
      irá ser gerenciado o design e a eveolução do código
    * Barry Boehm, diz que a arquitetura de software é composta por um conjunto de regras:
        * Como os components estão relacionados, quais são as restrições entre eles
        * Aplicar os requisitos de negócios dos stakeholders

### O que é Clean Architecture?

* É um modelo de arquitetura, visando promover a implementação de sistemas que favorecem reusabilidade de
  código, coesão, independência de tecnologia e testabilidade.
* Temos algumas características como:
    * Isolar o código de domínio da aplicação
    * Inversão de dependencias
    * Favorece boas práticas de Orientação a Objetos
    * Código de domínio com alta "testabilidade"
    * Independência de frameworks e detalhes de infraestrutura
* Como funciona:
  ![img_1.png](img_1.png)
    * Entidades: encapsulam as regras de negócios
    * Use Cases: contém regras de negócios
    * Interface adapters: Eles têm como função mediar a interação entre a camada mais externa da arquitetura e as
      camadas centrais
    * Frameworks & Drives: bibliotecas, frameworks e quaisquer sistemas externos.

## [Certificado](https://cursos.alura.com.br/user/wesleyschwartz/course/java-clean-architecture/certificate)