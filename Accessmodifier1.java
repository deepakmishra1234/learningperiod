package practiceproject.phase1;

import practiceproject.phase1.Accessmodifier;

public class Accessmodifier1 
{

	public static void main(String[] args)
	{
		
	
	new Accessmodifier().methodPublic();
	new Accessmodifier().methodProtected();
	new Accessmodifier().methodDefault();
	System.out.println("Value of long"+ new Accessmodifier().k);
	}
	public void methodPublic()
	{
		System.out.println("Class Accessmodifier : methodpublic");
		
	}
	protected void methodProtected()
	{
		System.out.println("Class Accessmodifier: methodProtected");
		
	}
	void methodDefault()
	{
		System.out.println("Class Accessmodifier: methoddefault");
		
	}
	private void methodPrivate()
	{
		System.out.println("Class Accessmodifier: methodPrivate");
	}
	

}
