package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Магазин анекдот");
        frame.setVisible(true);
        frame.setSize(500, 400 );
        JPanel panel = new JPanel(new GridLayout(4, 1));
        frame.add(panel);
        JLabel label = new JLabel("\tМагазин");
        JTextField text = new JTextField();
        JLabel moneyout = new JLabel("0");
        JButton buy = new JButton("buy");
        panel.add(label);
        panel.add(text);
        panel.add(moneyout);
        panel.add(buy);
        frame.validate();
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Лупа и Пупа пошли получать зарплату, но в бухгалтерии всё перепутали. И Лупа получил за Пупу, а Пупа за Лупу");
            }
        });
    }


}
