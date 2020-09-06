package ejemplo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static ejemplo.DriverFactory.getChromeWebDriver;

public class CoursePage {
    private WebDriver driver = getChromeWebDriver();

    public void verifyFreeTrialIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]"))
                .isDisplayed());
    }

    public void verifyCoursePreviewIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]"))
                .isDisplayed());
    }
}
