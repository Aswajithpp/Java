package ControlStawork;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int year = 2016;
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the year: ");
	        int year = scan.nextInt();

	        if (year % 400 == 0) {
	            System.out.println(year + " is a leap year");
	        } 
	        else if (year % 100 == 0) {
	            System.out.println(year + " is not a leap year");
	        } 
	        else if (year % 4 == 0) {
	            System.out.println(year + " is a leap year");
	        } 
	        else {
	            System.out.println(year + " is not a leap year");
	        }

	}

}
