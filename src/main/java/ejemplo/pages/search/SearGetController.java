package ejemplo.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static ejemplo.DriverFactory.getChromeWebDriver;
import static org.testng.Assert.assertTrue;

public class SearGetController {
    WebDriver driver = getChromeWebDriver();

    public List<String> courses() {
        List<WebElement> courses = driver.findElements(
                By.xpath("//div[@id='search-results-category-target']//div[@class='search-result__title']"));

        assertTrue(courses.size() != 0, "List is empty, failed to collect courses");
        return courses.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
