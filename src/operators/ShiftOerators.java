package operators;

public class ShiftOerators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 3, y = -3;
		
		 System.out.println("3 ==> "+Integer.toBinaryString(x));
		  System.out.println("-3 ==> "+Integer.toBinaryString(y));
		
		  System.out.println("Left shift : 3 = "+(x<<3));
          System.out.println(Integer.toBinaryString(x<<3));
        
        

		   System.out.println("Right shift : 3 = "+(x>>1));
          System.out.println(Integer.toBinaryString(x>>1));
         
         
 		   System.out.println("Unsigned shift : 3 = "+(x>>>1));
          System.out.println(Integer.toBinaryString(x>>>1));
          
          
          
          System.out.println("Left shift :- 3 = "+(y<<3));
          System.out.println(Integer.toBinaryString(y<<2));
          
           
          System.out.println("Right shift : -3 = "+(y>>3));
          System.out.println(Integer.toBinaryString(y>>3));
          
          System.out.println("Unsigned shift : -3 = "+(y>>>3));
          System.out.println(Integer.toBinaryString(y>>>3));
          
           

	}

}
