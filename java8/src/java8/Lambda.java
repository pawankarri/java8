package java8;
interface Pawan
{
	void firstt();
	static void secondd()
	{
		System.out.println("namaste");
	}
	default void thirdd()
	{
		System.out.println("welcome");
	}
}
public class Lambda{
	public static void main(String[] args) {
		Pawan p=()->System.out.println("hi hello");
		p.firstt();
		Pawan.secondd();
		p.thirdd();
	}
}
