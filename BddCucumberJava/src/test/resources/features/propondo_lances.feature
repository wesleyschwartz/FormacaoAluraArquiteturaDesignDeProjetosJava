Feature: Propondo lances

  Scenario: Propondo um unico lance valido
    Given Dado um lance valido
    When Quando propoe ao leilao
    Then Entao o lance eh aceito

  Scenario: Propondo varios lances valido
    Given um lance de 10.0 reais do usuario "fulano"
    And um lance de 15.0 reais do usuario "beltrano"
    When Quando propoe varios lances ao leilao
    Then Entao os lances sao aceitos

  Scenario Outline: Propondo um lance invalido
    Given um lance invalido de <valor> reais e do usuario '<nomeUsuario>'
    When Quando propoe ao leilao
    Then o lance nao eh aceito
    Examples:
      | valor | nomeUsuario |
      | 0     | beltranho   |
      | -1    | cigano      |


  Scenario: Propondo uma sequencia de lances
    Given dado os dois lances
      | valor | nomeUsuario |
      | 10    | beltrano    |
      | 15    | beltrano    |
    When Quando propoe varios lances ao leilao
    Then o segundo lance nao eh aceito