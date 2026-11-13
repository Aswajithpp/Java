package operators;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char  val = 'D';
		int num = val;
		float deci = num;
		
		System.out.println("---widening type casting---");
		System.out.println("val  "+val+" \t"+"num ="+num+"\t"+"deci ="+deci);
		
		
		float  deci1 = 30.0f;
		int num1 = (int) deci1;
		char val1 = (char) num1;
		
		System.out.println("---Narrowing type casting---");
	 	System.out.println("deci1  "+deci1+" \t"+"num1 ="+num1+"\t"+"val1 ="+val1);
	
	}

}


