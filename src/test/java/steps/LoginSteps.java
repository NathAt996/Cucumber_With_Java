package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    private boolean isLoggedIn = false;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Navigating to the login page");
    }

    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password() {
        System.out.println("Entering valid credentials");
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        System.out.println("Clicking the login button");
        isLoggedIn = true;
    }

    @Then("I should be navigated to the home page")
    public void i_should_be_navigated_to_the_home_page() {
        System.out.println("Verifying navigation to the home page");
        Assert.assertTrue("User should be logged in", isLoggedIn);
    }
}