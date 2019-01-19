import javax.swing.*;


public class Interface extends JFrame {

	public Interface() {
		
		
		JPanel mainPanel = new JPanel();
		setSize(300, 200);
		setContentPane(mainPanel);
	}
	

	public static void main(String []args) {
		Interface ex = new Interface();
		ex.setVisible(true);
	}
}