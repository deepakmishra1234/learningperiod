package phase1.mphasis;

public class Mensuration
{

	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int Area_of_circle(int rad)
	{
		int cir= (int)3.14*rad*rad;
		return cir;
	}
	
	public int Area_of_Rectangle(int len,int bdth) {
		int rec=len*bdth;
		return rec;
	}
	
	public int Area_of_square(int side) 
	{
		int squ= side*side;
		return squ;
	}

		public static void main(String[] args)
		{
			Mensuration men=new Mensuration();
			
			int z=men.add(20,34);
			
	        System.out.println("sum of two number is:"+z);
			System.out.println("area of circle is:"+men.Area_of_circle(z));
			System.out.println("area of rectangle is:"+men.Area_of_Rectangle(8,5));
			System.out.println("area of square is:"+men.Area_of_square(z));
		}

	}
	
