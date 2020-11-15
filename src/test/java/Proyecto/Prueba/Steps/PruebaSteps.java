package Proyecto.Prueba.Steps;

import Proyecto.Prueba.PageObject.IndexPageObject;
import Proyecto.Prueba.PageObject.LoginPageObject;
import Proyecto.Prueba.PageObject.SignupPageObject;
import net.thucydides.core.annotations.Step;

public class PruebaSteps {

    SignupPageObject signupPageObject;
    LoginPageObject loginPageObject;
    IndexPageObject indexPageObject;

    @Step
    public void IngresarCrearCuenta() {
        signupPageObject.open();
    }

    @Step
    public void DatosPersonales() {
        signupPageObject.EscribirNombre();
    }

    @Step
    public void Contrasena() {
        signupPageObject.EscribirPasswd();
        signupPageObject.InteractuarSiguiente();
    }

    @Step
    public void ValidacionCrearCuenta() {
        signupPageObject.LeerResultado();
    }

    @Step
    public void IngresarCrearCuenta(String nombre) {
        signupPageObject.EscribirNombre(nombre);
    }

    public void Contrasena(String passwd) {
        signupPageObject.EscribirPasswd(passwd);
        signupPageObject.InteractuarSiguiente();
    }

    public void validarMensajeDeError(String arg1) {
        signupPageObject.validarMensajeDeError(arg1);
    }

    public void IngresarLogin() {
        loginPageObject.open();
    }

    public void IngresarNombre() {
        loginPageObject.ingresarNombre();
    }

    public void IngresarClave() {
        loginPageObject.ingresarClave();
    }

    public void validarLogin() {
        loginPageObject.validarLogin();
    }

    public void IngresarClaveIncorrecta() {
        loginPageObject.ingresarClaveIncorrecta();
    }

    public void validarLoginFallido() {
        loginPageObject.validarLoginFallido();
    }

    public void IngresarAlimento() {
        indexPageObject.ingresarNombreAlimento();
        indexPageObject.agregarAlimento();
    }

    public void validarAlimentoAgregado() {
        indexPageObject.validarAlimentoAgregado();
    }
}
