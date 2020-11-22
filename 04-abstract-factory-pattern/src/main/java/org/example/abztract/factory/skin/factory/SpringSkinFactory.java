package org.example.abztract.factory.skin.factory;

import org.example.abztract.factory.skin.button.Button;
import org.example.abztract.factory.skin.button.SpringButton;
import org.example.abztract.factory.skin.comboBox.ComboBox;
import org.example.abztract.factory.skin.comboBox.SpringComboBox;
import org.example.abztract.factory.skin.textfield.SpringTextField;
import org.example.abztract.factory.skin.textfield.TextField;

public class SpringSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
