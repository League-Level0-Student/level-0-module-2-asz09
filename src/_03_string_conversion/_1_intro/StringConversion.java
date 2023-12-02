package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class StringConversion {
	public static void main(String[] args) {

		
		String userInput=(JOptionPane.showInputDialog(null, "Please enter a number "));
		int variinputable=Integer.parseInt(userInput);
		System.out.println(variinputable);
	}

}
