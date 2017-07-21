package task6;

class sync
{
	int count;
	public   void increment()
	{
	count++;	
	}
}

public class Counter1 extends sync
{
	
	public static void main(String[] args) throws Exception
	{
		Counter1 c = new Counter1();
		
	Thread t1 = new Thread(new Runnable()
			{
		public void run()
		{
			for(int i=1; i<=200; i++)
			{
				c.increment();
			}
		}
			}
	);
			
		Thread t2 = new Thread(new Runnable()
			{
			public void run()
		{
			for(int i=1; i<=200; i++)
			{
				c.increment();
			
		}
			
		}
			}
			);
	
		    t1.start();
			t1.join();
			t2.start();
		 	t2.join();
			
			System.out.println("count" + c.count);	
	}

	
}

