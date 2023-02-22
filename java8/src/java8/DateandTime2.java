package java8;
import java.time.*;
import java.util.Scanner;
public class DateandTime2 {
public static void main(String[] args) {
	ZoneId id=ZoneId.of("Asia/Calcutta");
	System.out.println(id);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	int n=sc.nextInt();
	Year nn=Year.of(n);
	if(nn.isLeap())
	{
		System.out.println("it is leap year");
	}
	else
	{
		System.out.println("not a leap year");
	}
}
}
