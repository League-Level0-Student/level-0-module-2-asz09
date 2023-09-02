package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {

		Random randomMaker = new Random();
		Random e = randomMaker;
		Random lottery = e;
		for(int i = 0; i < 6; i++) {
			Random e1 = randomMaker;
			Random e11 = lottery;

		}
		JOptionPane.showMessageDialog(null,lottery);
	}
}	


//int randomNumber0 = randomMaker.nextInt(100);

// int randomNumber1 = randomMaker.nextInt(100);

//int randomNumber2 = randomMaker.nextInt(100);

//int randomNumber3 = randomMaker.nextInt(100);

//int randomNumber4 = randomMaker.nextInt(100);

//int randomNumber5 = randomMaker.nextInt(100); 