package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt(100) + 1;

		String guess = JOptionPane.showInputDialog("Guess a number from 1 to 100. Good luck!");
		int guessAsInt = Integer.parseInt(guess);

		for (int i = 4; i >= 0; i--) {
			if (guessAsInt == num) {
				JOptionPane.showMessageDialog(null, guessAsInt + " is correct. Congratulations!");
				break;
			} else if (i == 0) {
				JOptionPane.showMessageDialog(null, "You lose! Secret number is " + num + ".");
			} else if (i == 1) {
				if (guessAsInt < num) {
					guess = JOptionPane.showInputDialog(guessAsInt + " is too low. " + i + " more try!");
					guessAsInt = Integer.parseInt(guess);
				} else if (guessAsInt > num) {
					guess = JOptionPane.showInputDialog(guessAsInt + " is too high. " + i + " more try!");
					guessAsInt = Integer.parseInt(guess);
				}
			} else if (guessAsInt < num) {
				guess = JOptionPane.showInputDialog(guessAsInt + " is too low. " + i + " more tries!");
				guessAsInt = Integer.parseInt(guess);
			} else if (guessAsInt > num) {
				guess = JOptionPane.showInputDialog(guessAsInt + " is too high. " + i + " more tries!");
				guessAsInt = Integer.parseInt(guess);
			}
		}

	}
}
