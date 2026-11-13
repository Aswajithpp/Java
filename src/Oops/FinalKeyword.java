package Oops;

class finalClass{
	public void display() {
		System.out.println("Hello..");
	}
}


public class FinalKeyword  extends finalClass{
	
	public void display1() {
		System.out.println("java programming..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int age = 20;
		System.out.println(age);
		
		FinalKeyword ob = new 	FinalKeyword();
		ob.display();
        ob.display1();		
		
		
		

	}

}
