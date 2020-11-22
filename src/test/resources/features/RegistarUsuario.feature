@CrearCuentaCorreo
Feature: Realizar Creacion de Cuenta de Correo

  @Scenario:CrearCuenta
  Scenario: Crear Cuenta con datos Validos
    Given Como un usuario que no tiene cuenta de Email
    When Quiero crear una Cuenta con mis nombre de usuario
    And Un passwd correcto
    Then Validar que la cuenta se haya creado


  @Scenario:NoCrearCuenta
  Scenario Outline: Crear Cuenta Con datos No Validos
    Given Como un usuario que tiene cuenta de Email
    When Quiero crear una Cuenta con el nombre "<username>"
    And Un passwd correcto "<password>"
    Then Validar que la cuenta no se pueda Crear "<mensaje>"

    Examples:
      | username | password    | mensaje                               |
      | walteros | Testing123% | Ya existe un usuario con dicho correo |
      |          | aaaa        | The name cannot be empty              |
