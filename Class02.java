
class CTest extends Thread
{
	private String id;
	public CTest(String str)      // �غc���A�]�w����id
	 {
	     id=str;
	 }
	public void run()          // ��gThread���O�̪�run() method
	 {
	    for(int i=1;i<=5;i++)
	    {
	       for(int j=0;j<100000000;j++); // �Űj��A�Ψө�C14����檺�t��
	       System.out.println(id+" "+i);
	    }
	 }
}
public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      CTest hi=new CTest("Hello");
	      CTest bye=new CTest("Good bye");
	      hi.run();
	      bye.run();
	}

}
