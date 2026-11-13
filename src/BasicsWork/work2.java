package BasicsWork;

import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		 float num1 = 10;
//	     float num2 = 5;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first value:");
		float num1 = scan.nextFloat();
		

		System.out.println("Enter second value:");
		float num2 = scan.nextFloat();
		
		float result = num1 * num2;
		
		System.out.println("Multi :"+result);
		

	}

}


