package co.com.choucair.winappdriver.calculator.stepdefinitions;

import co.com.choucair.winappdriver.calculator.tasks.OpenCalculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class CurrencyConverterSteps {
    private String actor = "Jose";

    @Given("^Jose goes to currency calculator$")
    public void joseGoesToCurrencyCalculator() {
        OnStage.theActorCalled(actor).wasAbleTo(OpenCalculator.currencyConverter());
    }

    @Given("^He set currency \"([^\"]*)\" and \"([^\"]*)\"$")
    public void heSetCurrencyAnd(String arg1, String arg2) {

    }

    @When("^He input (\\d+)$")
    public void heInput(int arg1) {

    }

    @Then("^He should see the convert curency (\\d+)$")
    public void heShouldSeeTheConvertCurency(Double arg1) {

    }

}
