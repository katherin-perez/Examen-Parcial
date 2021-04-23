package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación");
        frame.setSize(100, 100);
        frame.setLayout(new BorderLayout());
        frame.setContentPane(new Universidad().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
