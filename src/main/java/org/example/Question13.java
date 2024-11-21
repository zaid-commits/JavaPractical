package org.example;

import javax.swing.*;
import java.awt.*;

public class Question13 extends JFrame {
    public Question13() {
        setLayout(new FlowLayout());
        setTitle("Jtable Demonstration");
        setSize(500,500);
        setVisible(true);


        String[] columns={"Name", "percentage", "grade"};
        String[][] data={
            {"Zaid","90","A+"},
            {"Zaid","90","A+"},
            {"Zaid","90","A+"},
            {"Zaid","90","A+"},
            {"Zaid","90","A+"},
            {"Zaid","90","A+"},
            {"Zaid","90","A+"},
            {"Zaid","90","A+"},
            {"Zaid","90","A+"},
            {"Zaid","90","A+"},
        };

        JTable table= new JTable(data,columns);

        JScrollPane scrollPane= new JScrollPane(table);
        add(scrollPane);
    }

    public static void main(String[] args) {
    new Question13();
    }
}