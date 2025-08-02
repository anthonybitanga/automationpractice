package org.automation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private WebDriver driver;

    //Locators
    private By emailInputLocator = By.xpath("//input[@id='email']");
    String FEATURE_ITEMS = "//h2[text()=\"Features Items\"]";

    //Constructor
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }
}
