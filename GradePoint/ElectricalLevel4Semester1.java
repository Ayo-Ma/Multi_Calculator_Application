package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricalLevel4Semester1 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public ElectricalLevel4Semester1(){

        l1 = new JLabel("EEE401_SCORE");
        l2 = new JLabel("EEE403_SCORE ");
        l3 = new JLabel("EEE405_SCORE");
        l4 = new JLabel("EEE407_SCORE");
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
                double eee401  = Double.parseDouble(f1.getText());
                double eee403  = Double.parseDouble(f2.getText());
                double eee405  = Double.parseDouble(f3.getText());
                double eee407  = Double.parseDouble(f4.getText());


                int eee_401point = 0;
                int eee_403point = 0;
                int eee_405point = 0;
                int eee_407point = 0;

                if(e.getSource()==b1){


                    if (eee401>=70){
                        eee_401point=5;
                    }

                    else if(eee401>=60 && eee401<70){
                        eee_401point=4;
                    }

                    else if(eee401>=50 && eee401<60){
                        eee_401point=3;
                    }

                    else if(eee401>=45 && eee401<50){
                        eee_401point=2;
                    }

                    else if(eee401>=40 && eee401<45){
                        eee_401point=1;
                    }

                    else{
                        eee_401point=0;
                    }



                    if (eee403>=70){
                        eee_403point=5;
                    }

                    else if(eee403>=60 && eee403<70){
                        eee_403point=4;
                    }

                    else if(eee403>=50 && eee403<60){
                        eee_403point=3;
                    }

                    else if(eee403>=45 && eee403<50){
                        eee_403point=2;
                    }

                    else if(eee403>=40 && eee403<45){
                        eee_403point=1;
                    }

                    else{
                        eee_403point=0;
                    }




                    if (eee405>=70){
                        eee_405point=5;
                    }

                    else if(eee405>=60 && eee405<70){
                        eee_405point=4;
                    }

                    else if(eee405>=50 && eee405<60){
                        eee_405point=3;
                    }

                    else if(eee405>=45 && eee405<50){
                        eee_405point=2;
                    }

                    else if(eee405>=40 && eee405<45){
                        eee_405point=1;
                    }

                    else{
                        eee_405point=0;
                    }



                    if (eee407>=70){
                        eee_407point=5;
                    }

                    else if(eee407>=60 && eee407<70){
                        eee_407point=4;
                    }

                    else if(eee407>=50 && eee407<60){
                        eee_407point=3;
                    }

                    else if(eee407>=45 && eee407<50){
                        eee_407point=2;
                    }

                    else if(eee407>=40 && eee407<45){
                        eee_407point=1;
                    }

                    else{
                        eee_407point=0;
                    }

                    double gp = ((eee_401point*3) + (eee_403point*5) + (eee_405point*4) +(eee_407point*4))/16.0;

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

