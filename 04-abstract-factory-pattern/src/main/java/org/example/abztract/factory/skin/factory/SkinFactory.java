package org.example.abztract.factory.skin.factory;

import org.example.abztract.factory.skin.button.Button;
import org.example.abztract.factory.skin.comboBox.ComboBox;
import org.example.abztract.factory.skin.textfield.TextField;

public interface SkinFactory {
    public Button createButton();

    public ComboBox createComboBox();

    public TextField createTextField();
}
