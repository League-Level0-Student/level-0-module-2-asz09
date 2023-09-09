package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {

		Random randomMaker = new Random();
	String lotteryNumbers = "";
		for (int i=0; i<7; i++) {
			int lottery = randomMaker.nextInt(80);
			System.out.println(lottery);
			lotteryNumbers = lottery+"";
			lotteryNumbers += lottery;
		}
			
		
	 JOptionPane.showMessageDialog(null,lotteryNumbers);

	}
}





//Object nextInt = null;
//Object randomNumber1 = nextInt;
 //Random randomNumber2 = new Random();
 //Random randomNumber3 = new Random();
//Random randomNumber4 = new Random();
 //Random randomNumber5 = new Random();
// Random randomNumber6 = new Random();
//int randomNumber11 =  700;
 //randomNumber11 = randomMaker.nextInt(100);
//System.out.println(randomNumber11);