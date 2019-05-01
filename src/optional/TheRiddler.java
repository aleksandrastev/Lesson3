package optional;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;

		String answer = JOptionPane.showInputDialog(
				"Brothers and sisters I have none, but this man's father is my father's son. \nWho is the man?");

		if (answer.equalsIgnoreCase("my son")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! \nThe answer is simple - the man is my son.");
		}

		answer = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");

		if (answer.equalsIgnoreCase("stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! \nThe answer is simple - a stamp.");
		}

		answer = JOptionPane.showInputDialog("What has hands but can not clap?");

		if (answer.equalsIgnoreCase("clock")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! \nThe answer is simple - a clock.");
		}

		answer = JOptionPane.showInputDialog(
				"If you have me, you want to share me. If you share me, you haven't got me. \nWhat am I?");

		if (answer.equalsIgnoreCase("secret")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong! \nThe answer is simple - a secret.");
		}

		JOptionPane.showMessageDialog(null, "Your score is " + score);

	}
}
