
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddQuestion extends JFrame {

	GridLayout layout1 = new GridLayout(2, 1);
	boolean choice;
	
	public AddQuestion() {
		GridLayout layout = new GridLayout(1, 5);
		ArrayList<Question> questions = new ArrayList<Question>();
		JLabel label = new JLabel("What is your question?");
		JTextField textField = new JTextField("Write your answer here");
		JTextField textField2 = new JTextField("Write your answer here");
		String currentPattern;
		int currentSel;
	

		JPanel mainPanel = new JPanel();
		setSize(800, 1000);
		setContentPane(mainPanel);
		mainPanel.setLayout(layout);

		mainPanel.add(new JLabel("What is your question"));
		mainPanel.add(textField);

		mainPanel.add(new JLabel("Short Version of the Question"));
		mainPanel.add(textField2);

		String[] options = { "Yes", "No" };

		currentPattern = options[0];
		currentSel = 0;

		JComboBox patternList = new JComboBox(options);
		patternList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPattern.equals("Yes"))
					choice = true;
				else
					choice = false;
			}
		});
		mainPanel.add(patternList);

		JButton button = new JButton("Add");
		button.setActionCommand("Button1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question q = new Question(textField.getText(), textField2.getText(), choice);
				AddAnswer ex = new AddAnswer(q);
				questions.add(q);
				ex.setVisible(true);
			}
		});
		mainPanel.add(button);

		JPanel panel = new JPanel();
		setSize(800, 1000);
		setContentPane(panel);
		panel.setLayout(layout1);
		panel.add(mainPanel);

		JButton button2 = new JButton("Publish");
		button2.setActionCommand("Button2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(button2);
	}

	public static void main(String[] args) {
		AddQuestion ex = new AddQuestion();
		ex.setVisible(true);
	}
}
