package practiceproject.phase1;
	public class Runnableprgram implements Runnable {
		public void run(){  
			System.out.println("This is thread block");  
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
			System.out.println(e.getMessage());	
			}  
			}
			  
			public static void main(String args[])
			{  
			Runnableprgram m1=new Runnableprgram(); 
			Thread t1 = new Thread(m1);       
			t1.start();                                     
		 }  

}
