
package practiceproject.phase1;

public class ExceptionHandlingExample 
{
	

public static void main(String[] args) {
	   int n1 = 30;
	   int n2= 0;
	   int res;
	
	try
	{
		res = n1/n2;
		
		System.out.println("result is :"+ res);
	}
	catch(NullPointerException ae)
	{
		System.out.println("Numbers cannot be dividde by zero");
		System.out.println(ae.getMessage());
		
		
	}
	catch(Exception ae1)
	{
		System.out.println("I am before the subclass exception");
		
	}
	finally
	{
		res = n1+n2;
		System.out.println("result  after additionis :"+ res);
		System.out.println("tis block will always be executed");
	}

	}
}
