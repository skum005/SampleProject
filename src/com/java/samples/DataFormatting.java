package com.java.samples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatting {
	public static void main(String[] args) throws ParseException {
		System.out.println(dateFormat("MMM", "01-05-2015"));
		System.out.println(dateFormat("dd", "01-05-2015"));
		System.out.println(dateFormat("yyyy", "01-05-2015"));
	}

	public static String dateFormat(String requiredValue, String date)
			throws ParseException {
		String value = "";
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		Date dateObject = dateFormatter.parse(date);
		value = new SimpleDateFormat(requiredValue).format(dateObject);
		return value;
	}
}
