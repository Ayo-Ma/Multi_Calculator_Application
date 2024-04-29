package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathLevel3Semester1 extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public MathLevel3Semester1(){

        l1 = new JLabel("MTH301_SCORE");
        l2 = new JLabel("MTH303_SCORE ");
        l3 = new JLabel("MTH305_SCORE");
        l4 = new JLabel("MTH307_SCORE");
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
                double mth301  = Double.parseDouble(f1.getText());
                double mth303  = Double.parseDouble(f2.getText());
                double mth305  = Double.parseDouble(f3.getText());
                double mth307  = Double.parseDouble(f4.getText());


                int mth_301point = 0;
                int mth_303point = 0;
                int mth_305point = 0;
                int mth_307point = 0;

                if(e.getSource()==b1){


                    if (mth301>=70){
                        mth_301point=5;
                    }

                    else if(mth301>=60 && mth301<70){
                        mth_301point=4;
                    }

                    else if(mth301>=50 && mth301<60){
                        mth_301point=3;
                    }

                    else if(mth301>=45 && mth301<50){
                        mth_301point=2;
                    }

                    else if(mth301>=40 && mth301<45){
                        mth_301point=1;
                    }

                    else{
                        mth_301point=0;
                    }



                    if (mth303>=70){
                        mth_303point=5;
                    }

                    else if(mth303>=60 && mth303<70){
                        mth_303point=4;
                    }

                    else if(mth303>=50 && mth303<60){
                        mth_303point=3;
                    }

                    else if(mth303>=45 && mth303<50){
                        mth_303point=2;
                    }

                    else if(mth303>=40 && mth303<45){
                        mth_303point=1;
                    }

                    else{
                        mth_303point=0;
                    }




                    if (mth305>=70){
                        mth_305point=5;
                    }

                    else if(mth305>=60 && mth305<70){
                        mth_305point=4;
                    }

                    else if(mth305>=50 && mth305<60){
                        mth_305point=3;
                    }

                    else if(mth305>=45 && mth305<50){
                        mth_305point=2;
                    }

                    else if(mth305>=40 && mth305<45){
                        mth_305point=1;
                    }

                    else{
                        mth_305point=0;
                    }



                    if (mth307>=70){
                        mth_307point=5;
                    }

                    else if(mth307>=60 && mth307<70){
                        mth_307point=4;
                    }

                    else if(mth307>=50 && mth307<60){
                        mth_307point=3;
                    }

                    else if(mth307>=45 && mth307<50){
                        mth_307point=2;
                    }

                    else if(mth307>=40 && mth307<45){
                        mth_307point=1;
                    }

                    else{
                        mth_307point=0;
                    }

                    double gp = ((mth_301point*3) + (mth_303point*5) + (mth_305point*4) +(mth_307point*4))/16.0;

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
