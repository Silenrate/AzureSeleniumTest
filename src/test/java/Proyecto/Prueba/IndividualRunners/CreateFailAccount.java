package Proyecto.Prueba.IndividualRunners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/", tags = {"@Scenario:NoCrearCuenta"})
public class CreateFailAccount {
}
