package exercises;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Are you happy?");

		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else {
			answer = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}

	}
}
