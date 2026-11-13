package operators;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1=30, n2= 40;
		
		boolean A = n1 == n2;//false
		boolean B = n1<=n2;//
		
		
		
		//!((a||b)&&(a||b)
		//System.out.println("a||b = "+(A||B));// true
		//System.out.println("(a||b) && (a||b) ="+((A||B) &&(A||B)));
		System.out.println("!(a||b)&&(a||b))="+(!((A||B)&&(A||B))));
		
		
		//!((a&&b)||(a&&b))
		System.out.println(" a&&b= "+(A&&B));
		System.out.println("(a&&b) || (a&&b)="+((A&&B)||(A&&B)));
		System.out.println("!(((a&&b) || (a&&b))="+(!(A&&B)||(A&&B)));
		
		
		
	}

}
