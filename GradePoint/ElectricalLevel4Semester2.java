package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricalLevel4Semester2 extends JFrame {


    JLabel l1, l2, l3, l4, l5, l6;
    JTextField f1, f2, f3, f4;
    JButton b1, b2;

    public ElectricalLevel4Semester2() {

        l1 = new JLabel("EEE402_SCORE");
        l2 = new JLabel("EEE404_SCORE ");
        l3 = new JLabel("EEE406_SCORE");
        l4 = new JLabel("EE408_SCORE");
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
                double eee402 = Double.parseDouble(f1.getText());
                double eee404 = Double.parseDouble(f2.getText());
                double eee406 = Double.parseDouble(f3.getText());
                double eee408 = Double.parseDouble(f4.getText());


                int eee_402point = 0;
                int eee_404point = 0;
                int eee_406point = 0;
                int eee_408point = 0;

                if (e.getSource() == b1) {


                    if (eee402 >= 70) {
                        eee_402point = 5;
                    } else if (eee402 >= 60 && eee402 < 70) {
                        eee_402point = 4;
                    } else if (eee402 >= 50 && eee402 < 60) {
                        eee_402point = 3;
                    } else if (eee402 >= 45 && eee402 < 50) {
                        eee_402point = 2;
                    } else if (eee402 >= 40 && eee402 < 45) {
                        eee_402point = 1;
                    } else {
                        eee_402point = 0;
                    }


                    if (eee404 >= 70) {
                        eee_404point = 5;
                    } else if (eee404 >= 60 && eee404 < 70) {
                        eee_404point = 4;
                    } else if (eee404 >= 50 && eee404 < 60) {
                        eee_404point = 3;
                    } else if (eee404 >= 45 && eee404 < 50) {
                        eee_404point = 2;
                    } else if (eee404 >= 40 && eee404 < 45) {
                        eee_404point = 1;
                    } else {
                        eee_404point = 0;
                    }


                    if (eee406 >= 70) {
                        eee_406point = 5;
                    } else if (eee406 >= 60 && eee406 < 70) {
                        eee_406point = 4;
                    } else if (eee406 >= 50 && eee406 < 60) {
                        eee_406point = 3;
                    } else if (eee406 >= 45 && eee406 < 50) {
                        eee_406point = 2;
                    } else if (eee406 >= 40 && eee406 < 45) {
                        eee_406point = 1;
                    } else {
                        eee_406point = 0;
                    }


                    if (eee408 >= 70) {
                        eee_408point = 5;
                    } else if (eee408 >= 60 && eee408 < 70) {
                        eee_408point = 4;
                    } else if (eee408 >= 50 && eee408 < 60) {
                        eee_408point = 3;
                    } else if (eee408 >= 45 && eee408 < 50) {
                        eee_408point = 2;
                    } else if (eee408 >= 40 && eee408 < 45) {
                        eee_408point = 1;
                    } else {
                        eee_408point = 0;
                    }

                    double gp = ((eee_402point * 3) + (eee_404point * 5) + (eee_406point * 4) + (eee_408point * 4)) / 16.0;

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
