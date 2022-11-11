package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor do you want your popcorn to be?");
		Popcorn popcorn = new Popcorn(flavor);
		
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		
		String timeToCookString = JOptionPane.showInputDialog("How many minutes do you want to pop your popcorn for?");
		int timeToCook = Integer.parseInt(timeToCookString);
		microwave.setTime(timeToCook);
		
		microwave.startMicrowave();
	}
}
