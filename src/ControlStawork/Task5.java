package ControlStawork;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);

	        System.out.print("Input a number: ");
	        int num = scan.nextInt();

	        if (num % 2 == 0) {
	            System.out.println(1);
	        } else {
	            System.out.println(0);
	        }

	}

}
