package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Calculator implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator().makeButtons();
	}
	
	JButton addButton = new JButton("Add");
	JButton subButton = new JButton("Sub");
	JButton mulButton = new JButton("Mul");
	JButton divButton = new JButton("Div");
	JTextField box1 = new JTextField(" ");
	JTextField box2 = new JTextField(" ");
	
	public void makeButtons() {
		frame.add(panel);
		frame.setVisible(true);
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		panel.add(addButton);
		panel.add(subButton);
		panel.add(mulButton);
		panel.add(divButton);
		panel.add(box1);
		panel.add(box2);
		frame.pack();
		frame.setTitle("Calculator");
		
	}
	@Override
	
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
	if (addButton == buttonPressed) {
		
	}else if(subButton == buttonPressed){
		
	}else if(mulButton == buttonPressed){
		
	}else if(divButton == buttonPressed){
		
	}
	}
}
