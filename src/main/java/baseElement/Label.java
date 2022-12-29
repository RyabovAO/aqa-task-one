package baseElement;

import java.util.ArrayList;
import java.util.List;

public class Label extends BaseElement {

    public String getText(String xpath) {
        return waitElement(xpath).getText();
    }

    public List<String> getTextFromList(String xpath) {
        List<String> list = new ArrayList<>();
        findElements(xpath).forEach(elem -> list.add(elem.getAttribute("value")));
        return list;
    }
}
