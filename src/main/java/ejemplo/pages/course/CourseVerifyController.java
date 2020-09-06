package ejemplo.pages.course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static ejemplo.DriverFactory.getChromeWebDriver;

public class CourseVerifyController {

    WebDriver driver = getChromeWebDriver();

    public CourseVerifyController verifyIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }

    public CourseVerifyController verifyIsNotDisplayed(By element) {
        Assert.assertFalse(driver.findElement(element).isDisplayed());
        return this;
    }

}
