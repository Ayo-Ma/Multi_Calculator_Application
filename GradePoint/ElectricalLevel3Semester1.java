package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricalLevel3Semester1 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public ElectricalLevel3Semester1(){

        l1 = new JLabel("EEE301_SCORE");
        l2 = new JLabel("EEE303_SCORE ");
        l3 = new JLabel("EEE305_SCORE");
        l4 = new JLabel("EE307_SCORE");
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
                double eee301  = Double.parseDouble(f1.getText());
                double eee303  = Double.parseDouble(f2.getText());
                double eee305  = Double.parseDouble(f3.getText());
                double eee307  = Double.parseDouble(f4.getText());


                int eee_301point = 0;
                int eee_303point = 0;
                int eee_305point = 0;
                int eee_307point = 0;

                if(e.getSource()==b1){


                    if (eee301>=70){
                        eee_301point=5;
                    }

                    else if(eee301>=60 && eee301<70){
                        eee_301point=4;
                    }

                    else if(eee301>=50 && eee301<60){
                        eee_301point=3;
                    }

                    else if(eee301>=45 && eee301<50){
                        eee_301point=2;
                    }

                    else if(eee301>=40 && eee301<45){
                        eee_301point=1;
                    }

                    else{
                        eee_301point=0;
                    }



                    if (eee303>=70){
                        eee_303point=5;
                    }

                    else if(eee303>=60 && eee303<70){
                        eee_303point=4;
                    }

                    else if(eee303>=50 && eee303<60){
                        eee_303point=3;
                    }

                    else if(eee303>=45 && eee303<50){
                        eee_303point=2;
                    }

                    else if(eee303>=40 && eee303<45){
                        eee_303point=1;
                    }

                    else{
                        eee_303point=0;
                    }




                    if (eee305>=70){
                        eee_305point=5;
                    }

                    else if(eee305>=60 && eee305<70){
                        eee_305point=4;
                    }

                    else if(eee305>=50 && eee305<60){
                        eee_305point=3;
                    }

                    else if(eee305>=45 && eee305<50){
                        eee_305point=2;
                    }

                    else if(eee305>=40 && eee305<45){
                        eee_305point=1;
                    }

                    else{
                        eee_305point=0;
                    }



                    if (eee307>=70){
                        eee_307point=5;
                    }

                    else if(eee307>=60 && eee307<70){
                        eee_307point=4;
                    }

                    else if(eee307>=50 && eee307<60){
                        eee_307point=3;
                    }

                    else if(eee307>=45 && eee307<50){
                        eee_307point=2;
                    }

                    else if(eee307>=40 && eee307<45){
                        eee_307point=1;
                    }

                    else{
                        eee_307point=0;
                    }

                    double gp = ((eee_301point*3) + (eee_303point*5) + (eee_305point*4) +(eee_307point*4))/16.0;

                    l5.setText("Your GP is "+gp);


                    if(gp>=4.5){
                        l6.setText("Excellent, you are a first class candidate");
                    }

                    else if(gp>=3.5 && gp<4.5){
                        l6.setText("Very good, you are a 2nd class upper candidate");
                    }

                    else if(gp>=2.5 && gp<3.5){
                        l6.setText("Good, you are a 2nd class lower candidate");
                    }

                    else if(gp>=2 && gp<2.49){
                        l6.setText(" you are a pass candidate, you need to work harder.");
                    }

                }

                else if(e.getSource()==b2){

                    new AllAppFrame();
                }




            }
        };

        b1.addActionListener(al);
        b2.addActionListener(al);

        getContentPane().setBackground(Color.CYAN);
        setLayout(new FlowLayout());
        setSize(350,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }




}
