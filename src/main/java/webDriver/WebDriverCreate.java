package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCreate {
    private static WebDriver driver;

    private WebDriverCreate() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver(WebDriverConfig.configChrome());
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        driver.manage().deleteAllCookies();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
