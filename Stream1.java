package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Stream1 {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add("pawan");
	l.add("harish");
	l.add("nikhil");
	l.add("gopal");
	l.add("imran");
	l.add("mahesh");
	System.out.println(l);
	Object l2=l.stream().filter(s->((String) s).length()>=6).collect(Collectors.toList());
	System.out.println(l2);
}
}
