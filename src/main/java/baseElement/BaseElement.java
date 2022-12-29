package baseElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriver.WebDriverCreate;
import java.time.Duration;
import java.util.List;

public abstract class BaseElement {

    protected WebDriver driver;

    public BaseElement() {
        this.driver = WebDriverCreate.getDriver();
    }

    public WebElement findByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement waitElement(String elem) {
        return new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath(elem)));
    }

    public List<WebElement> findElements(String xPath) {
        return driver.findElements(By.xpath(xPath));
    }

    public boolean isVisible(String xpath) {
        return waitElement(xpath).isDisplayed();
    }

    public boolean elementIsNotVisible(String xPath) {
        return new WebDriverWait(driver, Duration.ofSeconds(7)).
                until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xPath)));
    }

    public void decline(String xPath, String elem) {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().frame(waitElement(xPath));
        driver.findElement(By.xpath(elem)).click();
        driver.switchTo().defaultContent();
    }
}
