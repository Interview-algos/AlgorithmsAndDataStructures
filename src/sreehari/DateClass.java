//package sreehari;
//
//
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//
//public class DateClass {
//
//	public static void main(String[] args) {
//		
//		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		try {
//			//long diff = MintDateUtil.getDateDiff(DateUtils.addDays(formatter.parse("2017-05-03 16:45:45"), 30), new Date(), MintDateUtil.DAY) + 1;
//			Calendar calendar = Calendar.getInstance();
//			
//			String diff = MintDateUtil.formatDate(formatter.parse("2017-05-03 16:45:45"), MintDateFormatEnum.MMMM_SPACE_DD);
//			int diff1 = formatter.parse("2017-05-03 16:45:45").getYear() + 1900;
//			System.out.println("Sree:"+ diff +"," + diff1);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
///*
//		Float amount= (float) 48.0000;
//		Float amountOver = amount/100;
//		Float nationalAverage = (float) 560;
//		Float userAverage = nationalAverage + (nationalAverage*amountOver);
//		
//		System.out.println("user Avg:" + userAverage);*/
//	}
//}
