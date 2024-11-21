package org.example;
import java.awt.*;
import java.awt.event.*;

public class Question2 extends Frame{
    public Question2(){

        setLayout(new FlowLayout());

        Checkbox marathi= new Checkbox("Marathi");
        Checkbox hindi= new Checkbox("hindi");
        Checkbox sanskrit= new Checkbox("Sanskrit");
        Checkbox english= new Checkbox("English");

        CheckboxGroup genderGroup= new CheckboxGroup();
        Checkbox male= new Checkbox("male",genderGroup,false);
        Checkbox female= new Checkbox("female",genderGroup,true);
        Label l1= new Label("Select your gender preference");
        Label l2= new Label("Select your langauge preference");

        add(l1);
        add(male);
        add(female);

        add(l2);
        add(hindi);
        add(marathi);
        add(sanskrit);
        add(english);

        setSize(500,500);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Question2();
    }
}
