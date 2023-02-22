package java8;

import java.util.ArrayList;

public class Lambda5 {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList();
	a.add(75);
	a.add(92);
	a.add(125);
	a.add(60);
	a.add(72);
	System.out.println(a);
	a.forEach(n->{if(n%2==0)System.out.println(n);});
}
}
