package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Question19 extends JFrame implements ActionListener {
    JTextField urlField, detailsField;
    JButton getDetailsButton;

    public Question19(){
        setLayout(new FlowLayout());
        setTitle("Get Hostname, IP, Protocol etc");

        // Initialize components
        add(new JLabel("URL:"));
        urlField = new JTextField(30);
        add(urlField);

        getDetailsButton = new JButton("Get Details");
        add(getDetailsButton);

        detailsField = new JTextField(50);
        detailsField.setEditable(false);
        add(new JLabel("Details"));
        add(detailsField);

        // Add action listener for the button
        getDetailsButton.addActionListener(this);

        // Set window properties
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question19();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            URL url = new URL(urlField.getText());
            String details = "Protocol: " + url.getProtocol() + " Host: " + url.getHost() + " Port: " + url.getPort() + " File: " + url.getFile();
            detailsField.setText(details);
        } catch (Exception ex) {
            detailsField.setText("An Error Occurred");
        }
    }
}
