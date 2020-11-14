package Proyecto.Prueba.PageObject;

import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://foodapitacs.herokuapp.com/signup.html")
public class SignupPageObject extends PageObject{

	String TXT_CONTRASENA="TACS123";

	@FindBy(id="name_signup")
	public WebElementFacade TXT_NOMBRE;

	@FindBy(id="pass")
	public WebElementFacade TXT_PASSWD;
	
	@FindBy(xpath="//*[@id=\"register-form\"]/div[3]/button")
	public WebElementFacade BTN_SIGUIENTE;

	@FindBy(xpath="/html/body/div[2]")
	public WebElementFacade LBL_CONFIRMACION;
	
	
	public void EscribirNombre() {
		TXT_NOMBRE.sendKeys("SeleniumTester");
		}

	public void EscribirPasswd() {
		TXT_PASSWD.sendKeys(TXT_CONTRASENA);
	}

	public void InteractuarSiguiente() {
		BTN_SIGUIENTE.click();
	}

	public void LeerResultado() {
		waitFor(5).milliseconds();
		String strMensaje = LBL_CONFIRMACION.getText();
		assertThat(strMensaje,is("Signed in successfully"));
	}

	public void EscribirNombre(String nombres) {
		TXT_NOMBRE.sendKeys(nombres);
	}

	public void EscribirPasswd(String passwd) {
		TXT_PASSWD.sendKeys(passwd);
	}


	
}
