package BasicsWork;

import java.util.Scanner;

public class Work9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		 int p = 5;
//	        int q = 10;
//	        int r = 15;
//		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first value:");
		int p= scan.nextInt();
		
		System.out.println("Enter second value:");
		int q= scan.nextInt();
		
		System.out.println("Enter third value:");
		int r = scan.nextInt();
		
		boolean result = ((p + q) == r || (q + r) == p || (r + p) == q);

        System.out.println("The result is: " + result);
		
		

	}

}
