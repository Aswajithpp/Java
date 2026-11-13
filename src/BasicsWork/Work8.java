package BasicsWork;

import java.util.Scanner;

public class Work8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int num = 8;
		Scanner  scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
       int num = scan.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
		
		

	}

}


