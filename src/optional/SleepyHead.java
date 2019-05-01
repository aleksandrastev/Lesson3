package optional;

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday = true, isVacation = true;

		int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		int vacation = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "", JOptionPane.YES_NO_OPTION);

		if (weekday == 1) {
			isWeekday = false;
		}

		if (vacation == 1) {
			isVacation = false;
		}

		if (isVacation | !isWeekday) {
			JOptionPane.showMessageDialog(null, "Sleep in");
		} else {
			JOptionPane.showMessageDialog(null, "Get up lazybones!");

		}
	}
}
