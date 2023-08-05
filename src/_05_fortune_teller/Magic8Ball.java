package _05_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Magic8Ball {
	public static void main(String[] args) throws Exception {
    // 1. Make a main method that includes all the steps below….
		int random = new Random().nextInt(4);
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		System.out.println(random);
	// 3. Print out this variable
		String question = JOptionPane.showInputDialog("Please enter a question for the 8 ball");
	// 4. Get the user to enter a question for the 8 ball
		if(random == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
			// 5. If the random number is 0

			// -- tell the user "Yes"

		}else if(random == 1){
			JOptionPane.showMessageDialog(null, "No");
	// 6. If the random number is 1

	// -- tell the user "No"
		}else if(random == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"
		}else {
	// 8. If the random number is 3
			JOptionPane.showMessageDialog(null, "ur mom");
	// -- write your own answer
		}
	}
}
