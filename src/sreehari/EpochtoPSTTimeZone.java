package sreehari;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class EpochtoPSTTimeZone {

	public static void main(String[] args) {
		 Date date = new Date(1475779721000L);
	        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	        format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
	        String formatted = format.format(date);
	        System.out.println(formatted);
	}
}
