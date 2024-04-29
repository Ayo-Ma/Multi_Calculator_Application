package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerLevel3Semester2 extends JFrame {



    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public ComputerLevel3Semester2(){

        l1 = new JLabel("CSC302_SCORE");
        l2 = new JLabel("CSC304_SCORE ");
        l3 = new JLabel("CSC306_SCORE");
        l4 = new JLabel("CSC312_SCORE");
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
                double csc302  = Double.parseDouble(f1.getText());
                double csc304  = Double.parseDouble(f2.getText());
                double csc306  = Double.parseDouble(f3.getText());
                double csc312  = Double.parseDouble(f4.getText());


                int csc_302point = 0;
                int csc_304point = 0;
                int csc_306point = 0;
                int csc_312point = 0;

                if(e.getSource()==b1){


                    if (csc302>=70){
                        csc_302point=5;
                    }

                    else if(csc302>=60 && csc302<70){
                        csc_302point=4;
                    }

                    else if(csc302>=50 && csc302<60){
                        csc_302point=3;
                    }

                    else if(csc302>=45 && csc302<50){
                        csc_302point=2;
                    }

                    else if(csc302>=40 && csc302<45){
                        csc_302point=1;
                    }

                    else{
                        csc_302point=0;
                    }



                    if (csc304>=70){
                        csc_304point=5;
                    }

                    else if(csc304>=60 && csc304<70){
                        csc_304point=4;
                    }

                    else if(csc304>=50 && csc304<60){
                        csc_304point=3;
                    }

                    else if(csc304>=45 && csc304<50){
                        csc_304point=2;
                    }

                    else if(csc304>=40 && csc304<45){
                        csc_304point=1;
                    }

                    else{
                        csc_304point=0;
                    }


                    if (csc306>=70){
                        csc_306point=5;
                    }

                    else if(csc306>=60 && csc306<70){
                        csc_306point=4;
                    }

                    else if(csc306>=50 && csc306<60){
                        csc_306point=3;
                    }

                    else if(csc306>=45 && csc306<50){
                        csc_306point=2;
                    }

                    else if(csc306>=40 && csc306<45){
                        csc_306point=1;
                    }

                    else{
                        csc_306point=0;
                    }


                    if (csc312>=70){
                        csc_312point=5;
                    }

                    else if(csc312>=60 && csc312<70){
                        csc_312point=4;
                    }

                    else if(csc312>=50 && csc312<60){
                        csc_312point=3;
                    }

                    else if(csc312>=45 && csc312<50){
                        csc_312point=2;
                    }

                    else if(csc312>=40 && csc312<45){
                        csc_312point=1;
                    }

                    else{
                        csc_312point=0;
                    }



                    double gp = ((csc_302point*3) + (csc_304point*5) + (csc_306point*4) +(csc_312point*4))/16.0;

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
