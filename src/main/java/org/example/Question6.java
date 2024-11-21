package org.example;
import javax.swing.border.Border;
import java.awt.*;

public class Question6 extends Frame{
    public Question6(){
        setTitle("BorderLayout");
        setLayout(new BorderLayout());
        setSize(500,600);
        setVisible(true);

        add(new Button("north"),BorderLayout.NORTH);
        add(new Button("South"),BorderLayout.SOUTH);
        add(new Button("East"),BorderLayout.EAST);
        add(new Button("West"),BorderLayout.WEST);
        add(new Button("Center"),BorderLayout.CENTER);


    }

    public static void main(String[] args) {
        new Question6();
    }
}

