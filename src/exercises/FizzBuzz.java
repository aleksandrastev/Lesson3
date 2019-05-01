package exercises;

import javax.swing.JOptionPane;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				JOptionPane.showMessageDialog(null, "Fizz");
			} else if (i % 5 == 0) {
				JOptionPane.showMessageDialog(null, "Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				JOptionPane.showMessageDialog(null, "FizzBuzz");
			} else {
				JOptionPane.showMessageDialog(null, i);
			}

		}

	}
}
