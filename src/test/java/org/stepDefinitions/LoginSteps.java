package org.stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.pages.LoginPage;
import org.utils.DriverFactory;


public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        driver.get("https://example.com/login");
    }

    @When("I open the login page")
    public void i_open_the_login_page() {
        // Already opened in previous step
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPage.enterCredentials(username, password);
    }

    @Then("I should see the homepage")
    public void i_should_see_the_homepage() {
        loginPage.verifyHomePage();
    }
}
