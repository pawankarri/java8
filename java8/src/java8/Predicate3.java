package java8;

import java.util.function.Predicate;

public class Predicate3 {
public static void main(String[] args) {
	String[] s= {"pawan","veerababu","harish","nani","cat"};
	Predicate<String> p=s1->s1.length()>=5;
	for(String s1:s)
	{
		if(p.test(s1))
		{
		System.out.println(s1);
	}
}
}
}
