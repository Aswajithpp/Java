package Methodsandconstructor;

public class Method1 {
	//1.function with no return type and with parameter

	public void areaOfrectangle(float l, float b) {
		float area;
		area =l*b;
		System.out.println("Area ="+area);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Method1 ob = new Method1();
         ob.areaOfrectangle(2.2f,2.3f);
	}
}

