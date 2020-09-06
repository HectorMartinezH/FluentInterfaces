package ejemplo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static ejemplo.DriverFactory.getChromeWebDriver;
import static ejemplo.DriverFactory.getWebDriverWait;
import static ejemplo.utils.TestUtils.explicitWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;

public class SearchPage {

    WebDriver driver = getChromeWebDriver();
    WebDriverWait wait = getWebDriverWait();

    public void filterBySkillLevel(String value){

        driver.findElement(By.xpath("//div[contains(@class, 'search-filter-header') and contains(.,'Skill Levels')]"))
                .click();

        By skillFilter = By.xpath("//span[contains(@class, 'search-filter-option-text') and contains(.,'" + value + "')]");
        wait.until(visibilityOfAllElementsLocatedBy(skillFilter));
        driver.findElement(skillFilter)
                .click();

        explicitWait();
    }

    public void filterByRole(String role){
        driver.findElement(By.xpath("//div[contains(@class, 'search-filter-header') and contains(.,'Roles')]"))
                .click();

        By roleFilter = By.xpath("//span[contains(@class, 'search-filter-option-text') and contains(.,'" + role + "')]");
        wait.until(visibilityOfAllElementsLocatedBy(roleFilter));
        driver.findElement(roleFilter)
                .click();

        explicitWait();
    }

    public void selectTabCourse(){
        driver.findElement(By.xpath("//a[contains(@class, 'tab') and contains(., 'Courses')]"))
                .click();
    }

    public void selectCourse(String courseName){
        driver.findElement(By.xpath("//div[@id='search-results-category-target']" +
                "//div[@class='search-result columns' and contains(., '" + courseName + "')]" +
                "//div[@class='search-result__title']/a"))
                .click();
    }
}
