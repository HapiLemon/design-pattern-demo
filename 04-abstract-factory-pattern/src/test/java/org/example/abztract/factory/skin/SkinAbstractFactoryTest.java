package org.example.abztract.factory.skin;

import org.example.abztract.factory.skin.button.Button;
import org.example.abztract.factory.skin.comboBox.ComboBox;
import org.example.abztract.factory.skin.factory.SkinFactory;
import org.example.abztract.factory.skin.textfield.TextField;
import org.example.abztract.factory.skin.utils.XMLUtil;

public class SkinAbstractFactoryTest {
    public static void main(String[] args) {
        SkinFactory skinFactory= (SkinFactory) XMLUtil.getBean();
        if (skinFactory == null) {
            return;
        }

        Button button = skinFactory.createButton();
        ComboBox comboBox = skinFactory.createComboBox();
        TextField textField = skinFactory.createTextField();

        button.display();
        comboBox.display();
        textField.display();
    }
}
