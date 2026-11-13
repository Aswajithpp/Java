package Oops;



public class StudentDetails {

	
	//variable
	
	private String emailid;
	private String password;
	
	
	//method 
	 
//	public void setemailid(String emailid) {
//		this.emailid = emailid;
//		
//	}
//	
//	public void setpassword(String password) {
//		this.password = password;
//		
//		
//	}
	
	public void setvariable(String emailid, String password) {
		this.emailid = emailid;
		this.password = password;
		
		
	}
	
	public String getemilid() {
		return emailid;
	}
	public String getpassword() {
		return password;
	}
	
}



