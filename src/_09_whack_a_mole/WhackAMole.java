package _09_whack_a_mole;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import game_tools.Sound;

public class WhackAMole implements ActionListener {
		public JButton firstButton, secondButton,thirdButton, fourthButton, fifthButton;
		private JPanel WAMPanel;
		private int score = 0;
		private JLabel scoreBox = new JLabel("0");
		private int buttonCount = 0;
		private Sound jeopardyThemeClip;
	
	public static void run(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel WAMPanel = new JPanel();
		
		frame.setLayout(new BorderLayout());
		
		
		frame.setVisible (true);
		
		
		frame.setTitle("WHACK DA MOLE");
		
		frame.add(WAMPanel);
		
		
		
		WAMPanel.add(firstButton);
	}
	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
		if (buttonPressed == firstButton) {
			
			firstButton.setText(" ");
		}else if(buttonPressed == secondButton){
			secondButton.setText(" ");
		}else if(buttonPressed == thirdButton){
			thirdButton.setText(" ");
		}else if(buttonPressed == fourthButton){
			fourthButton.setText(" ");
		}else if(buttonPressed == secondButton){
			fifthButton.setText(" ");
		}
		
	
			// Call the askQuestion() method
 
		// Complete the code in the askQuestion() method. When you play the game, the score should change.

		// If the buttonPressed was the secondButton

			// Call the askQuestion() method with a harder question

		// Clear the text on the button that was pressed (set the button text to nothing)

	}

}
