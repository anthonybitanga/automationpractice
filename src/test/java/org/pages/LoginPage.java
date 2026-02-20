package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.DriverFactory;

public class LoginPage {
   
    private final DriverFactory driverFactory;

    public LoginPage(DriverFactory driverFactory) {
        this.driverFactory = driverFactory;
    }


    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("login");

    // public void enterCredentials(String username, String password) {
    //     driver.findElement(usernameField).sendKeys(username);
    //     driver.findElement(passwordField).sendKeys(password);
    //     driver.findElement(loginButton).click();
    // }

    public void verifyHomePage() {
        assert driverFactory.getDriver().getTitle().contains("Automation Exericse");
    }
}

