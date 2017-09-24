package sreehari;



public class TimeCheck {

	private static final int DEFAULT_TIME_DELTA = 60;

	public static void main(String[] args) {
		int timeDelta=60;
		String startTime = "00:00";
		String endTime;

		for (int interval=0; interval < (24*DEFAULT_TIME_DELTA)/timeDelta; ++interval) {
			endTime = minutesToTime(startTime, timeDelta);
			System.out.println("startTime="+startTime+" and endTime="+endTime);
			
			if(Integer.parseInt(endTime.substring(0, 2)) < 9) {
				startTime = "0" + Integer.toString(Integer.parseInt(endTime.substring(0, 2)) + 1) + ":00";
			} else {
				startTime = Integer.toString(Integer.parseInt(endTime.substring(0, 2)) + 1) + ":00";
			}

		}
		
		
	}
	
	public static String minutesToTime(String startTime, int minutes) {
		if (minutes <= 0) {
			return  "00:00";
		}
		int hour = (minutes -1 ) / 60 + Integer.parseInt(startTime.substring(0,2));
		int minute = (minutes-1) % 60 + Integer.parseInt(startTime.substring(3,5)) ;
		StringBuilder timeSb = new StringBuilder();
		if (hour < 10) {
			timeSb.append("0");
		}
		timeSb.append(hour);
		timeSb.append(":");
		if (minute < 10) {
			timeSb.append("0");
		}
		timeSb.append(minute);
		return timeSb.toString();
	}
}
