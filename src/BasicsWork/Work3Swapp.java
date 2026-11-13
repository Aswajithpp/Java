package BasicsWork;

import java.util.Scanner;

public class Work3Swapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m =9, n=5;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("Enter m: ");
//        int m = scan.nextInt();
//
//        System.out.print("Enter n: ");
//        int n = scan.nextInt();
//		
		System.out.println("Before Swapping");
		System.out.println("m :"+m);
		System.out.println("n :"+n);
         
		int temp = m;
		m =n;
		n = temp;
		System.out.println("After Swapping");
		System.out.println("m :"+m);
		System.out.println("n :"+n);

		

	}

}
