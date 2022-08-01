package practiceproject.phase1;

public class Methodcalling {
	public int add(int a ,int b)
	{
		int c = a+b;
		return c;
		
	}

	public int AreaofCircle(int r)
	{
		int ar = (int)3.14*r*r;
		return ar;
		
	}
	public int AreaofRectangle( int l,int b)
	{
		int area =l*b;
		return area;
		
	}
	public int AreaofSquare(int a )
	{
		int area = a*a;
		return area;
	}

		public static void main(String[] args) 
		{
		  Methodcalling cal= new Methodcalling();
		 
		  	System.out.println("addition of two numbers is:"+cal.add(8,8)); 
		  	System.out.println(cal.AreaofCircle(8));
		  	System.out.println(cal.AreaofRectangle(9, 7));
		  	System.out.println(cal.AreaofSquare(5));

		}
}
