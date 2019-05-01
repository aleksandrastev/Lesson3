package optional;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		String momsBirthday = "July 27th";
		String dadsBirthday = "August 29th";
		String myBirthday = "December 24th";

		String answer = JOptionPane.showInputDialog("Which birthday do you want?");

		System.out.println(answer);

		if (answer.equals("mom")) {
			JOptionPane.showMessageDialog(null, "Mom's birthday is " + momsBirthday);
		} else if (answer.equals("dad")) {
			JOptionPane.showMessageDialog(null, "Dad's birthday is " + dadsBirthday);
		} else if (answer.equals("you")) {
			JOptionPane.showMessageDialog(null, "My birthday is " + myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}

	}
}
