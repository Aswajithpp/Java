package Methodsandconstructor;

public class Methodpro {
//method declaration
	//non-static method or instance method
	
	public  void add() {
		
		int num1 = 20, num2 = 56, sum;
		sum = num1+num2;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 100, num2 = 500;
		
		System.out.println("Maimum value is :"+(Math.max(num1, num2)));
            //object creation
		
		Methodpro ob = new Methodpro();
		ob.add();
	}

}
