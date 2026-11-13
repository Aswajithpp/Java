package ControlStatements;

public class NextedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  school = 2;
		char depart = 'b';
		
		switch(school) {
		
		case 1: System.out.println("scool of cs");
		
		 switch(depart) {
		 
		 case 'a' : System.out.println("a. depart of imformation");
		 break;
		 case 'b': System.out.println(" b .depart of meachine learning ");
		 break;
		}
		 break;
		 
		 
		 
		case 2: System.out.println("scool of business");
		
		 switch(depart) {
		 
		 case 'a' : System.out.println("a.depart of commerce");
		 break;
		 case 'b': System.out.println("b.depart of purchasing");
		 break;
		}
		 break;
		 
		 
		case 3: System.out.println("scool of engineering");
		
		 switch(depart) {
		 
		 case 'a' : System.out.println("a.depart of mech");
		 break;
		 case 'b': System.out.println("b.depart of mechelectronics ");
		 break;
		}
		 break;
		 
		
		default : System.out.println("invalid value");
		
		
		}
		
		
	}

}

