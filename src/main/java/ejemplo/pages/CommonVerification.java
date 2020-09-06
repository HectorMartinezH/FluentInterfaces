package ejemplo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static ejemplo.DriverFactory.getChromeWebDriver;

public class CommonVerification {
    WebDriver driver = getChromeWebDriver();

    private CommonVerification() {}

    public static CommonVerification getCommonVerification() {
        return new CommonVerification();
    }

    public CommonVerification verifyIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }

    public CommonVerification verifyIsNotDisplayed(By element) {
        Assert.assertFalse(driver.findElement(element).isDisplayed());
        return this;
    }

}
