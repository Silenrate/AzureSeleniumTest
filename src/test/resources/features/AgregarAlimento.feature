@AgregarAlimento
Feature: Adicionar alimentos dentro de la aplicacion

  @Scenario:AdicionCorrecta
  Scenario: Adicionar un alimento de forma correcta
    Given Como un usuario registrado
    When Quiero adicionar un alimento
    Then Validar que mi alimento se haya agregado

  @Scenario:AdicionIncorrecta
  Scenario: No adicionar un alimento sin nombre
    Given Como un usuario registrado
    When Quiero adicionar un alimento sin nombre
    Then Validar que el alimento no se haya agregado