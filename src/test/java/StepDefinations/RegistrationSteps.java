package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

    @Given("user is in home page")
    public void user_is_in_home_page() {
        System.out.println("user is on home page");
    }
    @When("admin enters users details on the registration form")
    public void admin_enters_users_details_on_the_registration_form() {
        System.out.println("user enters registration details");
    }
    @And("admin click register button")
    public void admin_click_register_button() {
        System.out.println("user click registration button");
    }
    @Then("new user is added to the database")
    public void new_user_is_added_to_the_database() {
        System.out.println("new user is created");
    }
}
