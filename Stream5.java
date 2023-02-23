package java8;

import java.util.ArrayList;

public class Stream5 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(542);
	a.add(41);
	a.add(30);
	Integer[] i=(Integer[]) a.stream().toArray(Integer[]::new);
	for(Integer i1:i)
	{
	System.out.println(i1);
	}
}
}
