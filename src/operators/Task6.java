package operators;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1=30, n2= 40;
		
		boolean A = n1 == n2;//false
		boolean B = n1<=n2;//true
		
		
		System.out.println("A = " + A + "\tB = " + B);
		
		//logical not !

		System.out.println("Logical operators  NOT: !A = " + (!A));
		System.out.println("Logical operators  not : !B = " + (!B));

		
		//logical and&&
		System.out.println("Logical operators and : A&&B = " + (A && B));

		//logical Or ||
		System.out.println("Logical operators  or:  = "+ (A||B));
	}

}

