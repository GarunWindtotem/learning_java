import javax.swing.*;
import java.awt.*;

public class GUI_Volume {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // configure frame
        frame.setSize(1690/3, 900/3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        // configure panel
        panel.setLayout(null);

        // configure font
        Font fontTitle = new Font("Arial", Font.BOLD, 24);
        Font fontSubTitle = new Font("Arial", Font.BOLD, 18);
        Font fontText = new Font("Arial", Font.BOLD, 14);

        // configure Title
        JLabel titleLabel = new JLabel("in-Prozess Kontrolle");
        titleLabel.setFont(fontTitle);
        titleLabel.setBounds(100, 20, 300, 40);
        panel.add(titleLabel);

        // configure Masse Labels
        JLabel masse1Label = new JLabel("Masse 1");
        masse1Label.setBounds(20, 80, 80, 40);
        masse1Label.setFont(fontText);
        panel.add(masse1Label);

        JLabel masse2Label = new JLabel("Masse 2");
        masse2Label.setBounds(20, 140, 80, 40);
        masse2Label.setFont(fontText);
        panel.add(masse2Label);

        JLabel masse3Label = new JLabel("Masse 3");
        masse3Label.setBounds(20, 200, 80, 40);
        masse3Label.setFont(fontText);
        panel.add(masse3Label);

        // configure TextBoxen
        JTextField masse1Text = new JTextField();
        masse1Text.setBounds(120, 80, 120, 40);
        masse1Text.setFont(fontText);
        panel.add(masse1Text);

        JTextField masse2Text = new JTextField();
        masse2Text.setBounds(120, 140, 120, 40);
        masse2Text.setFont(fontText);
        panel.add(masse2Text);

        JTextField masse3Text = new JTextField();
        masse3Text.setBounds(120, 200, 120, 40);
        masse3Text.setFont(fontText);
        panel.add(masse3Text);


        frame.setVisible(true);
    }
}
