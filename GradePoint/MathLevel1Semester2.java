package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathLevel1Semester2 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public MathLevel1Semester2(){

        l1 = new JLabel("CSC102_SCORE");
        l2 = new JLabel("MTH102_SCORE ");
        l3 = new JLabel("PHY102_SCORE");
        l4 = new JLabel("CHM102_SCORE");
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
                double csc102  = Double.parseDouble(f1.getText());
                double mth102  = Double.parseDouble(f2.getText());
                double chm102  = Double.parseDouble(f3.getText());
                double phy102  = Double.parseDouble(f4.getText());


                int csc_point = 0;
                int mth_point = 0;
                int chm_point = 0;
                int phy_point = 0;

                if(e.getSource()==b1){


                    if (csc102>=70){
                        csc_point=5;
                    }

                    else if(csc102>=60 && csc102<70){
                        csc_point=4;
                    }

                    else if(csc102>=50 && csc102<60){
                        csc_point=3;
                    }

                    else if(csc102>=45 && csc102<50){
                        csc_point=2;
                    }

                    else if(csc102>=40 && csc102<45){
                        csc_point=1;
                    }

                    else{
                        csc_point=0;
                    }



                    if (mth102>=70){
                        mth_point=5;
                    }

                    else if(mth102>=60 && mth102<70){
                        mth_point=4;
                    }

                    else if(mth102>=50 && mth102<60){
                        mth_point=3;
                    }

                    else if(mth102>=45 && mth102<50){
                        mth_point=2;
                    }

                    else if(mth102>=40 && mth102<45){
                        mth_point=1;
                    }

                    else{
                        mth_point=0;
                    }




                    if (chm102>=70){
                        chm_point=5;
                    }

                    else if(chm102>=60 && chm102<70){
                        chm_point=4;
                    }

                    else if(chm102>=50 && chm102<60){
                        chm_point=3;
                    }

                    else if(chm102>=45 && chm102<50){
                        chm_point=2;
                    }

                    else if(chm102>=40 && chm102<45){
                        chm_point=1;
                    }

                    else{
                        chm_point=0;
                    }



                    if (phy102>=70){
                        phy_point=5;
                    }

                    else if(phy102>=60 && phy102<70){
                        phy_point=4;
                    }

                    else if(phy102>=50 && phy102<60){
                        phy_point=3;
                    }

                    else if(phy102>=45 && phy102<50){
                        phy_point=2;
                    }

                    else if(phy102>=40 && phy102<45){
                        phy_point=1;
                    }

                    else{
                        phy_point=0;
                    }


                    double gp = ((csc_point*3) + (mth_point*5) + (chm_point*4) +(phy_point*4))/16.0;

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
