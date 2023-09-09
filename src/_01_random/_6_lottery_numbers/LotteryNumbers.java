package _01_random._6_lottery_numbers;

import java.awt.Component;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LotteryNumbers {


	public static void main(String[] args) {

		Random randomMaker = new Random();
	String lotteryNumbers = "";
		for (int i=0; i<7; i++) {
			int lottery = randomMaker.nextInt(60);
			System.out.println(lottery);
			
		lotteryNumbers += lottery+" ";
		}
			
		String icon1111 = "76melo.jpg";
		Component dialog = null;
		JOptionPane.showMessageDialog(dialog, lotteryNumbers, "Nick Graham Lotto", JOptionPane.INFORMATION_MESSAGE);
		

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

// JOptionPane.showMessageDialog(null,lotteryNumbers, "Nick Graham Lotto",JOptionPane.INFORMATION_MESSAGE);