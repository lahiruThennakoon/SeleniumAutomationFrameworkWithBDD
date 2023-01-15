package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class loginSteps extends TestBase{

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("user in login page");
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("user entered credentials");
    }

    @And("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        System.out.println("user clicked on login button");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("user navigated to the homepage");
    }



}
