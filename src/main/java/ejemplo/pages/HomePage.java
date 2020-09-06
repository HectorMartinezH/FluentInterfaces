package ejemplo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ejemplo.DriverFactory.getChromeWebDriver;

public class HomePage {

    private WebDriver driver = getChromeWebDriver();

    private HomePage() {}

    public static HomePage getHomePage() {
        return new HomePage();
    }

    public void search(String value) {
        WebElement search = driver.findElement(By.className("header_search--input"));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
    }
}
