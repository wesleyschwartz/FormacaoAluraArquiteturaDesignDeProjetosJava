Feature: Apenas usuarios cadastrados podem se logar
  Scenario: Um usuario valido consegue se logar
    Given o usuario
    When tenta se logar com dados validos
    Then eh redirecionado para pagina de leiloes

  Scenario: Um usuario invalido nao consegue se logar
    Given o usuario
    When tenta se logar com dados invalidos
    Then continua na pagina de login
