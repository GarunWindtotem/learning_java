// https://www.youtube.com/watch?v=5o3fMLPY7qY

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;


    // constructor
    public GUI(){
        // create objects
        frame = new JFrame();                                        // frame of GUI
        panel = new JPanel();                                        // content in gui
        JButton button = new JButton("Click me");               // button
        label = new JLabel("Number of clicks: 0");              // label

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 300, 10, 30));
        panel.setLayout(new GridLayout(2, 3));
        panel.add(button);
        panel.add(label);

        // standard settings
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("little GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;                                                // increment count
        label.setText("Number of clicks: " + count);
    }
}