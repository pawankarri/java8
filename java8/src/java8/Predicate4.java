package java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate4 {
String name;
int salary;
Predicate4(String name,int salary)
{
	this.name=name;
    this.salary=salary;
}
public static void main(String[] args) {
	ArrayList<Predicate4> a=new ArrayList<Predicate4>();
	a.add(new Predicate4("pawan",1000));
	a.add(new Predicate4("imran",2000));
	a.add(new Predicate4("gopal",3000));
	a.add(new Predicate4("harish",4000));
	Predicate<Predicate4> p=e->e.salary>2000;
	for(Predicate4 p2:a)
	{
		if(p.test(p2))
		{
			System.out.println(p2.name+" "+p2.salary);
		}
	}
}
}
