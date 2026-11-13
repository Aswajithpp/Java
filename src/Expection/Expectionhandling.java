package Expection;

public class Expectionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
	
		
		try {
			System.out.println(a/0);// arithmatic expection
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
			
		System.out.println("Hello");
		

	}

}
