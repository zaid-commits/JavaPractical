package org.example;
import java.awt.*;
import java.awt.*;
public class Question1 extends Frame {
    public Question1(){
    setLayout(new FlowLayout());

    Label l1= new Label("Fill the Form");
    Label l2= new Label("Enter your Name");
    Label l3= new Label("Enter the text");

    Button b= new Button("Submit");
    TextArea ta= new TextArea("Enter the text");
    TextField tf= new TextField();

    add(l1);

    add(l2);
    add(tf);

    add(l3);
    add(ta);

    add(b);


    setTitle("Form");
    setSize(300,500);
    setVisible(true);

    }
    public static void main(String[] args) {
        new Question1();
    }
}
