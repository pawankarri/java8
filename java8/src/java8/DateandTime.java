package java8;
import java.time.*;
public class DateandTime {
public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	System.out.println(date);
	int dd=date.getDayOfMonth();
	int mm=date.getMonthValue();
	int yy=date.getYear();
	System.out.printf("%d-%d-%d",dd,mm,yy);
	System.out.println();
	LocalTime time=LocalTime.now();
	System.out.println(time);
	int hour=time.getHour();
	int min=time.getMinute();
	int sec=time.getSecond();
	int nan=time.getNano();
	System.out.printf("%d-%d-%d-%d",hour,min,sec,nan);
	System.out.println();
	LocalDate birthday=LocalDate.of(1998,10,15);
	Period p=Period.between(birthday,date);
	System.out.println("my age is"+p.getYears()+"years and months"+p.getMonths()+"and days"+p.getDays());
	System.out.println();
	ZoneId zone=ZoneId.systemDefault();
	System.out.println(zone);
}
}
