package baseElement;

public class Field extends BaseElement {

    public void inputChars(String xPath, Object obj) {
        waitElement(xPath).sendKeys((CharSequence) obj);
    }
}
