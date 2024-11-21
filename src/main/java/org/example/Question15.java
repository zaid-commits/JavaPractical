package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question15 extends Frame implements ActionListener {
    TextField num1,num2,result;
    Button multiplyButton;
    public Question15(){
        setSize(400,500);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Multiplication of 2 numbers");

        num1= new TextField();
        num2= new TextField();
        multiplyButton= new Button("Multiply");
        result= new TextField();
        result.setEditable(false);

        add(new Label("Enter first number"));
        add(num1);
        add(new Label("Enter second number"));
        add(num2);
        add(new Label("Result"));
        add(result);
        add(multiplyButton);
        multiplyButton.addActionListener(this);


    }
    public static void main(String[] args) {
        new Question15();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        int number1= Integer.parseInt(num1.getText());
        int number2= Integer.parseInt(num2.getText());
        int product= number1*number2;
        result.setText(String.valueOf(product));
        }catch (Exception ex){
            result.setText("Invalid Output");
        }
    }
}
