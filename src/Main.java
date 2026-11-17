import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.RED, 2);


        JLabel label = new JLabel("Hello, World!");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Courier New", Font.BOLD, 24));
        label.setBackground(Color.YELLOW);
        label.setOpaque(true);
        label.setBorder(border);
        //label.setBounds(0, 0, 200, 50);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
