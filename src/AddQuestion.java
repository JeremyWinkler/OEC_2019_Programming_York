
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.sun.javafx.tk.Toolkit;
import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
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
		setSize(3000, 3000);
		setContentPane(mainPanel);
		mainPanel.setLayout(layout);
	
		Font font = new Font("Monospaced", Font.PLAIN, 30);
		Font font2 = new Font("Monospaced", Font.PLAIN, 19);
		JLabel label1 = new JLabel("What is your question");
		mainPanel.add(label1);
		mainPanel.add(textField);
		
		JLabel label2 = new JLabel("Short version of the Question");
		mainPanel.add(label2);
		mainPanel.add(textField2);

		String[] options = { "Multiple Choice", "Checklist" };

		currentPattern = options[0];
		currentSel = 0;

		JComboBox patternList = new JComboBox(options);
		patternList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (currentPattern.equals("Multiple Choice"))
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
				textField.setText("");
				textField.setText("");
				questions.add(q);
				ex.setVisible(true);
			}
		});
		mainPanel.add(button);
	
		JPanel panel = new JPanel();
		setSize(2000, 2000);
		setContentPane(panel);
		panel.setLayout(layout1);
		panel.add(mainPanel);

		JButton button2 = new JButton("Publish");
		button2.setActionCommand("Button2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCreator f;
				try {
					f = new FormCreator();
					f.printForm(questions);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		panel.add(button2);
		textField.setFont(font);
		textField2.setFont(font);
		label1.setFont(font2);
		label2.setFont(font2);
		button.setFont(font);
		button2.setFont(font);
		patternList.setFont(font);
	}

	public static void main(String[] args) {
		AddQuestion ex = new AddQuestion();
		ex.setVisible(true);
	}
}
