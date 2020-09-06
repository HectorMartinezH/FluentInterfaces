package ejemplo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static ejemplo.DriverFactory.getChromeWebDriver;

public class CoursePage {
    private WebDriver driver = getChromeWebDriver();

    private CoursePage(){}

    public static CoursePage getCoursePage() {
        return new CoursePage();
    }

    public CoursePage verifyFreeTrialIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]"))
                .isDisplayed());
        return this;
    }

    public CoursePage verifyCoursePreviewIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]"))
                .isDisplayed());
        return this;
    }
}
