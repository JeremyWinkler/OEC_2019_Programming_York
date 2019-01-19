import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class AddAnswer extends JFrame {
	GridLayout layout1 = new GridLayout(2, 1);
	ArrayList<Answer> answers = new ArrayList<Answer>();

	public AddAnswer(Question q) {
		GridLayout layout = new GridLayout(1, 5);
		JLabel label = new JLabel("What is your answer?");
		JTextField textField = new JTextField("Write your answer here");
		JTextField textField2 = new JTextField("Write your answer here");

		JPanel panel = new JPanel();
		setSize(800, 1000);
		setContentPane(panel);
		panel.setLayout(layout);

		panel.add(new JLabel("What is your answer"));
		panel.add(textField);

		panel.add(new JLabel("What is your value to the question"));
		panel.add(textField2);

		JButton button = new JButton("Add");
		button.setActionCommand("Button1");

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Answer a = new Answer(textField.getText(), Integer.parseInt(textField2.getText()));
				answers.add(a);
				textField.setText("");
				textField2.setText("");
			}
		});
		panel.add(button);

		JPanel mainPanel = new JPanel();
		setSize(800, 1000);
		setContentPane(mainPanel);
		mainPanel.setLayout(layout1);
		mainPanel.add(panel);
		
		JButton button2 = new JButton("Done");
		button2.setActionCommand("Button1");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				q.answer = answers;
				dispose();
			}
});
		mainPanel.add(button2);
	}
}
