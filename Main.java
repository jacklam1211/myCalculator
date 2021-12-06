import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.setTitle("Calculator");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
