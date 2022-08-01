package practiceproject.phase1;
import java.util.regex.*;

	public class Regularexpression 
	{
		public static void main(String args[])
		{   
			Pattern p = Pattern.compile(".s");//. represents single character  
			Matcher m = p.matcher("as");  
			boolean b = m.matches();   
			boolean b2=Pattern.compile(".s").matcher("as").matches();  
			  
			//3rd way  
			boolean b3 = Pattern.matches(".s", "as");  
			  
			System.out.println(b+" "+b2+" "+b3);  
		}
	}

	

