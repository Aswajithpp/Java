package Expection;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) throws AgelimitExpection{
		// TODO Auto-generated method stub
		
		int age = 18;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age");
		age = scan.nextInt();
		try {
		if(age<18) {
			throw new AgelimitExpection("below 18 is not eligible for vote");
		}
		else {
			System.out.println("Eligibler for vote ");
		}
		} 
		catch (AgelimitExpection e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Welcome");
		}
	
		
		
	}


