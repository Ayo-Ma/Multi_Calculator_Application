package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerLevel4Semester1 extends JFrame {



    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public ComputerLevel4Semester1(){

        l1 = new JLabel("CSC401_SCORE");
        l2 = new JLabel("CSC403_SCORE ");
        l3 = new JLabel("CSC405_SCORE");
        l4 = new JLabel("CSC407_SCORE");
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
                double csc401  = Double.parseDouble(f1.getText());
                double csc403  = Double.parseDouble(f2.getText());
                double csc405  = Double.parseDouble(f3.getText());
                double csc407  = Double.parseDouble(f4.getText());


                int csc_401point = 0;
                int csc_403point = 0;
                int csc_405point = 0;
                int csc_407point = 0;

                if(e.getSource()==b1){


                    if (csc401>=70){
                        csc_401point=5;
                    }

                    else if(csc401>=60 && csc401<70){
                        csc_401point=4;
                    }

                    else if(csc401>=50 && csc401<60){
                        csc_401point=3;
                    }

                    else if(csc401>=45 && csc401<50){
                        csc_401point=2;
                    }

                    else if(csc401>=40 && csc401<45){
                        csc_401point=1;
                    }

                    else{
                        csc_401point=0;
                    }



                    if (csc403>=70){
                        csc_403point=5;
                    }

                    else if(csc403>=60 && csc403<70){
                        csc_403point=4;
                    }

                    else if(csc403>=50 && csc403<60){
                        csc_403point=3;
                    }

                    else if(csc403>=45 && csc403<50){
                        csc_403point=2;
                    }

                    else if(csc403>=40 && csc403<45){
                        csc_403point=1;
                    }

                    else{
                        csc_403point=0;
                    }


                    if (csc405>=70){
                        csc_405point=5;
                    }

                    else if(csc405>=60 && csc405<70){
                        csc_405point=4;
                    }

                    else if(csc405>=50 && csc405<60){
                        csc_405point=3;
                    }

                    else if(csc405>=45 && csc405<50){
                        csc_405point=2;
                    }

                    else if(csc405>=40 && csc405<45){
                        csc_405point=1;
                    }

                    else{
                        csc_405point=0;
                    }


                    if (csc407>=70){
                        csc_407point=5;
                    }

                    else if(csc407>=60 && csc407<70){
                        csc_407point=4;
                    }

                    else if(csc407>=50 && csc407<60){
                        csc_407point=3;
                    }

                    else if(csc407>=45 && csc407<50){
                        csc_407point=2;
                    }

                    else if(csc407>=40 && csc407<45){
                        csc_407point=1;
                    }

                    else{
                        csc_407point=0;
                    }



                    double gp = ((csc_401point*3) + (csc_403point*5) + (csc_405point*4) +(csc_407point*4))/16.0;

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
