package Proyecto.Prueba.PageObject;

import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp")
public class PruebaPageObject extends PageObject{
	
	/*
	 * Definicion de variables
	 * */
	String TXT_CONTRASENA="Colombia2020*";
	@FindBy(id="firstName")
	public WebElementFacade TXT_NOMBRES;
	
	@FindBy(name="lastName")
	public WebElementFacade TXT_APELLIDOS;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	public WebElementFacade TXT_USERNAME;

	@FindBy(name="Passwd")
	public WebElementFacade TXT_PASSWD;
	
	@FindBy(name="ConfirmPasswd")
	public WebElementFacade TXT_PASSWDCONF;
	
	@FindBy(id="accountDetailsNext")
	public WebElementFacade BTN_SIGUIENTE;
	
	@FindBy(id="headingText")
	public WebElementFacade LBL_CONFIRMACION;
	
	
	public void EscribirNombre() {
		TXT_NOMBRES.sendKeys("Nombre de Prueba");
		}

	public void EscribirApellidos() {
		TXT_APELLIDOS.sendKeys("Apellido Prueba");
	}


	public void EscribirUsername() {
		TXT_USERNAME.sendKeys("userprueba20202");
	}

	public void EscribirPasswd() {
		TXT_PASSWD.sendKeys(TXT_CONTRASENA);
	}


	public void EscribirRepasswd() {
		TXT_PASSWDCONF.sendKeys(TXT_CONTRASENA);
		
	}

	public void InteractuarSiguiente() {
		BTN_SIGUIENTE.click();
	}

	public void LeerResultado() {
		waitFor(5).second();
		String strMensaje = LBL_CONFIRMACION.getText();
		assertThat(strMensaje,is("Verificar tu número"));
	}

	public void EscribirNombre(String nombres) {
		TXT_NOMBRES.sendKeys(nombres);		
	}

	public void EscribirApellidos(String apellidos) {
		TXT_APELLIDOS.sendKeys(apellidos);
	}

	public void EscribirUsername(String cuenta) {
		TXT_USERNAME.sendKeys(cuenta);
	}

	public void EscribirPasswd(String passwd) {
		TXT_PASSWD.sendKeys(passwd);
	}

	public void EscribirRepasswd(String passwd) {
		TXT_PASSWDCONF.sendKeys(passwd);		
	}

	
}
