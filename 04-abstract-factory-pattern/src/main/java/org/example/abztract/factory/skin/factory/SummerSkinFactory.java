package org.example.abztract.factory.skin.factory;

import org.example.abztract.factory.skin.button.Button;
import org.example.abztract.factory.skin.button.SummerButton;
import org.example.abztract.factory.skin.comboBox.ComboBox;
import org.example.abztract.factory.skin.comboBox.SummerComboBox;
import org.example.abztract.factory.skin.textfield.SummerTextField;
import org.example.abztract.factory.skin.textfield.TextField;

public class SummerSkinFactory implements SkinFactory{
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
