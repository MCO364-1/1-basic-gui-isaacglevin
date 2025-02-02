import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setSize(751, 500);
        window.setTitle("Sum Calculator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());

        JButton button = new JButton("Calculate Sum");
        JTextField text1 = new JTextField(1);
        JTextField text2 = new JTextField(1);
        JLabel label = new JLabel("    ");

        window.add(text1, BorderLayout.NORTH);
        window.add(text2, BorderLayout.SOUTH);
        window.add(button, BorderLayout.CENTER);
        window.add(label, BorderLayout.WEST);
        window.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int one = Integer.parseInt(text1.getText());
                int two = Integer.parseInt(text2.getText());
                int sum = one + two;
                label.setText("Sum: " + sum);
            }
        });


    }
}