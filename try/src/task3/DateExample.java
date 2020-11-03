package task3;
import java.text.*;
import java.util.*;
public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date obj=new Date();
		DateFormat theDate=DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat germanDate=DateFormat.getDateInstance(DateFormat.LONG,Locale.GERMANY);
		DateFormat frenchDate=DateFormat.getDateInstance(DateFormat.LONG,Locale.JAPAN);
		System.out.println(theDate.format(obj));
		System.out.println(germanDate.format(obj));
		System.out.println(frenchDate.format(obj));

	}

}
