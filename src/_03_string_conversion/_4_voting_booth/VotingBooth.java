package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {

		String age = JOptionPane.showInputDialog(null, "How old are you? \n You must be over 18 to vote");

		int input = Integer.parseInt(age);
		if (input >= 18) {
			JOptionPane.showMessageDialog(null, "You are able to vote");

		}
		else {
		JOptionPane.showMessageDialog(null,"You are not allowed to vote according to law.");
		}
	}
}
