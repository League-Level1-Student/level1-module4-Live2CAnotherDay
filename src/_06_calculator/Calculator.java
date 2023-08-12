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
	int total = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator().makeButtons();
	}
	
	JButton addButton = new JButton("Add");
	JButton subButton = new JButton("Sub");
	JButton mulButton = new JButton("Mul");
	JButton divButton = new JButton("Div");
	JTextField box1 = new JTextField(3);
	JTextField box2 = new JTextField(3);
	
	
	public void makeButtons() {
		frame.add(panel);
		frame.setVisible(true);
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
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
		String b1 = box1.getText();
		int b01 = Integer.parseInt(b1);
		String b2 = box2.getText();
		int b02 = Integer.parseInt(b2);
		total = b01 + b02;
		System.out.println("Total: " + total);
	}else if(subButton == buttonPressed){
		String b1 = box1.getText();
		int b01 = Integer.parseInt(b1);
		String b2 = box2.getText();
		int b02 = Integer.parseInt(b2);
		total = b01 - b02;
		System.out.println("Total: " + total);
	}else if(mulButton == buttonPressed){
		String b1 = box1.getText();
		int b01 = Integer.parseInt(b1);
		String b2 = box2.getText();
		int b02 = Integer.parseInt(b2);
		total = b01 * b02;
		System.out.println("Total: " + total);
	}else if(divButton == buttonPressed){
		String b1 = box1.getText();
		int b01 = Integer.parseInt(b1);
		String b2 = box2.getText();
		int b02 = Integer.parseInt(b2);
		total = b01 / b02;
		System.out.println("Total: " + total);
	}
	}
}

/// Nothing else to work in here...