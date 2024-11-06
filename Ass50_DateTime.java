package assignment;

import java.util.Date;

public class Ass50_DateTime {

	public static void main(String[] args) {
		Date d1=new Date();
	long l=d1.getTime();
	System.out.println(l);
	Date d2=new Date(d1.getTime()-(1000*60*60*24*4));
	System.out.println(d2);
	String d3=d2.toString();
	String month=d3.substring(4, 7);
	String year=d3.substring(d3.length()-4);
	String date=d3.substring(8,10);
	
	System.out.println(month);
	System.out.println(year);
	System.out.println(date);
		
	String dateformat=date.concat("-").concat(month).concat("-").concat(year);
	System.out.println(dateformat);
	

	String dateformat1=date.concat("/").concat(month).concat("/").concat(year);
	System.out.println(dateformat1);
	
	}

}
