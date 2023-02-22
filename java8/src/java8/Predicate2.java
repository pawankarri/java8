package java8;

import java.util.function.Predicate;

public class Predicate2 {
public static void main(String[] args) {
	Predicate<Integer> p1=i->(i>18);
	Predicate<Integer> p2=i->(i<60);
	boolean b=p1.and(p2).test(45);
	System.out.println(b);
}
}
