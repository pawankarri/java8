package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lambda3 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(25);
	a.add(95);
	a.add(8412);
	a.add(01);
	a.add(95);
	a.add(1998);
	System.out.println(a);
	Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
	Collections.sort(a,c);
	System.out.println(a);
}
}
