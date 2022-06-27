// https://www.youtube.com/watch?v=iE8tZ0hn2Ws

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_login implements ActionListener {

    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JLabel successLabel;


    public static void main(String[] args) {
        // create objects
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // configure frame
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        // configure panel
        panel.setLayout(null);

        // configure labels
        // variables
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 30);
        panel.add(userLabel);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 60, 80, 30);
        panel.add(passwordLabel);

        // configure Textboxes
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 40);
        panel.add(userText);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 60, 165, 30);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(165, 100, 100, 30);
        button.addActionListener(new GUI_login());
        panel.add(button);

        successLabel = new JLabel("");
        successLabel.setBounds(10, 130, 300, 30);
        panel.add(successLabel);

        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");

        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println("user: " + user + ", " + "password: " + password);

        if(user.equals("Patrick") && password.equals("1234")) {
            successLabel.setText("login successful");
        }
        else
            successLabel.setText("wrong password: hint: Patrick, 1234");

        }
    }
