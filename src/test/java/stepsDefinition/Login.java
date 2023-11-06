package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import login.pages.LoginPage;

public class Login {

    private LoginPage login;

    public Login(){
        login = new LoginPage();
    }
    @Given("Fill out {} and {}")
    public void fillOutAnd(String username, String password) {
        login.username(username);
        login.password(password);
    }

    @Then("Press login button")
    public void pressLoginButton() {
        login.pressButton();
    }
}
