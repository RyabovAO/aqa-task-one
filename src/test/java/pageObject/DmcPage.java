package pageObject;

import dataobject.FormRegistration;

import java.util.ArrayList;
import java.util.List;

public class DmcPage extends BasePage {

    private static final String DMC_TITLE =
            "//*[contains(@class, 'text-wrapper')]//*[contains(@class, 'title word-breaking')]";
    private static final String SEND_APP_BUTTON = "//*[contains(@type, 'button')]";
    private static final String LABEL_NAME = "//*[contains(@class, 'input__label text')]";
    private static final String NAME_FIELD = "//*[contains(@name, 'userName')]";
    private static final String PHONE_FIELD = "//*[contains(@name, 'userTel')]";
    private static final String MAIL_FIELD = "//*[contains(@name, 'userEmail')]";
    private static final String ADDRESS_FILED = "//*[contains(@field, 'InputRegion')]//*[contains(@type, 'text')]";
    private static final String ACCEPT_CHECKBOX = "//*[contains(@class, 'form__checkbox')]//*";
    private static final String SUBMIT_BUTTON = "//*[contains(@class, 'form__button-submit')]";
    private static final String ALL_VALUE =
            "//*[contains(@class, 'input__label text--second')]//following-sibling::div//input";
    private static final String EMAIL_VALIDATE_MESSAGE =
            "//*[contains(@name, 'userEmail')]//..//..//*[contains(@class, 'input__error text--small')]";
    private static final String NAME = "Алексей Рябов";
    private static final String PHONE = "80000000000";
    private static final String MAIL = "qweasd";
    private static final String ADDRESS = "Asd";

    public String getTitle() {
        String title = label.getText(DMC_TITLE);
        return title;
    }

    public void clickSendAppButton() {
        button.clickButton(SEND_APP_BUTTON);
    }

    public boolean isVisibleForm() {
        return label.isVisible(LABEL_NAME);
    }

    public void inputName(FormRegistration formRegistration) {
        label.waitElement(MAIL_FIELD);
        field.inputChars(NAME_FIELD, formRegistration.getName());
    }

    public void inputPhone(FormRegistration formRegistration) {
        field.inputChars(PHONE_FIELD, formRegistration.getPhone());
    }

    public void inputMail(FormRegistration formRegistration) {
        field.inputChars(MAIL_FIELD, formRegistration.getMail());
    }

    public void inputAddress(FormRegistration formRegistration) {
        field.inputChars(ADDRESS_FILED, formRegistration.getAddress());
    }

    public void clickAccept() {
        button.clickButtonJs(ACCEPT_CHECKBOX);
    }

    public void clickSubmitButton() {
        button.clickButtonJs(SUBMIT_BUTTON);
    }

    public boolean isCorrectValue(FormRegistration formRegistration) {
        List<String> list  = label.getTextFromList(ALL_VALUE);
        return list.equals(formRegistration.getListValue());
    }

    public String getEmailValidateMessage() {
        return label.getText(EMAIL_VALIDATE_MESSAGE);
    }

}
