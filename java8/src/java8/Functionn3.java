package java8;

import java.util.ArrayList;
import java.util.function.Function;

public class Functionn3 {
String name;
int marks;
Functionn3(String name,int marks)
{
	this.name=name;
	this.marks=marks;
}
public static void main(String[] args) {
	Function<Functionn3,String> f=s->{
		int marks=s.marks;
		String grade="";
		if(marks>=80&&marks<=100) grade="A";
		else if(marks>=70&&marks<=79) grade="B";
		else if(marks>=60&&marks<=69) grade="C";
		else if(marks>=50&&marks<=59) grade="D";
		else if(marks<=35&&marks<=49) grade="F";
		return grade;
		};
		ArrayList<Functionn3> a=new ArrayList();
		a.add(new Functionn3("pawan",80));
		a.add(new Functionn3("imran",65));
		a.add(new Functionn3("gopal",80));
		a.add(new Functionn3("harish",30));
		a.add(new Functionn3("veerababu",55));
		for(Functionn3 ff:a)
		{
			System.out.println(ff.name+" "+ff.marks+" "+f.apply(ff));
		}
		
}
}
