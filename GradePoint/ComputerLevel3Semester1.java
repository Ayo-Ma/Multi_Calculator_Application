package com.JFrameProject.GradePoint;

import com.JFrameProject.AllAppFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputerLevel3Semester1 extends JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1, b2;

    public ComputerLevel3Semester1(){

        l1 = new JLabel("CSC301_SCORE");
        l2 = new JLabel("CSC303_SCORE ");
        l3 = new JLabel("CSC305_SCORE");
        l4 = new JLabel("CSC311_SCORE");
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
                double csc301  = Double.parseDouble(f1.getText());
                double csc303  = Double.parseDouble(f2.getText());
                double csc305  = Double.parseDouble(f3.getText());
                double csc311  = Double.parseDouble(f4.getText());


                int csc_301point = 0;
                int csc_303point = 0;
                int csc_305point = 0;
                int csc_311point = 0;

                if(e.getSource()==b1){


                    if (csc301>=70){
                        csc_301point=5;
                    }

                    else if(csc301>=60 && csc301<70){
                        csc_301point=4;
                    }

                    else if(csc301>=50 && csc301<60){
                        csc_301point=3;
                    }

                    else if(csc301>=45 && csc301<50){
                        csc_301point=2;
                    }

                    else if(csc301>=40 && csc301<45){
                        csc_301point=1;
                    }

                    else{
                        csc_301point=0;
                    }



                    if (csc303>=70){
                        csc_303point=5;
                    }

                    else if(csc303>=60 && csc303<70){
                        csc_303point=4;
                    }

                    else if(csc303>=50 && csc303<60){
                        csc_303point=3;
                    }

                    else if(csc303>=45 && csc303<50){
                        csc_303point=2;
                    }

                    else if(csc303>=40 && csc303<45){
                        csc_303point=1;
                    }

                    else{
                        csc_303point=0;
                    }


                    if (csc305>=70){
                        csc_305point=5;
                    }

                    else if(csc305>=60 && csc305<70){
                        csc_305point=4;
                    }

                    else if(csc305>=50 && csc305<60){
                        csc_305point=3;
                    }

                    else if(csc305>=45 && csc305<50){
                        csc_305point=2;
                    }

                    else if(csc305>=40 && csc305<45){
                        csc_305point=1;
                    }

                    else{
                        csc_305point=0;
                    }


                    if (csc311>=70){
                        csc_311point=5;
                    }

                    else if(csc311>=60 && csc311<70){
                        csc_311point=4;
                    }

                    else if(csc311>=50 && csc311<60){
                        csc_311point=3;
                    }

                    else if(csc311>=45 && csc311<50){
                        csc_311point=2;
                    }

                    else if(csc311>=40 && csc311<45){
                        csc_311point=1;
                    }

                    else{
                        csc_311point=0;
                    }



                    double gp = ((csc_301point*3) + (csc_303point*5) + (csc_305point*4) +(csc_311point*4))/16.0;

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
