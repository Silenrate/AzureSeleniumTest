package Proyecto.Prueba.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DefaultUrl("https://foodapitacs.herokuapp.com/index.html")
public class IndexPageObject extends PageObject {

    @FindBy(id = "new_name")
    public WebElementFacade TXT_NEW_FOOD;

    @FindBy(id = "createFood")
    public WebElementFacade BTN_ADD_FOOD;

    @FindBy(xpath = "//*[@id=\"table_body\"]/tr/td[1]")
    public WebElementFacade LBL_FOOD_NAME;

    @FindBy(id = "swal2-content")
    public WebElementFacade LBL_ERROR;

    @FindBy(xpath = "//*[@id=\"table_body\"]/tr/td[2]/button")
    public WebElementFacade BTN_DELETE_FOOD;

    @FindBy(id = "table_footer")
    public WebElementFacade LBL_TABLE_FOOTER;

    public void ingresarNombreAlimento(String nombre) {
        TXT_NEW_FOOD.sendKeys(nombre);
    }

    public void agregarAlimento() {
        BTN_ADD_FOOD.click();
    }

    public void validarAlimentoAgregado(String nombre) {
        waitFor(2).seconds();
        String name = LBL_FOOD_NAME.getText();
        assertThat(name, is(nombre));
        BTN_DELETE_FOOD.click();
    }

    public void validarAlimentoNoAgregado() {
        waitFor(2).seconds();
        String error = LBL_ERROR.getText();
        assertThat(error, is("Error al insertar"));
    }

    public void eliminarAlimento() {
        waitFor(2).seconds();
        BTN_DELETE_FOOD.click();
    }

    public void validarAlimentoEliminado() {
        waitFor(2).seconds();
        String error = LBL_TABLE_FOOTER.getText();
        assertThat(error, is("No se encontraron alimentos"));
    }
}
