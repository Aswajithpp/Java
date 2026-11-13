package ControlStawork;

import java.util.Scanner;

public class Task3Compare2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);

	        System.out.print("Enter first integer: ");
	        int num1 = scan.nextInt();

	        System.out.print("Enter second integer: ");
	        int num2 = scan.nextInt();

	        if (num1 != num2) {
	            System.out.println(num1 + " != " + num2);
	        }

	        if (num1 < num2) {
	            System.out.println(num1 + " < " + num2);
	        }

	        if (num1 <= num2) {
	            System.out.println(num1 + " <= " + num2);
	        }
	}

}
