package pageObject;

public class StartPage extends BasePage {

    private static final String COMPANIES = "//*[@class='list']//*[@href = '/for-companies']";
    private static final String HEALTH =
            "//ul[contains(@class, 'list')]//span[contains(@class, 'padding') and contains(text(), 'Здоровье')]";
    private static final String DMC = "//*[contains(@href, 'dobrovolnoe-meditsinskoe-strakhovanie')]";
    private static final String FRAME_WIN = "//*[@id = 'fl-616371']";
    private static final String CLOSE = "//*[contains(@data-fl-track, 'click-close-login')]";

    public void closeFrame() {
        button.decline(FRAME_WIN, CLOSE);
    }

    public boolean isOpen() {
        return button.isVisible(COMPANIES);
    }

    public void clickCompaniesButton() {
        button.clickButton(COMPANIES);
    }

    public void clickHealthButton() {
        button.clickButton(HEALTH);
    }

    public void clickDmcButton() {
        button.clickButton(DMC);
    }


}
