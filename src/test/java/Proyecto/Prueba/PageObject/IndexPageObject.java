package Proyecto.Prueba.PageObject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DefaultUrl("https://foodapitacs.herokuapp.com/index.html")
public class IndexPageObject extends PageObject {

    String foodName = "Pizza";

    @FindBy(id = "new_name")
    public WebElementFacade TXT_NEW_FOOD;

    @FindBy(id = "createFood")
    public WebElementFacade BTN_ADD_FOOD;

    @FindBy(xpath = "//*[@id=\"table_body\"]/tr/td[1]")
    public WebElementFacade LBL_FOOD_NAME;

    @FindBy(id = "swal2-content")
    public WebElementFacade LBL_ERROR;

    public void ingresarNombreAlimento() {
        TXT_NEW_FOOD.sendKeys(foodName);
    }

    public void agregarAlimento() {
        BTN_ADD_FOOD.click();
    }

    public void validarAlimentoAgregado() {
        waitFor(2).seconds();
        String name = LBL_FOOD_NAME.getText();
        assertThat(name, is(foodName));
    }

    public void validarAlimentoNoAgregado() {
        waitFor(2).seconds();
        String error = LBL_ERROR.getText();
        assertThat(error, is("Name cannot be empty"));
    }
}
