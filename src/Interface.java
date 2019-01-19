import java.awt.GridLayout;

import javax.swing.*;


public class Interface extends JFrame {
	
	GridLayout layout = new GridLayout(2,2);
	JLabel mainHeader = new JLabel("Welcome to foo Hospital!");

	public Interface() {
		
		JPanel mainPanel = new JPanel();
		setSize(300, 200);
		setContentPane(mainPanel);
		mainPanel.setLayout(layout);
		
		mainPanel.add(mainHeader);
		mainPanel.add(new JPanel());
		mainPanel.add(new JLabel("Question 1"));
		mainPanel.add(new JTextField("Type your answer here"));
	}
	

	public static void main(String []args) {
		Interface ex = new Interface();
		ex.setVisible(true);
	}
}