package webDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverConfig {
    private final static String INCOGNITO = "--incognito";

    public static ChromeOptions configChrome() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        options.addArguments(INCOGNITO);
        return options;
    }
}
