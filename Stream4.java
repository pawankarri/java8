package java8;

import java.util.ArrayList;

public class Stream4 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(12);
	a.add(51);
	a.add(10);
	a.add(25);
	a.add(75);
	System.out.println(a);
	a.stream().forEach(System.out::println);
}
}
