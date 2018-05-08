package project.java;

import java.time.*;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class CalculateTime {
	private static long timeUse ;
	
	
	public static long getTimeUse() {
		return timeUse;
	}


	public static void setTimeUse(long timeUse) {
		CalculateTime.timeUse = timeUse;
	}


	public static void gettimecal () {
		LocalDateTime t1 = Time.check_in;
		LocalDateTime t2= Time.check_out;
		
		
		if(Time.check_in!=null ||Time.check_out!=null) {
			//t1= LocalDateTime.of(2018, 5, 6, 12, 30);
			//t2= LocalDateTime.of(2590, 5, 6, 13, 30);
			timeUse = t1.until(t2,ChronoUnit.MINUTES);
		}
		else {
			JOptionPane.showMessageDialog(null, "Don't have time check in and time check out.!!");
		}
		
		Time.check_in=null;
		Time.check_out =null;
		
		System.out.println(timeUse);
	}
}
