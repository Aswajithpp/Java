package Methodsandconstructor;

import java.util.Scanner;

public class ScannerM2 {

	
		

		public int add(int num1,int num2) {
			int sum;
			return sum = num1+num2;
	        
		}
		

	    public static void main(String[] args) {
	    	ScannerM2 ob = new ScannerM2();

	    	Scanner scan = new Scanner(System.in);
	

			System.out.println("enter first number:");
			int num1 = scan.nextInt();
            System.out.println("Enter second number:");
           int num2 = scan.nextInt();
	        System.out.println(ob.add(num1, num2));


	}

}
