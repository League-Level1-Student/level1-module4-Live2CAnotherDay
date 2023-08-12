package _07_tv_show_episode_info;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import _06_calculator.Calculator;

public class TVShowEpisodeInfoDisplayer implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton subButton = new JButton("Submit");
	JTextField input = new JTextField(10);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TVShowEpisodeInfoDisplayer().makeButtons();
	}
	public TVShowEpisodeInfoDisplayer() {
		
	}
	public void makeButtons() {
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setTitle("TV Show Info");
		panel.add(subButton);
		panel.add(input);
		subButton.addActionListener(this);
		frame.pack();
	}
	
	
	
	

	
	
	

/////////////////////////DO NOT MODIFY ANY CODE BELOW THIS LINE//////////////////////////////////////////
	
	/**
	 * Searches the tvmaze.com api for season and episode information about
	 * a chosen show and returns the information in a String
	 * 
	 * @param showTitle	the name of the show to get information about
	 * @return 			a String containing the show information or a blank
	 * 					String if the show is not found
	 */
	public String getShowEpisodeData(String showTitle) {
		int id = WebUtilities.getShowId(showTitle);
		if(id < 0) {
			return "";
		}
		
		int totalSeasons = 0;
		int totalEpisodes = 0;
		int[] episodes = null;
		
		try {
			URL url = new URL("https://api.tvmaze.com/shows/"+id+"/seasons");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			InputStream responseStream = connection.getInputStream();
			String in = WebUtilities.getStringFromInputStream(responseStream);
			String[] info = WebUtilities.parseJSONArray(in);
			totalSeasons = info.length;
			episodes = new int[totalSeasons];
			boolean success = true;
			for(int i = 0; i < totalSeasons; i++) {
				try {
					episodes[i] = WebUtilities.getIntFromJSONObject(info[i], "episodeOrder");
				}catch(Exception e) {
					episodes[i] = -1;
					success = false;
				}
				totalEpisodes += episodes[i];
			}
			if(!success) {
				JOptionPane.showMessageDialog(null, "Could not retrieve some or all of the episode data.", "Data Not Available", 0);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String res = showTitle + "\nTotal Seasons: " + totalSeasons + "\nTotal Episodes: " + totalEpisodes + '\n';
		for(int i = 0; i < totalSeasons; i++) {
			res += "Season " + (i + 1) +": " + (episodes[i] > -1 ? episodes[i] : "?") + " episodes\n";
		}
		
		return res;
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (subButton == buttonPressed) {
		String input1 = input.getText();
		String data = getShowEpisodeData(input1);
		JOptionPane.showMessageDialog(null, data);
	}
}
}

/// Nothing Else to work in here.....
