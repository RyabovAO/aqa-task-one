package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageObject.DmcPage;
import pageObject.StartPage;
import webDriver.WebDriverCreate;

public class RgsTest {

    private final static String URL = "https://www.rgs.ru/";
    private StartPage startPage = new StartPage();
    private DmcPage dmcPage = new DmcPage();

    @Before
    public void startTest() {
        WebDriverCreate.getDriver().get(URL);
    }

    @Test
    public void testCase() {
        Assert.assertTrue("Стартовая страница не открылась", startPage.isOpen());

        startPage.clickCompaniesButton();
        startPage.closeFrame();
        startPage.clickHealthButton();
        startPage.clickDmcButton();

        Assert.assertEquals("Страница Здоровье не открыта", "Добровольное медицинское страхование",
                dmcPage.getTitle());

        dmcPage.clickSendAppButton();
        Assert.assertTrue("Форма для заполнения не видима", dmcPage.isVisibleForm());

        dmcPage.inputName();
        dmcPage.inputPhone();
        dmcPage.inputMail();
        dmcPage.inputAddress();
        dmcPage.clickAccept();
        Assert.assertTrue("Значения не совпадают", dmcPage.isCorrectValue());

        dmcPage.clickSubmitButton();
        Assert.assertEquals("Сообщение не появилось",
                "Введите корректный адрес электронной почты", dmcPage.getEmailValidateMessage());
    }


    @After
    public void endTest() {
        WebDriverCreate.closeDriver();
    }
}
