package BasicsWork;

import java.util.Scanner;

public class Work6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num =10;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input decimal number:");
		int num=scan.nextInt();
		  String binary = Integer.toBinaryString(num);
		  
		  System.out.println("decimal value:"+binary);
	}

}
