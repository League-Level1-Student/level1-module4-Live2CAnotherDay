package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spinButton = new JButton("Spin");
	JLabel label,label2, label3;
	String cherry = "cherry.jpeg";
	String lime = "lime.jpeg";
	String orange = "orange.jpeg";
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
	}

	public void makeGUI() {
		randomizer();
		spinButton.addActionListener(this);
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(spinButton);
		frame.setSize(100, 100);
		frame.setTitle("Slot Machine");
		frame.pack();
		System.out.println("Hello, User. Please press the Spin Button to being your gambling addiction");
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == spinButton) {
			
			frame.remove(panel);
			panel.remove(label);
			panel.remove(label2);
			panel.remove(label3);
			randomizer();
			
			panel.add(label);
			panel.add(label2);
			panel.add(label3);
			frame.add(panel);
			frame.pack();
			
		}
	}
	public void randomizer() {
		try {
			int random = new Random().nextInt(3);
			if(random == 0) {
				
				label = createLabelImage(cherry);
				
			}else if(random == 1){
				label = createLabelImage(lime);

			}else{
				label = createLabelImage(orange);
		
			}
			int random2 = new Random().nextInt(3);
			if(random2 == 0) {
				label2 = createLabelImage(cherry);
				
			}else if(random2 == 1){
				label2 = createLabelImage(lime);

			}else{
				label2 = createLabelImage(orange);
		
			}
			int random3 = new Random().nextInt(3);
			if(random3 == 0) {
				label3 = createLabelImage(cherry);
				
			}else if(random3 == 1){
				label3 = createLabelImage(lime);

			}else{
				label3 = createLabelImage(orange);
		
			}
			if(random == random2 && random2 == random3) {
				System.out.println("You Win! But at what cost ...");
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	

}
/// Nothing Else to work on here.
