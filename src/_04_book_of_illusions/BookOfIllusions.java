package _04_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {
	JFrame frame = new JFrame();
	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JLabel label;
	
	public void run() {
		frame.setVisible(true);
		// 2. make the frame visible
		frame.setSize(100, 100);
		// 3. set the size of the frame
		
		// 4. find 2 images and save them to your project’s _06_book_of_illusions folder
		String illusion = "blocks.jpeg";
		
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		label = loadImageFromComputer(illusion);
		// 7. use the "loadImage..." methods below to initialize your JLabel
		frame.add(label);
		// 8. add your JLabel to the frame
		frame.pack();
		// 9. call the pack() method on the frame
		frame.addMouseListener(this);
		// 10. add a mouse listener to your frame (hint: use *this*)
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("clicked!");
		// 11. Print "clicked!" to the console when the mouse is pressed
        frame.remove(label);
		// 12. remove everything from the frame that was added earlier
        String illusion2 = "spiral.jpeg";
        label = loadImageFromComputer(illusion2);
        frame.add(label);
		// 13. load a new image like before (this is more than one line of code)
        frame.pack();
		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
/// Nothing Else to work on here


