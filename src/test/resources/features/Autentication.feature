@Autentication
Feature: Realizar Autenticacion dentro de la aplicacion

  @Scenario:AutenticacionCorrecta
  Scenario: Autenticarse con datos Validos
    Given Como un usuario que aun no se registra
    When Quiero registrarme con mi nombre de usuario
    And mi clave correcta
    Then Validar que me haya autenticado

  @Scenario:AutenticacionIncorrecta
  Scenario: Intentar autenticarse con datos invalidos
    Given Como un usuario que aun no se registra
    When Quiero registrarme con mi nombre de usuario
    And una clave incorrecta
    Then Validar que no me haya autenticado
