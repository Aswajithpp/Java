package operators;

public class UnaryOperator {
	
	public static void main(String args[]) {
		
		int n = 200;
		n = -n;
		System.out.println(n);
		
		boolean val = true;
		System.out.println(!val);
		
		int num = 20;
		num++;
		System.out.println("num :"+num);
		
		++num;
		System.out.println("num :"+num);
		
		num--;
		System.out.println("num :"+num);
		
		--num;
		System.out.println("num:"+num);
		
		System.out.println(~num);
		
		
	}

}
