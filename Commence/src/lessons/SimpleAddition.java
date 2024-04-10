package lessons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleAddition implements ActionListener {

    JTextField textField1, textField2, result;
    JButton go;

    public SimpleAddition() {

        JPanel windowContent = new JPanel();

        FlowLayout f1 = new FlowLayout();
        windowContent.setLayout(f1);

        JLabel label1 = new JLabel("Number 1:");
        textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        textField2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        result = new JTextField(10);
        go = new JButton("Add");
        
        go.addActionListener(this);

        windowContent.add(label1);
        windowContent.add(textField1);
        windowContent.add(label2);
        windowContent.add(textField2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        JFrame frame = new JFrame("My First Calculator");

        frame.setContentPane(windowContent);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 100);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());

        double sum = num1 + num2;
        
        result.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new SimpleAddition();
    }
}
