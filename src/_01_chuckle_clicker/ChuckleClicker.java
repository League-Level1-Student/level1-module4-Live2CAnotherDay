package _01_chuckle_clicker;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton jokeButton = new JButton("Joke");
	JButton punchlineButton = new JButton("Punchline");

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChuckleClicker().makeButtons();
	}
	public void makeButtons() {
		frame.add(panel);
		frame.setVisible(true);
		jokeButton.addActionListener(this);
		punchlineButton.addActionListener(this);
		panel.add(jokeButton);
		panel.add(punchlineButton);
		frame.pack();
		frame.setTitle("Chuckle Clicker");
		
	}
	public void actionPerformed(ActionEvent arg0) {
			JButton buttonPressed = (JButton) arg0.getSource();
		if (jokeButton == buttonPressed) {
			jokeButton.setText("What is short and squeaks alot? ");
			punchlineButton.setText("Punchline");
		}else {
			jokeButton.setText("Joke");
			punchlineButton.setText("You. >:D");
		}
	

}
}

// Nothing Else to work on here
