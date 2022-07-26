package phase1.mphasis;

public class Modifier 
{
	
		  private int a=62;
		  long l=386;
		  protected float fl=98.8f;
		  
		  public void methodpublic() 
		    {
		    	System.out.println("This is the public method classModifier");
		    	methodprivate();
		    }
		    
		    
			protected void methodprotect() 
			{
				System.out.println("This is protected method classModifier:"+fl);
				methodprivate();
			}
			
			
			private void methodprivate() 
			{
				System.out.println("This is private method classModifier:"+a);
				
			}
			
			
			void method_default() 
			{
				System.out.println("This is method default classModifier:"+l);
				methodprivate();
			}

		}


