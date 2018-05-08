package project.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class Time {
	
	

	static LocalDateTime today=null ;
	
	
	static LocalDateTime check_in;
	static LocalDateTime check_out;
	
	
	static String putdate;
	
	static int chooseTime;
	

	static public void timeNow(){
		if(chooseTime==1) {
			today = LocalDateTime.now();
			
			System.out.println(today);
		}
		else if(chooseTime==2)
		{
		
			String split[]= putdate.split(" ");
			String[] date = split[0].split("/");
			String []time = split[1].split(":");
			int year,moonth,day,hour,minute;
			
			year = Integer.parseInt(date[2]);
			moonth = Integer.parseInt(date[1]);
			day= Integer.parseInt(date[0]);
			hour = Integer.parseInt(time[0]);
			minute=Integer.parseInt(time[1]);			
			today = LocalDateTime.of(year,moonth,day,hour,minute);
		}
		
		 
	 }
	
	
	
	
	
	
}
