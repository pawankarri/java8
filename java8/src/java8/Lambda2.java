package java8;
interface Add
{
	void add(int a,int b);
}
public class Lambda2 {
public static void main(String[] args) {
Add c=(a,b)->System.out.println(a+b);
c.add(10,20);
}
}
