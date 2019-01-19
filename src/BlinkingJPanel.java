import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//https://stackoverflow.com/questions/40182458/making-a-jpanel-blink-a-couple-of-times-after-pressing-a-jbutton

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.Color;

public class BlinkingJPanel implements ActionListener {

	protected JFrame window; 
	protected JPanel panel;
	protected JButton button;

	protected Color BACKGROUND1 = Color.red;
    protected Color BACKGROUND2 = Color.WHITE;
    protected Color BORDER_COLOR = Color.BLACK;
    protected int BORDER_SIZE = 1;
    
    private  int WINDOW_SIZE = 200;
    private  int BUTTON_SIZE = 100;
    
    private final int BLINK_AMOUNT = 1;
    private Timer blinkTimer;
    private int blinkCount;
    
    public static void main(String [] args)
    {
    	BlinkingJPanel main = new BlinkingJPanel(); 
    }
    
    public BlinkingJPanel()
    {
    	
    	window = new JFrame("Blinking JPanel");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBackground(BACKGROUND1);
        window.setSize(WINDOW_SIZE, WINDOW_SIZE);
        window.setVisible(true);
        
        panel = new JPanel();
        panel.setSize(100, 100);
        panel.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, BORDER_SIZE));
        panel.setBackground(BACKGROUND1);
        panel.setVisible(true);
        
        button = new JButton("Blink");
        button.setSize(BUTTON_SIZE, BUTTON_SIZE / 2);
        button.setActionCommand("Button1");
        button.addActionListener(this);
        button.setVisible(true);
        
        window.add(panel, BorderLayout.CENTER);
        window.add(button, BorderLayout.NORTH);

        //Timer constructor takes pop time and action listener
        blinkTimer = new Timer(300, this);
        blinkCount = 0;

        
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button)){
            blinkTimer.start();
        }
        else if(e.getSource() instanceof Timer){
            if(blinkCount == BLINK_AMOUNT){
                blinkCount = 0;
                blinkTimer.stop();
            }
            blink();
            blinkCount++;
        }else{
            System.out.println("Default");
        }
    }

    private void blink() {
        if(panel.getBackground() == BACKGROUND1) {
            panel.setBackground(BACKGROUND2);
        } else {
            panel.setBackground(BACKGROUND1);
        }

    }
    }
		
