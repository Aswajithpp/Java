package Oops;
class Superclass{
	String name="Anu";
}

public class SuperKeyword_instance extends Superclass {
	String name="Anupama";
	
	public void display() {
		System.out.println(super.name);
		System.out.println(name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeyword_instance key = new SuperKeyword_instance();
		key.display();

	}

}