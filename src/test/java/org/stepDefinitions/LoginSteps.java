package org.stepDefinitions;

import org.utils.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.pages.LoginPage;


public class LoginSteps {

    public LoginSteps(DriverFactory driverFactory) {
    }

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        DriverFactory.getDriver().get("https://automationexercise.com");
    }

    @When("I open the login page")
    public void i_open_the_login_page() {
        DriverFactory.getDriver().getTitle().contains("Automation Exericse");
    }

    // @When("I enter username {string} and password {string}")
    // public void i_enter_username_and_password(String username, String password) {
    //     loginPage.enterCredentials(username, password);
    // }

    @Then("I should see the homepage")
    public void i_should_see_the_homepage() {
        DriverFactory.getDriver().getTitle().contains("Automation Exericse");
    }
}
