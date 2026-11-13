package Task;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int limit = 5;

         for (int i = 1; i <= limit; i++) {

             for (int j = 1; j <= i; j++) {
                 System.out.print(i);
             }

             System.out.println();
         }
         
         for(int i =5; i>=1;i--) {
        	 for(int j=1; j>=i;j--) {
        		 System.out.println(i);
        	 }
        	 
        	 System.out.println();
         }

	}

}

