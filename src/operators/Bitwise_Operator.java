package operators;

public class Bitwise_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1 = 15, n2 = 16;
		
		System.out.println("n1 =15 :"+Integer.toBinaryString(n1));
		System.out.println("n2 =16 :"+Integer.toBinaryString(n2));

		//bitwise or
		System.out.println("Bitwise or : 15||16="+(n1|n2));
		System.out.println("n1|n2 -> "+Integer.toBinaryString(n1|n2));

		
		//bitwise and &&
		System.out.println("Bitwise and : 15&&16="+(n1&n2));
		System.out.println("15&16 -> "+Integer.toBinaryString(n1&n2));
		
		//bitwise XOR
		System.out.println("Bitwise and : 15^16="+(n1^n2));
		System.out.println("15^16 -> "+Integer.toBinaryString(n1^n2));
		
		//bitwise complement
		System.out.println("Bitwise ~ : ~15="+(~n1));
		System.out.println("~15 -> "+Integer.toBinaryString(~n1));

		System.out.println("Bitwise ~ : ~16="+(~n2));
		System.out.println("~16 -> "+Integer.toBinaryString(~n2));

		
		

		
	}

}
