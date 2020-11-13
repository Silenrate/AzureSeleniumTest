@CrearCuentaCorreo
Feature: Realizar Creacion de Cuenta de Correo

  @Scenario:CrearCuenta
  Scenario: Crear Cuenta Con datos Validos
    Given Como un usuario que no tiene cuenta de Email
    When Quiero crear una Cuenta Con mis datos personales
    	And Un passwd correcto
    Then Validar que la cuenta se pueda Crear
    

  @Scenario:NoCrearCuenta
  Scenario Outline: Crear Cuenta Con datos No Validos
    Given Como un usuario que tiene cuenta de Email 
     When Quiero crear una Cuenta Con mis lo mismos datos personales Nombre "<nombres>" Apellidos "<apellido>" y cuentas "<cuenta>"
    	And Un passwd correcto "<passwd>"
    Then Validar que la cuenta no se pueda Crear "<mensaje>"

    Examples: 
      | nombres  	   | apellido   | cuenta           |passwd       | mensaje |
      | oooo         |Perez Sosa  | userprueba20202  |Febrero2020* | Funciona|
      | Maria        |jjjjjjj     | pruebauser20202  |Bogota*2020* | Funciona|
