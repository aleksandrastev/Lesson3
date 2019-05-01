package optional;

import java.util.Random;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

import edu.cmu.sphinx.linguist.flat.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot();

		for (int i = 0; i < 10; i++) {

			String answer = JOptionPane.showInputDialog("Type what color would you like the tortoise to draw:");

			if (answer.equals("red")) {
				rob.setPenColor(java.awt.Color.red);
			} else if (answer.equals("blue")) {
				rob.setPenColor(java.awt.Color.blue);
			} else if (answer.equals("yellow")) {
				rob.setPenColor(java.awt.Color.yellow);
			} else {
				rob.setRandomPenColor();
			}
			rob.setPenWidth(10);
			rob.setSpeed(10);
			rob.penDown();
			for (int j = 0; j < 4; j++) {
				rob.move(100);
				rob.turn(90);

			}

		}

	}
}
