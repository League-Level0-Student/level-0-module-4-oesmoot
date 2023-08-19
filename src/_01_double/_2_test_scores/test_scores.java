package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
	public static void main(String[] args) {
		
	

	String stringScore = JOptionPane.showInputDialog("what is your test score");
	int score = Integer.parseInt(stringScore);
	if (score >0 &&score <51) {
		JOptionPane.showMessageDialog(null, "FAIL!");
	}
	if (score <71 &&score >50) {
		JOptionPane.showMessageDialog(null, "meh.");
	}
	if (score <81 &&score >70) {
		JOptionPane.showMessageDialog(null, "okay...");
	}
	if (score <91 &&score >80) {
		JOptionPane.showMessageDialog(null, "pretty good!");
	}
	if (score <100 &&score >90) {
		JOptionPane.showMessageDialog(null, "nice!");
	}
	if (score == 100) {
		JOptionPane.showMessageDialog(null, "perfect!!!");
	}
}
}
