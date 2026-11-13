package ControlStawork;

public class Work9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int num = 1; num <= 500; num++) {

	            int n = num;
	            int sum = 0;

	            while (n > 0) {

	                int digit = n % 10;
	                sum = sum + (digit * digit * digit);
	                n = n / 10;
	            }

	            if (sum == num) {
	                System.out.println(num);
	            }
	        }
	}

}
