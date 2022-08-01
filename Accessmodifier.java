package practiceproject.phase1;

 class Accessmodifier 
{

		 private int y= 10;
		 long k =1000;
		 public void methodPublic()
		 {
			 methodPrivate();
		 }
	     protected void methodProtected()
	     {
	    	 methodPrivate();
	    	 
	     }
	     void methodDefault()
	     {
	    	 methodPrivate();
	     }
	     
	     
		private void methodPrivate() {
			
			System.out.println("Class  Accessmodifier: methodPrivate");
			System.out.println("Value of private value y " + y);
			System.out.println("Value of long"+k);
			
		}


}
