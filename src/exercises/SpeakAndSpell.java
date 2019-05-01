package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class SpeakAndSpell {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Press the OK button and wait to hear the word.");
		int score = 0;
		String word = "mandlebrot";
		speak(word);
		String answer = JOptionPane.showInputDialog("Spell the word:");
		if (answer.equals(word)) {
			speak("correct");
			score += 2;
		} else {
			speak("wrong");
			score -= 1;
		}
		JOptionPane.showMessageDialog(null, "Press the OK button for next word.");
		word = "curriculum";
		speak(word);
		answer = JOptionPane.showInputDialog("Spell the word:");
		if (answer.equals(word)) {
			speak("correct");
			score += 2;
		} else {
			speak("wrong");
			score -= 1;
		}
		JOptionPane.showMessageDialog(null, "Press the OK button for next word.");
		word = "requirement";
		speak(word);
		answer = JOptionPane.showInputDialog("Spell the word:");
		if (answer.equals(word)) {
			speak("correct");
			score += 2;
		} else {
			speak("wrong");
			score -= 1;
		}
		JOptionPane.showMessageDialog(null, "Press the OK button for next word.");
		word = "examination";
		speak(word);
		answer = JOptionPane.showInputDialog("Spell the word:");
		if (answer.equals(word)) {
			speak("correct");
			score += 2;
		} else {
			speak("wrong");
			score -= 1;
		}
		JOptionPane.showMessageDialog(null, "Your score is " + score);
		if (score >= 7) {
			speak("you are pro");
		} else if (score >= 5) {
			speak("great job");
		} else if (score >= 3) {
			speak("good so far");
		} else {
			speak("best of luck next time");
		}

	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
