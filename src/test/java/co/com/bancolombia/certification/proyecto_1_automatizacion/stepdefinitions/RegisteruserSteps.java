package co.com.bancolombia.certification.proyecto_1_automatizacion.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyecto_automatizacion.tasks.LogOutPage;
import proyecto_automatizacion.tasks.Login;
import proyecto_automatizacion.utils.Home;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisteruserSteps {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
        theActorCalled("kevin");

    }

    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().attemptsTo(Open.browserOn(new Home()));

    }

    @When("^user create an account filling all fields$")
    public void userCreateAnAccountFillingAllFields() {

        theActorInTheSpotlight().attemptsTo(Login.login());

    }

    @Then("^user sees its username$")
    public void userSeesItsUsername() {

        theActorInTheSpotlight().attemptsTo(LogOutPage.logOutPage());

    }
}
