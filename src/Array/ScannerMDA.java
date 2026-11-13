package Array;

import java.util.Scanner;

public class ScannerMDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner scan = new Scanner(System.in);
			
			int arraysize;
			System.out.println("Enter Array Size:");
			arraysize=scan.nextInt();
			
			int arr[]=new int[arraysize];
			System.out.println("Enter array element:");
			
			for(int i=0; i<arr.length;i++) {
				arr[i]= scan.nextInt();
			}
			
			
			System.out.println("Array elements:");
			for(int i=0;i<arr.length;i++) {
				System.out.println(i);
				
			}
	}

}
