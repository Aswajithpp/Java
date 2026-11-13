package basic;

public class Instancestatic {
	
	String name;
	static String course = "Testing";
	
	public static void main(String args[]) {
		int mark;
		Instancestatic stud1 = new Instancestatic();
		
		System.out.println("Name :"+(stud1.name="Aswajith"));
		System.out.println("course :"+course);
		System.out.println("Mark :"+(mark=15));
		
		
		
		
        Instancestatic stud2 = new Instancestatic();
		
		System.out.println("Name :"+(stud2.name="Anurag"));
		System.out.println("course :"+course);
		System.out.println("Mark :"+(mark=19));
		
		
        Instancestatic stud3 = new Instancestatic();
		
		System.out.println("Name :"+(stud3.name="Shemleek"));
		System.out.println("course :"+(course = "Developer"));
		System.out.println("Mark :"+(mark=25));
		
		
        Instancestatic stud4 = new Instancestatic();
		
		System.out.println("Name :"+(stud4.name="Anu"));
		System.out.println("course :"+course);
		System.out.println("Mark :"+(mark=15));
		
		
		
		
	}

}
