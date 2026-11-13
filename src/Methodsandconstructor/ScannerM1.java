package Methodsandconstructor;

import java.util.Scanner;

public class ScannerM1 {

		public void add() {
			Scanner scan = new Scanner(System.in);
	        int num1,num2 ,sum;

			System.out.println("enter first number:");
			num1 = scan.nextInt();
            System.out.println("Enter second number:");
            num2 = scan.nextInt();
            sum = num1 + num2;
	        System.out.println(sum);
	        
		}
		
	    public static void main(String[] args) {
	    	
	    	ScannerM1 ob = new ScannerM1();
	    	ob.add();

	}

}


