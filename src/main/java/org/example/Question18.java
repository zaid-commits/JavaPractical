import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Question18 extends Frame implements ActionListener {
    TextField hostField, ipField;
    Button getIpButton;

    public Question18() {
        // Set Layout
        setLayout(new FlowLayout());

        // Components
        add(new Label("Hostname:"));
        hostField = new TextField(20);
        add(hostField);

        getIpButton = new Button("Get IP Address");
        add(getIpButton);

        ipField = new TextField(20);
        ipField.setEditable(false);
        add(new Label("IP Address:"));
        add(ipField);

        // Add Action Listener
        getIpButton.addActionListener(this);

        // Window close handler
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Frame properties
        setTitle("InetAddress Demo");
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String hostname = hostField.getText();
            InetAddress inet = InetAddress.getByName(hostname);
            ipField.setText(inet.getHostAddress());
        } catch (Exception ex) {
            ipField.setText("Invalid Hostname");
        }
    }

    public static void main(String[] args) {
        new Question18();
    }
}
