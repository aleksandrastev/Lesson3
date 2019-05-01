package optional;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			int randomNumber = new Random().nextInt(5);

			System.out.println(randomNumber);

			if (randomNumber == 0) {
				JOptionPane.showMessageDialog(null,
						"You are blessed. You are great. You are not alone. You are powerful.");
			}
			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "Watching you is like listening to angels sing!");
			}
			if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null,
						"You are amazing person with unique talents. Have faith in your abilities.");
			}
			if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null,
						"If God wanted the universe to be imperfect, He would not have created you.");
			}
			if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null,
						"You are special individual. \nNobody can be you. \nYou can rise to a greater heights.");
			}
		}

	}
}
