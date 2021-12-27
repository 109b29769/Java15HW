
class CTest3 extends Thread
{
	private String id;
	public CTest3(String str)      // 建構元，設定成員id
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
public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      CTest3 hi=new CTest3("Hello");
	      CTest3 bye=new CTest3("Good bye");
	      CTest3 morning=new CTest3("Good morning");
	      CTest3 night=new CTest3("Good night");
	      hi.start();
	      bye.start();
	      morning.start();
	      night.start();
	}

}
