package Oops;

public class ThisKeyword {
	//instance variable
	
	String name;
	int rno;
	float fee;
	
	public ThisKeyword(String name, int rno, float fee) {
		this.name = name;
		this.rno=rno;
		this.fee=fee;
		
		
	}

	 public void display() {
		 
		 System.out.println("Name="+name);
		 System.out.println("Roll number="+rno);
		 System.out.println("Fees ="+fee);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword ob = new ThisKeyword("Aswajith", 22, 10000);
		ob.display();

	}

}
