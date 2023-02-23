package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sttream2 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(12);
	a.add(10);
	a.add(23);
	a.add(8);
	a.add(5);
	System.out.println(a);
	long no=a.stream().filter(i->((int)i)>=10).count();
	List<Integer> sortedd=(List<Integer>) a.stream().sorted().collect(Collectors.toList());
	System.out.println(no);
	System.out.println(sortedd);
	
}
}
