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

    @When("^Quiero crear una Cuenta con mis nombre de usuario$")
    public void quiero_crear_una_Cuenta_Con_mis_datos_personales() throws Exception {
        PruebaSteps.DatosPersonales();
    }


    @When("^Un passwd correcto$")
    public void un_passwd_correcto() throws Exception {
        PruebaSteps.Contrasena();
    }

    @Then("^Validar que la cuenta se haya creado$")
    public void validar_que_la_cuenta_se_pueda_Crear() throws Exception {
        PruebaSteps.ValidacionCrearCuenta();
    }

    @Given("^Como un usuario que tiene cuenta de Email$")
    public void como_un_usuario_que_tiene_cuenta_de_Email() throws Exception {
        PruebaSteps.IngresarCrearCuenta();
    }

    @When("^Quiero crear una Cuenta con el nombre \"([^\"]*)\"$")
    public void quiero_crear_una_Cuenta_Con_el_nombre(String username) throws Exception {
        PruebaSteps.IngresarCrearCuenta(username);
    }


    @When("^Un passwd correcto \"([^\"]*)\"$")
    public void un_passwd_correcto(String password) throws Exception {
        PruebaSteps.Contrasena(password);
    }

    @Then("^Validar que la cuenta no se pueda Crear \"([^\"]*)\"$")
    public void validar_que_la_cuenta_no_se_pueda_Crear(String arg1) throws Exception {
        PruebaSteps.validarMensajeDeError(arg1);
    }

    @Given("^Como un usuario que aun no se registra$")
    public void como_un_usuario_que_aun_no_se_registra() throws Exception {
        PruebaSteps.IngresarLogin();
    }

    @When("^Quiero registrarme con mi nombre de usuario$")
    public void quiero_registrarme_con_mi_nombre_de_usuario() throws Exception {
        PruebaSteps.IngresarNombre();
    }

    @When("^mi clave correcta$")
    public void mi_clave_correcta() throws Exception {
        PruebaSteps.IngresarClave();
    }

    @Then("^Validar que me haya autenticado$")
    public void validar_que_me_haya_autenticado() throws Exception {
        PruebaSteps.validarLogin();
    }

    @When("^una clave incorrecta$")
    public void una_clave_incorrecta() throws Exception {
        PruebaSteps.IngresarClaveIncorrecta();
    }

    @Then("^Validar que no me haya autenticado$")
    public void validar_que_no_me_haya_autenticado() throws Exception {
        PruebaSteps.validarLoginFallido();
    }

    @Given("^Como un usuario registrado$")
    public void como_un_usuario_registrado() throws Exception {
        PruebaSteps.IngresarLogin();
        PruebaSteps.IngresarNombre();
        PruebaSteps.IngresarClave();
    }

    @When("^Quiero adicionar un alimento con el nombre \"([^\"]*)\"$")
    public void quiero_adicionar_un_alimento(String nombre) throws Exception {
        PruebaSteps.IngresarAlimento(nombre);
    }

    @Then("^Validar que mi alimento se haya agregado$")
    public void validar_que_mi_alimento_se_haya_agregado() throws Exception {
        PruebaSteps.validarAlimentoAgregado();
    }

    @When("^Quiero adicionar un alimento sin nombre$")
    public void quiero_adicionar_un_alimento_sin_nombre() throws Exception {
        PruebaSteps.IngresarAlimentoSinNombre();
    }

    @Then("^Validar que el alimento no se haya agregado$")
    public void validar_que_el_alimento_no_se_haya_agregado() throws Exception {
        PruebaSteps.validarAlimentoNoAgregado();
    }

    @When("^Quiero eliminar el alimento \"([^\"]*)\"$")
    public void quiero_eliminar_un_alimento(String nombre) throws Exception {
        PruebaSteps.IngresarAlimento(nombre);
        PruebaSteps.EliminarAlimento();
    }

    @Then("^Validar que mi alimento se haya eliminado$")
    public void validar_que_mi_alimento_se_haya_eliminado() throws Exception {
        PruebaSteps.validarAlimentoEliminado();
    }

}
