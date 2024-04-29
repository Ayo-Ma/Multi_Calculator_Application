package com.JFrameProject.GradePoint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathLevel1Semester1 extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1;

    public MathLevel1Semester1(){

        l1 = new JLabel("CSC101_SCORE");
        l2 = new JLabel("MTH101_SCORE ");
        l3 = new JLabel("PHY101_SCORE");
        l4 = new JLabel("CHM101_SCORE");
        l5 = new JLabel("");
        l6 = new JLabel("");
        f1 = new JTextField(20);
        f2 = new JTextField(20);
        f3 = new JTextField(20);
        f4 = new JTextField(20);

        b1 = new JButton("CALCULATE");

        add(l1);
        add(f1);
        add(l2);
        add(f2);
        add(l3);
        add(f3);
        add(l4);
        add(f4);
        add(b1);
        add(l5);
        add(l6);


        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double csc101  = Double.parseDouble(f1.getText());
                double mth101  = Double.parseDouble(f2.getText());
                double chm101  = Double.parseDouble(f3.getText());
                double phy101  = Double.parseDouble(f4.getText());


                int csc_point = 0;
                int mth_point = 0;
                int chm_point = 0;
                int phy_point = 0;

                if (csc101>=70){
                    csc_point=5;
                }

                else if(csc101>=60 && csc101<70){
                    csc_point=4;
                }

                else if(csc101>=50 && csc101<60){
                    csc_point=3;
                }

                else if(csc101>=45 && csc101<50){
                    csc_point=2;
                }

                else if(csc101>=40 && csc101<45){
                    csc_point=1;
                }

                else{
                    csc_point=0;
                }



                if (mth101>=70){
                    mth_point=5;
                }

                else if(mth101>=60 && mth101<70){
                    mth_point=4;
                }

                else if(mth101>=50 && mth101<60){
                    mth_point=3;
                }

                else if(mth101>=45 && mth101<50){
                    mth_point=2;
                }

                else if(mth101>=40 && mth101<45){
                    mth_point=1;
                }

                else{
                    mth_point=0;
                }




                if (chm101>=70){
                    chm_point=5;
                }

                else if(chm101>=60 && chm101<70){
                    chm_point=4;
                }

                else if(chm101>=50 && chm101<60){
                    chm_point=3;
                }

                else if(chm101>=45 && chm101<50){
                    chm_point=2;
                }

                else if(chm101>=40 && chm101<45){
                    chm_point=1;
                }

                else{
                    chm_point=0;
                }



                if (phy101>=70){
                    phy_point=5;
                }

                else if(phy101>=60 && phy101<70){
                    phy_point=4;
                }

                else if(phy101>=50 && phy101<60){
                    phy_point=3;
                }

                else if(phy101>=45 && phy101<50){
                    phy_point=2;
                }

                else if(phy101>=40 && phy101<45){
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
        };

        b1.addActionListener(al);

        getContentPane().setBackground(Color.CYAN);
        setLayout(new FlowLayout());
        setSize(350,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
