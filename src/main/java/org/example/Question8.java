package org.example;
import java.awt.*;

public class Question8 extends Frame{
    public Question8(){
        setLayout(new FlowLayout());
        setSize(500,500);
        setTitle("Color MenuBar");
        setVisible(true);


        MenuBar mb= new MenuBar();

        Menu m= new Menu("Colors");
        MenuItem red= new MenuItem("Red");
        MenuItem yellow= new MenuItem("Yellow");
        MenuItem green= new MenuItem("Green");
        MenuItem blue= new MenuItem("Blue");
        MenuItem black= new MenuItem("black");
        black.setEnabled(false);

        m.add(red);
        m.add(yellow);
        m.add(green);
        m.add(blue);
        m.add(black);


        mb.add(m);
        setMenuBar(mb);
    }


    public static void main(String[] args) {
        new Question8();
    }
}
