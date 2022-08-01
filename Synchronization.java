package practiceproject.phase1;

import java.io.*;

	class Track
	{
		synchronized public void getLine()                     
		{
			
			for (int i = 0; i < 3; i++)
			{
				System.out.println(Thread.currentThread().getName()+ " : "+i);
				try
				{
					Thread.sleep(400);   
				}
				catch (Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}

	class Train extends Thread
	{
		// reference to Line's Object.
		Track line;

		Train(Track line)
		{
			this.line = line;
		}

		//@Override
		public void run()
		{
			line.getLine();
		}
	}

	public class Synchronization{
		public static void main(String[] args)
		{
			// Object of Line class that is shared among the threads.
			Track obj = new Track();

			// creating the threads that are sharing the same Object.
			Train train1 = new Train(obj);
			Train train2 = new Train(obj);
			
			train1.setName("Train 1");
			train2.setName("Train 2");

			// threads start their execution.
			train2.start();
			train1.start();
		}
	}


