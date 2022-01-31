package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.service.BalancedBrackets;

public class main {

	
		public static void main(String[] args)
		{
			BalancedBrackets b1= new BalancedBrackets();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String to be checked");
			String expr = sc.nextLine();

			
			if (b1.BracketsBalanced(expr))
				System.out.println(" The entered String has Balanced Brackets");
			else
				System.out.println("The entered Strings do not contain Balanced Brackets");
		}
}
