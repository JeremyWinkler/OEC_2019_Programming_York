import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddQuestion extends JFrame {

	protected JFrame window;
	protected JPanel panel;
	protected JButton button;
	private JTextField textField1;

	protected int BORDER_SIZE = 1;

	private int WINDOW_SIZE = 200;
	private int BUTTON_SIZE = 100;

	public void createGUI() {
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

		String label = "What is the question";
		JLabel l1 = new JLabel(label, JLabel.TRAILING);
		textField1 = new JTextField(10);
		l1.setLabelFor(textField1);
		p.add(textField1);

        button = new JButton("Blink");
        button.setSize(BUTTON_SIZE, BUTTON_SIZE / 2);
        button.setActionCommand("Button1");
        button.addActionListener(this);
        button.setVisible(true);
        
		p.setSize(500, 200);
		p.setVisible(true);
		


	}

	public static void main(String []args) {
		AddQuestion ex = new AddQuestion();
		ex.setVisible(true);
	}
}
