package ejemplo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static ejemplo.DriverFactory.getChromeWebDriver;
import static ejemplo.DriverFactory.getWebDriverWait;

public class BaseTestClass {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void startBrowser() {
        driver = getChromeWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = getWebDriverWait();
    }

    @BeforeMethod
    public void goToHome(){
        //driver.get("file:///C:/website/HomePage.html");
        driver.get("file:///D:/personal/PluraSight/FluentInterface/" +
                "automated-tests-java-fluent-interface-webdriver-selenium/" +
                "automated-tests-in-java-with-fluent-interface-using-webdriver-selenium-exercise-files/website/HomePage.html");
    }

    @AfterSuite(alwaysRun = true)
    public void closeBrowser(){
        driver.close();
    }
}

