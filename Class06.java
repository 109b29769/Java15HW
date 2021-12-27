class Add implements Runnable
{
	private int n;
	private int sum=0;
	public Add(int a)
	{
		n=a;
	}

public void run() 
{
	for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
	System.out.println("1+..+"+n+"="+sum);
}
}
public class Class06 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Add a1=new Add(5);
		Add a2=new Add(10);
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		t1.start();
		t2.start();
	}

}
