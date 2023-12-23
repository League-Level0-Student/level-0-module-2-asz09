package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below….
	public static void main(String[] args) {

		String height;
		// 2) Ask the user to enter their height in inches using JOptionPane and set it
		// to the variable heightToRide
		JOptionPane.showMessageDialog(null,
				"Just a reminder, you must be at least 42 inches to ride the roller coaster!");
		height = JOptionPane.showInputDialog(null, "Please enter your height");

		int heightToRide = Integer.parseInt(height);
		// Uncomment the line below...
		if (heightToRide > 48) {
			JOptionPane.showMessageDialog(null, "Yay! You can ride alone!!!");
		}

		// Do you see the heightToRide > 42 underlined red? That is because you are
		// comparing a STRING to an INTEGER.

		// 3) Convert heightToRide to heightAsInt using Integer.parseInt(); Hint: int
		// heightAsInt = Integer.parse...

		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
		// "Hurray! You are tall enough to ride the coaster alone!" Hint: use
		// JoptionPane

		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!"
		else if (heightToRide >= 42) {
			JOptionPane.showInputDialog(null, "You can ride with someone else.");
		}
		// 6) else print: "You must be at least 42 inches tall to ride the roller
		// coaster pal!"
		else if (heightToRide < 42) {
			JOptionPane.showMessageDialog(null, "You can go ride the kids coaster.");
		}
	}

}
