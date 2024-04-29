package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerLevel4Semester2 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public ComputerLevel4Semester2(){

        l1 = new JLabel("CSC402_SCORE");
        l2 = new JLabel("CSC404_SCORE ");
        l3 = new JLabel("CSC406_SCORE");
        l4 = new JLabel("CSC408_SCORE");
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
                double csc402  = Double.parseDouble(f1.getText());
                double csc404  = Double.parseDouble(f2.getText());
                double csc406  = Double.parseDouble(f3.getText());
                double csc408  = Double.parseDouble(f4.getText());


                int csc_402point = 0;
                int csc_404point = 0;
                int csc_406point = 0;
                int csc_408point = 0;

                if(e.getSource()==b1){


                    if (csc402>=70){
                        csc_402point=5;
                    }

                    else if(csc402>=60 && csc402<70){
                        csc_402point=4;
                    }

                    else if(csc402>=50 && csc402<60){
                        csc_402point=3;
                    }

                    else if(csc402>=45 && csc402<50){
                        csc_402point=2;
                    }

                    else if(csc402>=40 && csc402<45){
                        csc_402point=1;
                    }

                    else{
                        csc_402point=0;
                    }



                    if (csc404>=70){
                        csc_404point=5;
                    }

                    else if(csc404>=60 && csc404<70){
                        csc_404point=4;
                    }

                    else if(csc404>=50 && csc404<60){
                        csc_404point=3;
                    }

                    else if(csc404>=45 && csc404<50){
                        csc_404point=2;
                    }

                    else if(csc404>=40 && csc404<45){
                        csc_404point=1;
                    }

                    else{
                        csc_404point=0;
                    }


                    if (csc406>=70){
                        csc_406point=5;
                    }

                    else if(csc406>=60 && csc406<70){
                        csc_406point=4;
                    }

                    else if(csc406>=50 && csc406<60){
                        csc_406point=3;
                    }

                    else if(csc406>=45 && csc406<50){
                        csc_406point=2;
                    }

                    else if(csc406>=40 && csc406<45){
                        csc_406point=1;
                    }

                    else{
                        csc_406point=0;
                    }


                    if (csc408>=70){
                        csc_408point=5;
                    }

                    else if(csc408>=60 && csc408<70){
                        csc_408point=4;
                    }

                    else if(csc408>=50 && csc408<60){
                        csc_408point=3;
                    }

                    else if(csc408>=45 && csc408<50){
                        csc_408point=2;
                    }

                    else if(csc408>=40 && csc408<45){
                        csc_408point=1;
                    }

                    else{
                        csc_408point=0;
                    }



                    double gp = ((csc_402point*3) + (csc_404point*5) + (csc_406point*4) +(csc_408point*4))/16.0;

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
