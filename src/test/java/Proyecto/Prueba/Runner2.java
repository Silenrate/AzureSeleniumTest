package Proyecto.Prueba;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features/")
//@CucumberOptions(features = "src/test/resources/features/",  glue = "Definitions")
@CucumberOptions(features = "src/test/resources/features/", tags = {"@Scenario:RepetirCaso"})
//@CucumberOptions(features = "src/test/resources/features/", tags = {"@Scenario:InteraccionLinksTuPlus"})
public class Runner2 {
}
