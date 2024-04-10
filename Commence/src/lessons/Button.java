package lessons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Button extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public Button() {
		setSize(200, 300);
		setTitle("Hello World");
		setVisible(true);

		JButton myButton = new JButton("Click me");
		myButton.addActionListener(this);
		add(myButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Hello World");
	}

	public static void main(String[] args) {
		new Button();
	}
}
