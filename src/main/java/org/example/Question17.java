package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question17 extends Frame implements ActionListener {
    int count=0;
    Label label;
    Button clickButton;


    public Question17(){
        setLayout(new FlowLayout());
        setSize(500,400);
        setTitle("Number of Click in the frame");
        setVisible(true);

        clickButton= new Button("Click Me!");
        label= new Label("Click count = 0");

        add(clickButton);
        add(label);

        clickButton.addActionListener(this);

    }
    public static void main(String[] args) {
        new Question17();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Click count= "+count);
    }
}
