package org.example;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Question9 extends Frame implements ActionListener {
    TextField num1, num2, result;
    Button addButton;
    public Question9(){
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        setTitle("Addition of two numbers using event");


        num1= new TextField(10);
        num2= new TextField(10);
        result=new TextField(10);
        result.setEditable(false);

        addButton = new Button("Add");

        add(new Label("Enter first number"));
        add(num1);
        add(new Label("Enter second number"));
        add(num2);
        add(addButton);
        add(result);


        addButton.addActionListener(this);
    }





    public static void main(String[] args) {
        new Question9();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    try{
        int number1= Integer.parseInt(num1.getText());
        int number2= Integer.parseInt(num2.getText());
        int sum=number2+number1;
        result.setText(String.valueOf(sum));
    }catch (Exception ex){
        result.setText("invalid output");
    }
    }


}
