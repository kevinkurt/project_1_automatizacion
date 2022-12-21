package co.com.bancolombia.certification.proyecto_1_automatizacion.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_user.feature",
        glue = "co.com.bancolombia.certification.proyecto_1_automatizacion.stepdefinitions",
        monochrome = true,
        dryRun = false,
        snippets = SnippetType.CAMELCASE
)
public class RegisterUser {
}
