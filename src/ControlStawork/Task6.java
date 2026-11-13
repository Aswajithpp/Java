package ControlStawork;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input the first number:");
		int num1 = scan.nextInt();
		
		System.out.println("input the second number:");
		int num2 = scan.nextInt();
        
		System.out.println("input the Third number:");
		int num3 = scan.nextInt();

		
		
		
		
		if(num1 >= num2 && num1>=num3) {
			System.out.println("The greatest :"+num1);
		}
		
		else if(num2 >= num1 && num2>=num3) {
			System.out.println("The greatest:"+num2);
		}
		
		else {
			System.out.println("The greatest: " + num3);
		}
		
		

	}   

}
