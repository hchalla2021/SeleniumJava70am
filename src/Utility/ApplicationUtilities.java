package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationUtilities {
    public static void clickelement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }
    public static void Enetertext(WebDriver driver, By locator,String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys();
    }
}
