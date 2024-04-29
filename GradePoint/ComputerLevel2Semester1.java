package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerLevel2Semester1 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public ComputerLevel2Semester1(){

        l1 = new JLabel("CSC201_SCORE");
        l2 = new JLabel("CSC203_SCORE ");
        l3 = new JLabel("MTH201_SCORE");
        l4 = new JLabel("CSC205_SCORE");
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
                double csc201  = Double.parseDouble(f1.getText());
                double csc203  = Double.parseDouble(f2.getText());
                double mth201  = Double.parseDouble(f3.getText());
                double csc205  = Double.parseDouble(f4.getText());


                int csc_201point = 0;
                int csc_203point = 0;
                int mth_point = 0;
                int csc_205point = 0;

                if(e.getSource()==b1){


                    if (csc201>=70){
                        csc_201point=5;
                    }

                    else if(csc201>=60 && csc201<70){
                        csc_201point=4;
                    }

                    else if(csc201>=50 && csc201<60){
                        csc_201point=3;
                    }

                    else if(csc201>=45 && csc201<50){
                        csc_201point=2;
                    }

                    else if(csc201>=40 && csc201<45){
                        csc_201point=1;
                    }

                    else{
                        csc_201point=0;
                    }



                    if (csc203>=70){
                        csc_203point=5;
                    }

                    else if(csc203>=60 && csc203<70){
                        csc_203point=4;
                    }

                    else if(csc203>=50 && csc203<60){
                        csc_203point=3;
                    }

                    else if(csc203>=45 && csc203<50){
                        csc_203point=2;
                    }

                    else if(csc203>=40 && csc203<45){
                        csc_203point=1;
                    }

                    else{
                        csc_203point=0;
                    }




                    if (mth201>=70){
                        mth_point=5;
                    }

                    else if(mth201>=60 && mth201<70){
                        mth_point=4;
                    }

                    else if(mth201>=50 && mth201<60){
                        mth_point=3;
                    }

                    else if(mth201>=45 && mth201<50){
                        mth_point=2;
                    }

                    else if(mth201>=40 && mth201<45){
                        mth_point=1;
                    }

                    else{
                        mth_point=0;
                    }



                    if (csc205>=70){
                        csc_205point=5;
                    }

                    else if(csc205>=60 && csc205<70){
                        csc_205point=4;
                    }

                    else if(csc205>=50 && csc205<60){
                        csc_205point=3;
                    }

                    else if(csc205>=45 && csc205<50){
                        csc_205point=2;
                    }

                    else if(csc205>=40 && csc205<45){
                        csc_205point=1;
                    }

                    else{
                        csc_205point=0;
                    }

                    double gp = ((csc_201point*3) + (mth_point*5) + (csc_203point*4) +(csc_205point*4))/16.0;

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
