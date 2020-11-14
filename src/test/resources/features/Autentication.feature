@Autentication
Feature: Realizar Autenticacion dentro de la aplicacion

  @Scenario:AutenticacionCorrecta
  Scenario: Autenticarse con datos Validos
    Given Como un usuario que aun no se registra
    When Quiero registrarme con mi nombre de usuario
    And mi clave correcta
    Then Validar que me haya autenticado
