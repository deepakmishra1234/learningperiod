package practiceproject.phase1;

 class Demo
{
		void show() 
		{ 
		      System.out.println("i am in show method of super class"); 
	    } 
} 
		
	public class Innerclass 
	{ 	  
		    
		   static Demo de = new Demo()
		   { 
		       void show() 
		       { 
		           super.show(); 
		           System.out.println("i am in Flavor1Demo class"); 
		       } 
		   };
		   
		   public static void main(String[] args)
		   { 
		       de.show(); 
		   } 
	}


