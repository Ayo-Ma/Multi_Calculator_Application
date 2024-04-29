package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathLevel4Semester2 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public MathLevel4Semester2(){

        l1 = new JLabel("MTH402_SCORE");
        l2 = new JLabel("MTH404_SCORE ");
        l3 = new JLabel("MTH406_SCORE");
        l4 = new JLabel("MTH408_SCORE");
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
                double mth402  = Double.parseDouble(f1.getText());
                double mth404  = Double.parseDouble(f2.getText());
                double mth406  = Double.parseDouble(f3.getText());
                double mth408  = Double.parseDouble(f4.getText());


                int mth_402point = 0;
                int mth_404point = 0;
                int mth_406point = 0;
                int mth_408point = 0;

                if(e.getSource()==b1){


                    if (mth402>=70){
                        mth_402point=5;
                    }

                    else if(mth402>=60 && mth402<70){
                        mth_402point=4;
                    }

                    else if(mth402>=50 && mth402<60){
                        mth_402point=3;
                    }

                    else if(mth402>=45 && mth402<50){
                        mth_402point=2;
                    }

                    else if(mth402>=40 && mth402<45){
                        mth_402point=1;
                    }

                    else{
                        mth_402point=0;
                    }



                    if (mth404>=70){
                        mth_404point=5;
                    }

                    else if(mth404>=60 && mth404<70){
                        mth_404point=4;
                    }

                    else if(mth404>=50 && mth404<60){
                        mth_404point=3;
                    }

                    else if(mth404>=45 && mth404<50){
                        mth_404point=2;
                    }

                    else if(mth404>=40 && mth404<45){
                        mth_404point=1;
                    }

                    else{
                        mth_404point=0;
                    }




                    if (mth406>=70){
                        mth_406point=5;
                    }

                    else if(mth406>=60 && mth406<70){
                        mth_406point=4;
                    }

                    else if(mth406>=50 && mth406<60){
                        mth_406point=3;
                    }

                    else if(mth406>=45 && mth406<50){
                        mth_406point=2;
                    }

                    else if(mth406>=40 && mth406<45){
                        mth_406point=1;
                    }

                    else{
                        mth_406point=0;
                    }



                    if (mth408>=70){
                        mth_408point=5;
                    }

                    else if(mth408>=60 && mth408<70){
                        mth_408point=4;
                    }

                    else if(mth408>=50 && mth408<60){
                        mth_408point=3;
                    }

                    else if(mth408>=45 && mth408<50){
                        mth_408point=2;
                    }

                    else if(mth408>=40 && mth408<45){
                        mth_408point=1;
                    }

                    else{
                        mth_408point=0;
                    }

                    double gp = ((mth_402point*3) + (mth_404point*5) + (mth_406point*4) +(mth_408point*4))/16.0;

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
