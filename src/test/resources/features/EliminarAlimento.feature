@EliminarAlimento
Feature: Eliminar alimentos dentro de la aplicacion

  @Scenario:EliminacionCorrecta
  Scenario: Eliminar un alimento de forma correcta
    Given Como un usuario registrado
    When Quiero eliminar el alimento "<nombre>"
    Then Validar que mi alimento se haya eliminado

    Examples:
      | nombre  |
      | Manzana |