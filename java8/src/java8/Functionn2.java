package java8;

import java.util.function.Function;

public class Functionn2 {
public static void main(String[] args) {
	Function<String,Integer> f=s->s.length();
	System.out.println(f.apply("pawan"));
}
}
