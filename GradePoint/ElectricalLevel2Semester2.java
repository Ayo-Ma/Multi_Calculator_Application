package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricalLevel2Semester2 extends JFrame {



    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public ElectricalLevel2Semester2(){

        l1 = new JLabel("EEE202_SCORE");
        l2 = new JLabel("EEE204_SCORE ");
        l3 = new JLabel("MTH202_SCORE");
        l4 = new JLabel("CSC202_SCORE");
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
                double eee202  = Double.parseDouble(f1.getText());
                double eee204  = Double.parseDouble(f2.getText());
                double mth202  = Double.parseDouble(f3.getText());
                double csc202  = Double.parseDouble(f4.getText());


                int eee_202point = 0;
                int eee_204point = 0;
                int mth_point = 0;
                int csc_202point = 0;

                if(e.getSource()==b1){


                    if (eee202>=70){
                        eee_202point=5;
                    }

                    else if(eee202>=60 && eee202<70){
                        eee_202point=4;
                    }

                    else if(eee202>=50 && eee202<60){
                        eee_202point=3;
                    }

                    else if(eee202>=45 && eee202<50){
                        eee_202point=2;
                    }

                    else if(eee202>=40 && eee202<45){
                        eee_202point=1;
                    }

                    else{
                        eee_202point=0;
                    }



                    if (eee204>=70){
                        eee_204point=5;
                    }

                    else if(eee204>=60 && eee204<70){
                        eee_204point=4;
                    }

                    else if(eee204>=50 && eee204<60){
                        eee_204point=3;
                    }

                    else if(eee204>=45 && eee204<50){
                        eee_204point=2;
                    }

                    else if(eee204>=40 && eee204<45){
                        eee_204point=1;
                    }

                    else{
                        eee_204point=0;
                    }




                    if (mth202>=70){
                        mth_point=5;
                    }

                    else if(mth202>=60 && mth202<70){
                        mth_point=4;
                    }

                    else if(mth202>=50 && mth202<60){
                        mth_point=3;
                    }

                    else if(mth202>=45 && mth202<50){
                        mth_point=2;
                    }

                    else if(mth202>=40 && mth202<45){
                        mth_point=1;
                    }

                    else{
                        mth_point=0;
                    }



                    if (csc202>=70){
                        csc_202point=5;
                    }

                    else if(csc202>=60 && csc202<70){
                        csc_202point=4;
                    }

                    else if(csc202>=50 && csc202<60){
                        csc_202point=3;
                    }

                    else if(csc202>=45 && csc202<50){
                        csc_202point=2;
                    }

                    else if(csc202>=40 && csc202<45){
                        csc_202point=1;
                    }

                    else{
                        csc_202point=0;
                    }

                    double gp = ((csc_202point*3) + (mth_point*5) + (eee_202point*4) +(eee_204point*4))/16.0;

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
