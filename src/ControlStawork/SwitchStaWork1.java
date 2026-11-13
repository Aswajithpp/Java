package ControlStawork;

public class SwitchStaWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int school =2;
		char depart = 'b';
		
		switch(school) {
		case 1: System.out.println(" School of Computer Science");
		
		
		 switch(depart) {
		 case 'a' : System.out.println(" Department of informatics");
		 break;
		 case 'b' : System.out.println(" Department of Machine Learning");
		 break;
		 }
		 break;
		 
		 
	     case 2: System.out.println(" School of Business");
	
	
	 switch(depart) {
	 case 'a' : System.out.println(" Department of commerce");
	 break;
	 case 'b' : System.out.println(" Department of purchasing");
	 break;
	 }
	 break;
	 
	 
	 case 3: System.out.println(" School of Engineering");
		
		
		 switch(depart) {
		 case 'a' : System.out.println("  Department of Mechanical Engineering");
		 break;
		 case 'b' : System.out.println(" Department of Mechatronics Enginearing");
		 break;
		 }
		 break;
	 
		 
	      default : System.out.println("invalid value");

	}
		 
	

	

}

}

