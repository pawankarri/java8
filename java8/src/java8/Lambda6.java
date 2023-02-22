package java8;
interface Square
{
	public void squareIt(int n);
}
public class Lambda6 {
public static void main(String[] args) {
	Square s=n->System.out.println("square of given "+n+"  number is:"+n*n);
	s.squareIt(25);
}
}
