package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

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
		int WAMScore = 0;
		int WAMMiss = 5;
		private int buttonCount = 0;
		Date startDate; 
		
	static void speak(String words) {
	    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
	    	String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
	                    + words + "');\"";
	        try {
	                Runtime.getRuntime().exec( cmd ).waitFor();
	        } catch( Exception e ) {
	                e.printStackTrace();
	            }
	    } else {
	        try {
	                Runtime.getRuntime().exec( "say " + words ).waitFor();
	        } catch( Exception e ) {
	                e.printStackTrace();
	            }
	    }
	}	
	private void endGame(Date timeAtStart, int molesWhacked) { 
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is " + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
		
	
	
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
			startDate = new Date();
		}
	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
		if(buttonPressed.getText().equals("mole")) {
			
			if (WAMScore == 10) {
				JOptionPane.showMessageDialog(buttonPressed, "You won!");
				endGame(startDate, WAMScore);
				
			}else { 
				WAMScore ++;
				
			}	
		}else {
			if (WAMMiss == 5) {
				endGame(startDate, WAMScore);
			}else {
			WAMMiss --;
			speak("You Missed Bozo");
			
			}
			}
			
		}

	

}

/// skip Already spent 3 weeks on this move on.
