package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathLevel3Semester2 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public MathLevel3Semester2(){

        l1 = new JLabel("MTH302_SCORE");
        l2 = new JLabel("MTH304_SCORE ");
        l3 = new JLabel("MTH306_SCORE");
        l4 = new JLabel("MTH308_SCORE");
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
                double mth302  = Double.parseDouble(f1.getText());
                double mth304  = Double.parseDouble(f2.getText());
                double mth306  = Double.parseDouble(f3.getText());
                double mth308  = Double.parseDouble(f4.getText());


                int mth_302point = 0;
                int mth_304point = 0;
                int mth_306point = 0;
                int mth_308point = 0;

                if(e.getSource()==b1){


                    if (mth302>=70){
                        mth_302point=5;
                    }

                    else if(mth302>=60 && mth302<70){
                        mth_302point=4;
                    }

                    else if(mth302>=50 && mth302<60){
                        mth_302point=3;
                    }

                    else if(mth302>=45 && mth302<50){
                        mth_302point=2;
                    }

                    else if(mth302>=40 && mth302<45){
                        mth_302point=1;
                    }

                    else{
                        mth_302point=0;
                    }



                    if (mth304>=70){
                        mth_304point=5;
                    }

                    else if(mth304>=60 && mth304<70){
                        mth_304point=4;
                    }

                    else if(mth304>=50 && mth304<60){
                        mth_304point=3;
                    }

                    else if(mth304>=45 && mth304<50){
                        mth_304point=2;
                    }

                    else if(mth304>=40 && mth304<45){
                        mth_304point=1;
                    }

                    else{
                        mth_304point=0;
                    }




                    if (mth306>=70){
                        mth_306point=5;
                    }

                    else if(mth306>=60 && mth306<70){
                        mth_306point=4;
                    }

                    else if(mth306>=50 && mth306<60){
                        mth_306point=3;
                    }

                    else if(mth306>=45 && mth306<50){
                        mth_306point=2;
                    }

                    else if(mth306>=40 && mth306<45){
                        mth_306point=1;
                    }

                    else{
                        mth_306point=0;
                    }



                    if (mth308>=70){
                        mth_308point=5;
                    }

                    else if(mth308>=60 && mth308<70){
                        mth_308point=4;
                    }

                    else if(mth308>=50 && mth308<60){
                        mth_308point=3;
                    }

                    else if(mth308>=45 && mth308<50){
                        mth_308point=2;
                    }

                    else if(mth308>=40 && mth308<45){
                        mth_308point=1;
                    }

                    else{
                        mth_308point=0;
                    }

                    double gp = ((mth_302point*3) + (mth_304point*5) + (mth_306point*4) +(mth_308point*4))/16.0;

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
