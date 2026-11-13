package Array;

public class Stringpro {

    public static void main(java.lang.String[] args) {

        // Character array
        char exp[] = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(exp[2]);
        System.out.println(exp);

        // Simple for loop
        for (int i = 0; i < exp.length; i++) {
            System.out.println(exp[i]);
        }

        System.out.println("Elements");

        // For-each loop
        for (char data : exp) {
            System.out.println(data);
        }

        // String array
        String names[] = {"Aswajith", "Shemleek", "Shahal", "Fidha"};

        System.out.println(names[1]);

        for (String data : names) {
            System.out.println(data);
        }

        // String literals
        // String Constant Pool
        String name1 = "Anu";
        String name2 = "Anu1";

        // Compare using ==
        System.out.println(name1 == name2);

        // new keyword
        // Creates String objects
        String name3 = new String("Anu");
        String name4 = new String("Anu1");

        // Compare using ==
        System.out.println(name3 == name4);

        // Compare String content using equals()
        System.out.println(name3.equals(name4));

        // Compare
        System.out.println(name2 == name3);
        System.out.println(name2.equals(name3));
        
        
        name1 = name1+"Thomas";
        
        //using concat()
        
         name2.concat("Das");
         System.out.println(name2);// string is immutable
         
         
         //stringbuffer and stringbuilder
         StringBuffer st = new StringBuffer("Mohan");
         StringBuilder st1 = new StringBuilder("Das");
         
         st.append(st1);
         System.out.println(st);
         
         st.append("V");
         System.out.println(st);
        
         //length
         String s1 ="india";
         String s2 = "country";
         
         System.out.println(s1.length());
         
         
         //equals
         System.out.println(s2.length());         
         String s3 = "hello";
         String s4 = "hello";
         String s5 =  " HELLO";
         String s6 = "ai";
         
         System.out.println(s3.equals(s4));
         System.out.println(s3.equals(s5));
         System.out.println(s2.equals(s6));     
         
         
      
       //CompareTo
     	String a="hello";
     	String b="hello";
     	String c="hai";
     	String d="flag";
     	
     	System.out.println(a.compareTo(b));
     	System.out.println(a.compareTo(c));
     	System.out.println(c.compareTo(b));
         
         
       
         //concat
         String s7 = "Mohan";
         String s8 = "Lal";
         System.out.println(s7.concat(s8));
         
         
       //Contains
     	String s9="Java is a high level programing language";
     	System.out.println(s9.contains("low level"));
     	System.out.println(s9.contains("high level"));
     	
     	//char
     	
     	
     	
     	
     	
     	//getbyte
     	String s = "ABCDEFGH";
     	  byte b1[] = s.getBytes();
     	  for(int i=0; i<b1.length;i++){
     	  System.out.println(b1[i]);
     	  
     	  
     	  //substring
     	  String s10 ="programing";
     	  System.out.println(s10.substring(3));
     	  System.out.println(s10.substring(3,9));
     	  
     	
     	  
     	
     	  //start with end with
     	  String s13 = "india is good country";
     	  System.out.println(s13.startsWith("en"));
     	  System.out.println(s13.endsWith("try"));
     	  
     	  
     	  //replace
     	  String s11 = "Java is programing language";
     	  System.out.println(s11.replace('a', 'o'));
     	  
     	
     	  
     	  String s14 = " java was programming language";
     	  System.out.println(s14.replace("was", "is"));
     	  
     	  
     	  //Trim
     	 String s12 = "hello java  ";
    	  System.out.println(s12 +"programming");
    	  System.out.println(s12.trim()+"programming");
    	  
    	  
    	  
     
     	  }
         
    }
}