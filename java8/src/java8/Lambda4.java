package java8;

public class Lambda4 {
	public static void main(String[] args) {
Runnable r=()->
{
	for(int i=0;i<10;i++)
	{
		System.out.println("child");
	}
};
Thread t=new Thread(r);
t.start();
for(int i=0;i<10;i++)
{
	System.out.println("main");
}
	}

}
