package Array;

import java.util.Scanner;

public class ScannerDeclwithiniti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int rowsize,columnsize;
		
		System.out.println("Enter row size:");
       rowsize =scan.nextInt();
       System.out.println("Enter column size:");
       columnsize = scan.nextInt();
        
        int arr[][]=new int [rowsize][columnsize];
        System.out.println("Enter array element");
        for(int i=0;i<rowsize;i++) {
        	for(int j=0;j<columnsize;j++) {
        		arr[i][j] = scan.nextInt();
        	}
        }
        
        for(int i=0;i<rowsize;i++) {
        	for(int j=0; j<columnsize;j++) {
         System.out.println(arr[i][j]);        	}
        }
        
        
        

	}

}

