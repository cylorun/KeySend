package me.cylorun.ui.components;

import javax.swing.*;
import java.awt.*;

public class KeyInputField extends JPanel{
    private JButton button;
    private JLabel label;
    public KeyInputField(int deflt){
        this.label = new JLabel();
        this.button = new JButton();
        this.setLayout(new GridLayout(1,2));


    }
}
