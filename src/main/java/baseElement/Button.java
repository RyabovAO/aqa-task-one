package baseElement;

import org.openqa.selenium.JavascriptExecutor;

public class Button extends BaseElement {

    public void clickButton(String xpath) {
        waitElement((xpath)).click();
    }

    public void clickButtonJs(String xpath) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", waitElement(xpath));
    }
}
