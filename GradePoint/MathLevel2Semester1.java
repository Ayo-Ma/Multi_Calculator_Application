package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathLevel2Semester1 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public MathLevel2Semester1(){

        l1 = new JLabel("MTH201_SCORE");
        l2 = new JLabel("MTH205_SCORE ");
        l3 = new JLabel("MTH211_SCORE");
        l4 = new JLabel("MTH207_SCORE");
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
                double mth201  = Double.parseDouble(f1.getText());
                double mth205  = Double.parseDouble(f2.getText());
                double mth211  = Double.parseDouble(f3.getText());
                double mth207  = Double.parseDouble(f4.getText());


                int mth_201point = 0;
                int mth_205point = 0;
                int mth_211point = 0;
                int mth_207point = 0;

                if(e.getSource()==b1){


                    if (mth201>=70){
                        mth_201point=5;
                    }

                    else if(mth201>=60 && mth201<70){
                        mth_201point=4;
                    }

                    else if(mth201>=50 && mth201<60){
                        mth_201point=3;
                    }

                    else if(mth201>=45 && mth201<50){
                        mth_201point=2;
                    }

                    else if(mth201>=40 && mth201<45){
                        mth_201point=1;
                    }

                    else{
                        mth_201point=0;
                    }



                    if (mth205>=70){
                        mth_205point=5;
                    }

                    else if(mth205>=60 && mth205<70){
                        mth_205point=4;
                    }

                    else if(mth205>=50 && mth205<60){
                        mth_205point=3;
                    }

                    else if(mth205>=45 && mth205<50){
                        mth_205point=2;
                    }

                    else if(mth205>=40 && mth205<45){
                        mth_205point=1;
                    }

                    else{
                        mth_205point=0;
                    }




                    if (mth211>=70){
                        mth_211point=5;
                    }

                    else if(mth211>=60 && mth211<70){
                        mth_211point=4;
                    }

                    else if(mth211>=50 && mth211<60){
                        mth_211point=3;
                    }

                    else if(mth211>=45 && mth211<50){
                        mth_211point=2;
                    }

                    else if(mth211>=40 && mth211<45){
                        mth_211point=1;
                    }

                    else{
                        mth_211point=0;
                    }



                    if (mth207>=70){
                        mth_207point=5;
                    }

                    else if(mth207>=60 && mth207<70){
                        mth_207point=4;
                    }

                    else if(mth207>=50 && mth207<60){
                        mth_207point=3;
                    }

                    else if(mth207>=45 && mth207<50){
                        mth_207point=2;
                    }

                    else if(mth207>=40 && mth207<45){
                        mth_207point=1;
                    }

                    else{
                        mth_207point=0;
                    }

                    double gp = ((mth_201point*3) + (mth_205point*5) + (mth_211point*4) +(mth_207point*4))/16.0;

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
