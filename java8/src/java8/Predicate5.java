package java8;

import java.util.function.Predicate;

public class Predicate5 {
public static void main(String[] args) {
	int[] x= {0,5,10,15,20,25,30};
	Predicate<Integer> p1=p->p%2==0;
	Predicate<Integer> p2=p->p>20;
	for(Integer x1:x)
	{
		if(p1.negate().test(x1))
		{
			System.out.println(x1);
		}
	}
}
}
