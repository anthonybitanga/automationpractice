package org.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    private static WebDriver driver;

public static WebDriver getDriver() {
        if (driver == null) { // Initialize the driver if it's null
            WebDriverManager.chromedriver().setup(); // Automatically downloads and sets up ChromeDriver
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver; // Return the initialized driver
    }
    
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
