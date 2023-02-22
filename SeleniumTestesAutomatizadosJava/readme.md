## [Selenium: testes automatizados de aceitação em Java](https://cursos.alura.com.br/course/selenium-testes-automatizados-aceitacao-java/)

### O que é o Selenium

* Selenium é um framework opensources nascido em 2004 para testes end-to-end. O Selenium fornece uma ferramenta de
  reprodução para a criação de testes funcionais sem a necessidade de aprender uma linguagem de script de teste. O Mas
  sim um script escrito em Java ou Python que pode ser integrado ao Selenium, é responsável pela abstração do protocolo
  de comunicação com o browser.

---

## [DOC selenium](https://www.selenium.dev/)

Depedency maven:
<br>`<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>3.141.59</version>
</dependency>
`
---

## [Page object models](https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/)

* Devido à legibilidade do código, dos testes e até uma possivel troca de framework, é indicado separar a API do
  Selenium dos testes.
* Isso pode ser feito a partir de um padrão que hoje é recomendado do próprio Selenium: o **Page Object**, que serve
  para melhorar a legibilidade do código e facilitar a manutenção.
* Um **objeto de página** é uma classe orientada a objetos que serve como uma interface para uma página do seu AUT. Os
  testes então usam os métodos desta classe de objeto de página sempre que precisam interagir com a interface do usuário
  dessa página.

---

## [Certificado](https://cursos.alura.com.br/user/wesleyschwartz/course/selenium-testes-automatizados-aceitacao-java/certificate)