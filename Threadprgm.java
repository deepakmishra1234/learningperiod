package practiceproject.phase1;


	public class Threadprgm extends Thread {

		public void run() {
		  	System.out.println("This is thread block");
		}
		
		public static void main(String[] args) {
			Threadprgm te= new Threadprgm();
			te.start();

		}

}
