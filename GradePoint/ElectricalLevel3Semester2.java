package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricalLevel3Semester2 extends JFrame {


    JLabel l1, l2, l3, l4, l5, l6;
    JTextField f1, f2, f3, f4;
    JButton b1, b2;

    public ElectricalLevel3Semester2() {

        l1 = new JLabel("EEE302_SCORE");
        l2 = new JLabel("EEE304_SCORE ");
        l3 = new JLabel("EEE306_SCORE");
        l4 = new JLabel("EE308_SCORE");
        l5 = new JLabel("");
        l6 = new JLabel("");
        f1 = new JTextField(20);
        f2 = new JTextField(20);
        f3 = new JTextField(20);
        f4 = new JTextField(20);

        b1 = new JButton("CALCULATE");
        b2 = new JButton("ALL APPS");

        add(l1);
        add(f1);
        add(l2);
        add(f2);
        add(l3);
        add(f3);
        add(l4);
        add(f4);
        add(b1);
        add(b2);
        add(l5);
        add(l6);


        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double eee302 = Double.parseDouble(f1.getText());
                double eee304 = Double.parseDouble(f2.getText());
                double eee306 = Double.parseDouble(f3.getText());
                double eee308 = Double.parseDouble(f4.getText());


                int eee_302point = 0;
                int eee_304point = 0;
                int eee_306point = 0;
                int eee_308point = 0;

                if (e.getSource() == b1) {


                    if (eee302 >= 70) {
                        eee_302point = 5;
                    } else if (eee302 >= 60 && eee302 < 70) {
                        eee_302point = 4;
                    } else if (eee302 >= 50 && eee302 < 60) {
                        eee_302point = 3;
                    } else if (eee302 >= 45 && eee302 < 50) {
                        eee_302point = 2;
                    } else if (eee302 >= 40 && eee302 < 45) {
                        eee_302point = 1;
                    } else {
                        eee_302point = 0;
                    }


                    if (eee304 >= 70) {
                        eee_304point = 5;
                    } else if (eee304 >= 60 && eee304 < 70) {
                        eee_304point = 4;
                    } else if (eee304 >= 50 && eee304 < 60) {
                        eee_304point = 3;
                    } else if (eee304 >= 45 && eee304 < 50) {
                        eee_304point = 2;
                    } else if (eee304 >= 40 && eee304 < 45) {
                        eee_304point = 1;
                    } else {
                        eee_304point = 0;
                    }


                    if (eee306 >= 70) {
                        eee_306point = 5;
                    } else if (eee306 >= 60 && eee306 < 70) {
                        eee_306point = 4;
                    } else if (eee306 >= 50 && eee306 < 60) {
                        eee_306point = 3;
                    } else if (eee306 >= 45 && eee306 < 50) {
                        eee_306point = 2;
                    } else if (eee306 >= 40 && eee306 < 45) {
                        eee_306point = 1;
                    } else {
                        eee_306point = 0;
                    }


                    if (eee308 >= 70) {
                        eee_308point = 5;
                    } else if (eee308 >= 60 && eee308 < 70) {
                        eee_308point = 4;
                    } else if (eee308 >= 50 && eee308 < 60) {
                        eee_308point = 3;
                    } else if (eee308 >= 45 && eee308 < 50) {
                        eee_308point = 2;
                    } else if (eee308 >= 40 && eee308 < 45) {
                        eee_308point = 1;
                    } else {
                        eee_308point = 0;
                    }

                    double gp = ((eee_302point * 3) + (eee_304point * 5) + (eee_306point * 4) + (eee_308point * 4)) / 16.0;

                    l5.setText("Your GP is " + gp);


                    if (gp >= 4.5) {
                        l6.setText("Excellent, you are a first class candidate");
                    } else if (gp >= 3.5 && gp < 4.5) {
                        l6.setText("Very good, you are a 2nd class upper candidate");
                    } else if (gp >= 2.5 && gp < 3.5) {
                        l6.setText("Good, you are a 2nd class lower candidate");
                    } else if (gp >= 2 && gp < 2.49) {
                        l6.setText(" you are a pass candidate, you need to work harder.");
                    }

                } else if (e.getSource() == b2) {

                    new AllAppFrame();
                }


            }
        };

        b1.addActionListener(al);
        b2.addActionListener(al);

        getContentPane().setBackground(Color.CYAN);
        setLayout(new FlowLayout());
        setSize(350, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}