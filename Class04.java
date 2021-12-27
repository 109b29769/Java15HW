
class CTest2 extends Thread
{
	private String id;
	public CTest2(String str)      // 建構元，設定成員id
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
public class Class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      CTest2 hi=new CTest2("Hello");
	      CTest2 bye=new CTest2("Good bye");
	      CTest2 morning=new CTest2("Good morning");
	      hi.start();
	      bye.start();
	      morning.start();
	}

}
