package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
    @Given("Navigate to SouceDemo")
    public void navigateToSouceDemo() {
    }

    @When("Fill out {} and {}")
    public void fillOutAnd(String username, String password) {
    }

    @Then("Press login button")
    public void pressLoginButton() {
    }
}
