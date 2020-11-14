package Proyecto.Prueba.Steps;

import Proyecto.Prueba.PageObject.SignupPageObject;
import net.thucydides.core.annotations.Step;

public class PruebaSteps {
    SignupPageObject PruebaPageObject;

    @Step
    public void IngresarCrearCuenta() {
        PruebaPageObject.open();

    }

    @Step
    public void DatosPersonales() {
        PruebaPageObject.EscribirNombre();
    }

    @Step
    public void Contrasena() {
        PruebaPageObject.EscribirPasswd();
        PruebaPageObject.InteractuarSiguiente();
    }

    @Step
    public void ValidacionCrearCuenta() {
        PruebaPageObject.LeerResultado();
    }

    @Step
    public void IngresarCrearCuenta(String nombres) {
        PruebaPageObject.EscribirNombre(nombres);
    }

    public void Contrasena(String passwd) {
        PruebaPageObject.EscribirPasswd(passwd);
        PruebaPageObject.InteractuarSiguiente();

    }

}
