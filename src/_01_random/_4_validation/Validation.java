//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(6);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if  (randomNumber==0) {
			JOptionPane.showMessageDialog(null,"You look good today!");
		}
		else if  (randomNumber==1) {
			JOptionPane.showMessageDialog(null,"Ready for a good day? Yes you are! ");


		}
		else if  (randomNumber==2) {
			JOptionPane.showMessageDialog(null,"You have the look of confidence! ");
		}	
		else if  (randomNumber==3) {
			JOptionPane.showMessageDialog(null,"Are you a star? cuz you are shining!");
		}
		else if  (randomNumber==4) {
			JOptionPane.showMessageDialog(null,"Worried about Nick Graham? Don't be! \n Your confidence and bravery can send him running!");
			// 2. Repeat all the code above 10 times
		}
		else if  (randomNumber==5) {
			JOptionPane.showMessageDialog(null,"Being smart matters and you matter too.");

			// 3. Find someone to test out your program. They will like it :)
		}


	}	

}
