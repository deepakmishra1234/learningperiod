package phase1.mphasis;

public class Method 
{
	public int rectangle(int len,int bdth) 
	{
		int result=len*bdth;
		return result ;
	}
	
	public static void main(String[] args) 
	
	{
       Method rec=  new Method();
       int r = rec.rectangle(6,8);
       System.out.println("area of rectangle is" +r);
       

	}

}
