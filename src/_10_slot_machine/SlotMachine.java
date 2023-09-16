package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spinButton = new JButton("Spin");
	JLabel label;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cherry = "cherry.jpeg";
		String lime = "lime.jpeg";
		String orange = "orange.jpeg";
		int random = new Random().nextInt(2);
		if(random == 0) {
			label = loadImageFromComputer(cherry);

		}else if(random == 1){
			label = loadImageFromComputer(lime);

		}else{
			label = loadImageFromComputer(orange);
	
		}
	}
	private static Object loadImageFromComputer(String cherry) {
		// TODO Auto-generated method stub
		return null;
	}
	public void makeButtons() {
		frame.add(panel);
		frame.setVisible(true);
		frame.add(spinButton);
		frame.setSize(100, 100);
		
		
		
		frame.pack();
		frame.setTitle("Slot Machine");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == spinButton) {
			
		}
	}
	

}
//key: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
