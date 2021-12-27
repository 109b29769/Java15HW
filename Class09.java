class CTest6 extends Thread implements Runnable
{

	private String id;
	private int second;
	public CTest6(String str,int s)
	{
		id=str;
		second=s;
	}
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				 sleep(second);
			}
			catch(InterruptedException e) 
			{
				
			}
			System.out.println(id+" is running..");
			
		}
	}


	
}
public class Class09 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CTest6 cone=new CTest6("Thread 1 is running",1000);
		CTest6 ctwo=new CTest6("Thread 2 is running",2500);
		Thread t1=new Thread(cone);
		Thread t2=new Thread(ctwo);
		t1.start();
		t2.start();
	}

}
