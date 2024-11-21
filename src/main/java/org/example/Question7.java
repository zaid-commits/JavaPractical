package org.example;
import java.awt.*;

public class Question7 extends Frame {
    public Question7(){
    setLayout(new GridLayout(3,3));
    setVisible(true);
    setSize(500,500);
    setTitle("GridLayout");

    for (int i=1;i<=9;i++){
        add(new Button("Button"+i));
    }






    }

    public static void main(String[] args) {
        new Question7();
    }
}
