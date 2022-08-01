package practiceproject.phase1;
	import java.io.*;
	import java.util.Scanner;
	public class Throwsproblem
	{
		
		static int display(int l,int b) throws IOException
		{
				if(l>b)
				{
					throw new ArithmeticException("The value of l is Bigger");
				}
				else 
				{
					System.out.println("Both value are correct!");
				}
				return l*b;
			}
	  void area_fun(int l,int b)
	  {
		  int result=0;
		  try
		  {
			  result=display(l,b);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
		  finally
		  {
		  System.out.println(result);
		  }
		  
	  }
		public static void main(String[] args) {
			Throwsproblem prb=new Throwsproblem();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first value:");
			int m=sc.nextInt();
			System.out.println("Enter second value:");
			int n=sc.nextInt();
			
			prb.area_fun(m,n);
			 
		}


}
