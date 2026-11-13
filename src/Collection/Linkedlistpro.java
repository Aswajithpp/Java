package Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("Anurag");
		li.add("50");
		li.add("Aswajith");
		li.add("40.80");
		li.add("Riya");
		li.add("40");
		
		//display
				System.out.println(li);
				
				//element size
				System.out.println("Collection size ="+(li.size()));
				
				//for loop - display elements in sequential way
				
				for(int i=0; i<li.size();i++) {
					System.out.println(li.get(i));
				}
				
				//random
				System.out.println("4th index value ="+(li.get(3)));
				
				li.add("Anand");
				li.add("48");
				System.out.println(li);
				
				//remove 
				li.remove(4);
				System.out.println(li);
				
				//iterator
			Iterator itr = li.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			 List li1 = new ArrayList();
			    li1.addAll(li1);
			    System.out.println(li1);
			    
			    
			    li1.removeAll(li1);
			    System.out.println(li1);  
			    
			    System.out.println(li.contains("Anand"));
			    
			    
			    for(String data :li) {
			    	System.out.println(data);
			    }
			    
	}

}
