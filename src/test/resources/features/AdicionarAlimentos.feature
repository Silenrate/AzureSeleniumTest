@AdicionarAlimentos
Feature: Adicionar alimentos dentro de la aplicacion

  @Scenario:AdicionCorrecta
  Scenario: Adicionar un alimento de forma correcta
    Given Como un usuario registrado
    When Quiero adicionar un alimento
    Then Validar que mi alimento se haya agregado