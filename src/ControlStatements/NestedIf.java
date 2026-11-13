package ControlStatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 25;
		if(num >0) {// true
			if(num%2==0) {//false
				System.out.println(num+" is postive and even number");
			}
			
			else {
				System.out.println(num+" is postive and odd number");
			}
		}
		
		
		else {
			if(num%2==0) {
			System.out.println(num+" is negative and even number");
		}
			else {
				System.out.println(num+" is negative and odd number");
			}
	}

}
}





