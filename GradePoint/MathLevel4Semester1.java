package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathLevel4Semester1 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public MathLevel4Semester1(){

        l1 = new JLabel("MTH401_SCORE");
        l2 = new JLabel("MTH403_SCORE ");
        l3 = new JLabel("MTH405_SCORE");
        l4 = new JLabel("MTH407_SCORE");
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
                double mth401  = Double.parseDouble(f1.getText());
                double mth403  = Double.parseDouble(f2.getText());
                double mth405  = Double.parseDouble(f3.getText());
                double mth407  = Double.parseDouble(f4.getText());


                int mth_401point = 0;
                int mth_403point = 0;
                int mth_405point = 0;
                int mth_407point = 0;

                if(e.getSource()==b1){


                    if (mth401>=70){
                        mth_401point=5;
                    }

                    else if(mth401>=60 && mth401<70){
                        mth_401point=4;
                    }

                    else if(mth401>=50 && mth401<60){
                        mth_401point=3;
                    }

                    else if(mth401>=45 && mth401<50){
                        mth_401point=2;
                    }

                    else if(mth401>=40 && mth401<45){
                        mth_401point=1;
                    }

                    else{
                        mth_401point=0;
                    }



                    if (mth403>=70){
                        mth_403point=5;
                    }

                    else if(mth403>=60 && mth403<70){
                        mth_403point=4;
                    }

                    else if(mth403>=50 && mth403<60){
                        mth_403point=3;
                    }

                    else if(mth403>=45 && mth403<50){
                        mth_403point=2;
                    }

                    else if(mth403>=40 && mth403<45){
                        mth_403point=1;
                    }

                    else{
                        mth_403point=0;
                    }




                    if (mth405>=70){
                        mth_405point=5;
                    }

                    else if(mth405>=60 && mth405<70){
                        mth_405point=4;
                    }

                    else if(mth405>=50 && mth405<60){
                        mth_405point=3;
                    }

                    else if(mth405>=45 && mth405<50){
                        mth_405point=2;
                    }

                    else if(mth405>=40 && mth405<45){
                        mth_405point=1;
                    }

                    else{
                        mth_405point=0;
                    }



                    if (mth407>=70){
                        mth_407point=5;
                    }

                    else if(mth407>=60 && mth407<70){
                        mth_407point=4;
                    }

                    else if(mth407>=50 && mth407<60){
                        mth_407point=3;
                    }

                    else if(mth407>=45 && mth407<50){
                        mth_407point=2;
                    }

                    else if(mth407>=40 && mth407<45){
                        mth_407point=1;
                    }

                    else{
                        mth_407point=0;
                    }

                    double gp = ((mth_401point*3) + (mth_403point*5) + (mth_405point*4) +(mth_407point*4))/16.0;

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
