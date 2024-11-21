package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question16 extends JFrame implements ActionListener {
        JLabel label1= new JLabel("Enter your username");
        JLabel label2= new JLabel("Enter your password");
        JLabel status= new JLabel("");
        JTextField usernameField= new JTextField(10);
        JPasswordField passwordField= new JPasswordField(10);
        JButton loginButton = new JButton("Login");
    public Question16(){

        add(label1);
        add(usernameField);
        add(label2);
        add(passwordField);
        add(loginButton);
        add(status);

        setSize(500,400);
        setVisible(true);
        setTitle("Authentication");
        setLayout(new FlowLayout());

        loginButton.addActionListener(this);

    }
    public static void main(String[] args) {
        new Question16();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username= usernameField.getText();
            String password= new String(passwordField.getPassword());

            if(username.equals("admin")&& password.equals("admin")){
                status.setText("Access Granted");
            }
            else {
                status.setText("Invalid Credentials");
            }
        }catch (Exception ex){
            status.setText("invalid Credentials");
        }
    }
}
