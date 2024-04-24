import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
       createAndShowGUI();
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("GUI with Button and TextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new BorderLayout());

        // Create heading
        JLabel heading = new JLabel("RUDRA ASSISTANT");
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        heading.setHorizontalAlignment(SwingConstants.CENTER);

        // Create button
        JButton button = new JButton("Start");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new check();
            }
        });

        // Add components to the frame
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.add(heading);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
