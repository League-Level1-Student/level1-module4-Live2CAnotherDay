package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class WhackAMole implements ActionListener {
		JButton button = new JButton(" ");
		JFrame WAMFrame = new JFrame();
		JPanel WAMPanel = new JPanel();
		JLabel WAMLabel = new JLabel();
		private int buttonCount = 0;
		
	
	public static void run(String[] args) {
		// TODO Auto-generated method stub
		
		new WhackAMole().makeButtons();
	}
		public void makeButtons() {
			
			WAMFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			WAMFrame.setVisible (true);
			WAMFrame.add(WAMPanel);
			button.addActionListener(null);
			WAMPanel.add(button);
			WAMFrame.pack();
			WAMFrame.setTitle("WHACK DA MOLE");
		
		}
		public void setting(){
			
		}
	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
		if(buttonPressed.getText().equals("mole")) {
		
			
		}

	}

}
