package ejemplo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

    public static WebDriver driver;
    public static WebDriverWait wait;

    private DriverFactory() {

    }

    public static WebDriver getChromeWebDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chrome\\85\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static WebDriverWait getWebDriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(getChromeWebDriver(), 5);
        }
        return wait;
    }
}
