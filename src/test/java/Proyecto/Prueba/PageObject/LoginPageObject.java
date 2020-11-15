package Proyecto.Prueba.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DefaultUrl("https://foodapitacs.herokuapp.com/login.html")
public class LoginPageObject extends PageObject {

    String password = "prueba";

    @FindBy(id = "username")
    public WebElementFacade TXT_NOMBRE;

    @FindBy(id = "password")
    public WebElementFacade TXT_CLAVE;

    @FindBy(id = "sign_in")
    public WebElementFacade BTN_LOGIN;

    @FindBy(id = "welcome")
    public WebElementFacade LBL_WELCOME;

    @FindBy(id = "swal2-content")
    public WebElementFacade LBL_ERROR;

    public void ingresarNombre() {
        TXT_NOMBRE.sendKeys("walteros");
    }

    public void ingresarClave() {
        TXT_CLAVE.sendKeys(password);
        BTN_LOGIN.click();
    }

    public void validarLogin() {
        waitFor(5).seconds();
        String nombre = LBL_WELCOME.getText();
        assertThat(nombre, is("Welcome walteros"));
    }

    public void ingresarClaveIncorrecta() {
        TXT_CLAVE.sendKeys("12345");
        BTN_LOGIN.click();
    }

    public void validarLoginFallido() {
        waitFor(2).seconds();
        String error = LBL_ERROR.getText();
        assertThat(error, is("Usuario o clave incorrectos"));
    }
}
