package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utils.DriverFactory;

public class LoginPage {
   
    public LoginPage(DriverFactory driverFactory) {
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
        assert DriverFactory.getDriver().getTitle().contains("Automation Exericse");
    }
}

