package com.java.samples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaSamples {
public static void main(String[] args) throws ParseException {
	/*String dateString = "10/11/1986";
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date date = formatter.parse(dateString);
	//Calendar cal = Calendar.getInstance();
	String month = new SimpleDateFormat("MMM").format(date);
	System.out.println(month);*/
	System.out.println(getMonth("18/01/1987"));
	
	
}

public static String getMonth(String actualDate) throws ParseException
{
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date date = formatter.parse(actualDate);
	String month = new SimpleDateFormat("MMM").format(date);
	return month;
}

}
