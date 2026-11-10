package com.oopslearning.www;
//password creation.
public class Encapsulation {
     private String username;
      private int accountno;
      private  int bankblance;
      private String mothername;
      
      private String bankname;
      
      public String getBankname() {
		return bankname;
	}


	  public void setBankname(String bankname) {
		  this.bankname = bankname;
	  }
	  private int password ;
	  public Encapsulation(String username, int password) {
		super();
		this.username = username;
		this.password = password;
	  }
	  
	  
	  public void getAccountno(int password) {
		  if(password==this.password) {
			  System.out.println(this.accountno);
		  }
		  else System.out.println("Wrong password");
	  }
	  public void setAccountno(int accountno , int password ) {
		  if(password==this.password) {
			  this.accountno = accountno;
		  }
		  else System.out.println("Wrong password");
	  }
	  
	  
	  public void getBankblance(int password) {
		  if(password==this.password) {
			  System.out.println(this.bankblance);
		  }
		  else System.out.println("Wrong password");
	  }
	  public void setBankblance(int bankblance , int password) {
		  if(password==this.password) {
			  this.bankblance = bankblance;
		  }
		  else System.out.println("Wrong password");
	  }
	  
	  
	  
	  public void getMothername(int password) {
		  if(password==this.password) {
			 System.out.println(this.mothername);
		  }
		  else System.out.println("Wrong password");
	  }
	  public void setMothername(String mothername ,int  password)  {
		 
		  if(password==this.password) {
			  this.mothername = mothername;
		  }
		  else System.out.println("worng password");  
	  }
	  
	  
	  
}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  



	  
	  
	
      
       
      
   
