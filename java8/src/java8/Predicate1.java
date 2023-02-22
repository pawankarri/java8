package java8;
import java.util.function.*;
public class Predicate1 {
public static void main(String[] args) {
	Predicate<Integer> p=i->i%2==0;
	boolean b=p.test(10);
	System.out.println(b);
}
}
