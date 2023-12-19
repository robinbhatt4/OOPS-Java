import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public SimpleGUI() {
        // Set up the frame
        setTitle("Simple GUI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        textField = new JTextField(15);
        button = new JButton("Click Me!");
        label = new JLabel("Result:");

        // Add components to the frame
        add(textField);
        add(button);
        add(label);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textField.getText();
                label.setText("Result: " + inputText);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleGUI().setVisible(true);
            }
        });
    }
}
