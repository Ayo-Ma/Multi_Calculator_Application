package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathLevel2Semester2 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public MathLevel2Semester2(){

        l1 = new JLabel("MTH202_SCORE");
        l2 = new JLabel("MTH206_SCORE ");
        l3 = new JLabel("MTH212_SCORE");
        l4 = new JLabel("MTH208_SCORE");
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
                double mth202  = Double.parseDouble(f1.getText());
                double mth206  = Double.parseDouble(f2.getText());
                double mth212  = Double.parseDouble(f3.getText());
                double mth208  = Double.parseDouble(f4.getText());


                int mth_202point = 0;
                int mth_206point = 0;
                int mth_212point = 0;
                int mth_208point = 0;

                if(e.getSource()==b1){


                    if (mth202>=70){
                        mth_202point=5;
                    }

                    else if(mth202>=60 && mth202<70){
                        mth_202point=4;
                    }

                    else if(mth202>=50 && mth202<60){
                        mth_202point=3;
                    }

                    else if(mth202>=45 && mth202<50){
                        mth_202point=2;
                    }

                    else if(mth202>=40 && mth202<45){
                        mth_202point=1;
                    }

                    else{
                        mth_202point=0;
                    }



                    if (mth206>=70){
                        mth_206point=5;
                    }

                    else if(mth206>=60 && mth206<70){
                        mth_206point=4;
                    }

                    else if(mth206>=50 && mth206<60){
                        mth_206point=3;
                    }

                    else if(mth206>=45 && mth206<50){
                        mth_206point=2;
                    }

                    else if(mth206>=40 && mth206<45){
                        mth_206point=1;
                    }

                    else{
                        mth_206point=0;
                    }




                    if (mth212>=70){
                        mth_212point=5;
                    }

                    else if(mth212>=60 && mth212<70){
                        mth_212point=4;
                    }

                    else if(mth212>=50 && mth212<60){
                        mth_212point=3;
                    }

                    else if(mth212>=45 && mth212<50){
                        mth_212point=2;
                    }

                    else if(mth212>=40 && mth212<45){
                        mth_212point=1;
                    }

                    else{
                        mth_212point=0;
                    }



                    if (mth208>=70){
                        mth_208point=5;
                    }

                    else if(mth208>=60 && mth208<70){
                        mth_208point=4;
                    }

                    else if(mth208>=50 && mth208<60){
                        mth_208point=3;
                    }

                    else if(mth208>=45 && mth208<50){
                        mth_208point=2;
                    }

                    else if(mth208>=40 && mth208<45){
                        mth_208point=1;
                    }

                    else{
                        mth_208point=0;
                    }

                    double gp = ((mth_202point*3) + (mth_206point*5) + (mth_212point*4) +(mth_208point*4))/16.0;

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
