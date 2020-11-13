package Proyecto.Prueba.Definition;

import Proyecto.Prueba.Steps.PruebaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PruebaDefinition {

	@Steps
	PruebaSteps PruebaSteps;
	
	@Given("^Como un usuario que no tiene cuenta de Email$")
	public void como_un_usuario_que_no_tiene_cuenta_de_Email() throws Exception {
		PruebaSteps.IngresarCrearCuenta();
	}

	@When("^Quiero crear una Cuenta Con mis datos personales$")
	public void quiero_crear_una_Cuenta_Con_mis_datos_personales() throws Exception {
		PruebaSteps.DatosPersonales();
	}


	@When("^Un passwd correcto$")
	public void un_passwd_correcto() throws Exception {
		PruebaSteps.Contrasena();
	}

	@Then("^Validar que la cuenta se pueda Crear$")
	public void validar_que_la_cuenta_se_pueda_Crear() throws Exception {
	    PruebaSteps.ValidacionCrearCuenta();
	}

	@Given("^Como un usuario que tiene cuenta de Email$")
	public void como_un_usuario_que_tiene_cuenta_de_Email() throws Exception {
		PruebaSteps.IngresarCrearCuenta();
	}
	
	@When("^Quiero crear una Cuenta Con mis lo mismos datos personales Nombre \"([^\"]*)\" Apellidos \"([^\"]*)\" y cuentas \"([^\"]*)\"$")
	public void quiero_crear_una_Cuenta_Con_mis_lo_mismos_datos_personales_Nombre_Apellidos_y_cuentas(String nombres, String apellidos, String cuenta) throws Exception {
		PruebaSteps.IngresarCrearCuenta(nombres,apellidos,cuenta);
	}


	@When("^Un passwd correcto \"([^\"]*)\"$")
	public void un_passwd_correcto(String passwd) throws Exception {
		PruebaSteps.Contrasena(passwd);
	}

	@Then("^Validar que la cuenta no se pueda Crear \"([^\"]*)\"$")
	public void validar_que_la_cuenta_no_se_pueda_Crear(String arg1) throws Exception {
	 
	}


}
