package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(5);
	a.add(15);
	a.add(20);
	a.add(25);
	System.out.println(a);
	Integer min=(Integer) a.stream().min((i1,i2)->((Integer) i1).compareTo((Integer) i2)).get();
	Integer max=(Integer) a.stream().max((i1,i2)->((Integer) i1).compareTo((Integer) i2)).get();
	System.out.println(min);
	System.out.println(max);
}
}
