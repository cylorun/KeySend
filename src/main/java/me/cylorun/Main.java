package me.cylorun;

import com.formdev.flatlaf.FlatDarculaLaf;
import me.cylorun.data.KeySendOptions;
import me.cylorun.ui.KeySendFrame;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, IOException {
        UIManager.setLookAndFeel(new FlatDarculaLaf());
        KeySendOptions.load();
        new KeySendFrame();
    }
}