@AgregarAlimento
Feature: Adicionar alimentos dentro de la aplicacion

  @Scenario:AdicionIncorrecta
  Scenario: No adicionar un alimento sin nombre
    Given Como un usuario registrado
    When Quiero adicionar un alimento sin nombre
    Then Validar que el alimento no se haya agregado

  @Scenario:AdicionCorrecta
  Scenario Outline: Adicionar un alimento de forma correcta
    Given Como un usuario registrado
    When Quiero adicionar un alimento con el nombre "<nombre>"
    Then Validar que mi alimento se haya agregado con el nombre "<nombre>"

    Examples:
      | nombre  |
      | Manzana |
