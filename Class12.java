
class CTest8 implements Runnable
{
	private String id;
	public CTest8(String str)      // 建構元，設定成員id
	 {
	     id=str;
	 }
	public void run()          // 改寫Thread類別裡的run() method
	 {
	    for(int i=1;i<=5;i++)
	    {
			try
			{
				Thread.sleep((int)(10*Math.random()));
			}
			catch(InterruptedException e)
			{
				
			}
	       System.out.println(id+" "+i);
	    }
	 }
}
public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      CTest8 hi=new CTest8("Hello");
	      CTest8 bye=new CTest8("Good bye");
	      CTest8 morning=new CTest8("Good morning");
	      CTest8 night=new CTest8("Good night");
	      Thread t1=new Thread(hi);
	      Thread t2=new Thread(bye);
	      Thread t3=new Thread(morning);
	      Thread t4=new Thread(night);
	      t1.start();
	      try
	      {
	    	  t1.join();
	    	  t3.start();
	    	  t3.join();
	    	  t4.start();
	    	  t4.join();
	    	  t2.start();
	    	  t2.join();

	      }
	      catch(InterruptedException e)
	      {
	    	  
	      }
	      System.out.println("All Threads are finished");
	}	

}
