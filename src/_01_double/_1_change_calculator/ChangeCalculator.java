package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickelString = JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickelInt = Integer.parseInt(nickelString);
		// Ask the user how many dimes they have, and convert their answer
		String dimeString = JOptionPane.showInputDialog("how many dimes do you have?");
		int dimeInt = Integer.parseInt(dimeString);
		// Ask the user how many quarters they have, and convert their answer
		String quarterString = JOptionPane.showInputDialog("how many quarters do you have?");
		int quarterInt = Integer.parseInt(quarterString);
		// Calculate how much money the user has.  Hint: Use a double variable 
		JOptionPane.showMessageDialog(null, "$" +(nickelInt  *0.05) + (dimeInt *0.1) + (quarterInt *0.25));
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

