package Proyecto.Prueba.Steps;

import Proyecto.Prueba.PageObject.PruebaPageObject;
import net.thucydides.core.annotations.Step;

public class PruebaSteps {
	PruebaPageObject PruebaPageObject;
	
	@Step
	public void IngresarCrearCuenta() {
		PruebaPageObject.open();
		
	}
	@Step
	public void DatosPersonales() {
		PruebaPageObject.EscribirNombre();
		PruebaPageObject.EscribirApellidos();
		PruebaPageObject.EscribirUsername();
		
		
	}
	@Step
	public void Contrasena() {
		PruebaPageObject.EscribirPasswd();
		PruebaPageObject.EscribirRepasswd();
		PruebaPageObject.InteractuarSiguiente();		
	}
	@Step
	public void ValidacionCrearCuenta() {
		PruebaPageObject.LeerResultado();
		
	}
	@Step
	public void IngresarCrearCuenta(String nombres, String apellidos, String cuenta) {
		PruebaPageObject.EscribirNombre(nombres);
		PruebaPageObject.EscribirApellidos(apellidos);
		PruebaPageObject.EscribirUsername(cuenta);
		
	}
	public void Contrasena(String passwd) {
		PruebaPageObject.EscribirPasswd(passwd);
		PruebaPageObject.EscribirRepasswd(passwd);
		PruebaPageObject.InteractuarSiguiente();
		
	}

}
