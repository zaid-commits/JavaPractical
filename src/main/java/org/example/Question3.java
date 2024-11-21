package org.example;
import java.awt.*;

public class Question3 extends Frame {

    public Question3(){
        setLayout(new FlowLayout());
        setSize(400,500);
        setVisible(true);


        List newsPapers= new List(5);
        newsPapers.add("newspaper 1");
        newsPapers.add("newspaper 2");
        newsPapers.add("newspaper 3");
        newsPapers.add("newspaper 4");
        newsPapers.add("newspaper 5");

        add(newsPapers);

    }


    public static void main(String[] args) {
new Question3();
    }
}
