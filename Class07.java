
class CTest5 implements Runnable
{
	private String id;
	public CTest5(String str)      // 建構元，設定成員id
	 {
	     id=str;
	 }
	public void run()          // 改寫Thread類別裡的run() method
	 {
	    for(int i=1;i<=5;i++)
	    {
	       for(int j=0;j<100000000;j++); // 空迴圈，用來拖慢14行執行的速度
	       System.out.println(id+" "+i);
	    }
	 }
}
public class Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      CTest5 hi=new CTest5("Hello");
	      CTest5 bye=new CTest5("Good bye");
	      CTest5 morning=new CTest5("Good morning");
	      Thread t1=new Thread(hi);
	      Thread t2=new Thread(bye);
	      Thread t3=new Thread(morning);
	      t1.start();
	      t2.start();
	      t3.start();
	}

}
