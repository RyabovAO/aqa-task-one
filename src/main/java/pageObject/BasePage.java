package pageObject;

import baseElement.Button;
import baseElement.Field;
import baseElement.Label;

public abstract class BasePage {

    public Button button = new Button();
    public Field field = new Field();
    public Label label = new Label();
}
