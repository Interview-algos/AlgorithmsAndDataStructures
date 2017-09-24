//package sreehari;
//
//import java.math.BigDecimal;
//import java.time.format.DateTimeFormatter;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//
//import javax.xml.datatype.DatatypeConfigurationException;
//import javax.xml.datatype.DatatypeFactory;
//import javax.xml.datatype.XMLGregorianCalendar;
//
//import org.apache.commons.lang.time.DateUtils;
//import org.joda.time.DateTime;
//import org.joda.time.format.DateTimeFormat;
//
///**
// * Utility class for date functions
// *
// * @author Matt Snider
// * @date November 3, 2006
// */
//public class MintDateUtil {
//	public static final int YEAR = Calendar.YEAR;
//	public static final int MONTH = Calendar.MONTH;
//	public static final int WEEK = Calendar.WEEK_OF_YEAR;
//	public static final int DAY = Calendar.DATE;
//	public static final int HOUR = Calendar.HOUR;
//	public static final int MINUTE = Calendar.MINUTE;
//	public static final int SECOND = Calendar.SECOND;
//	public static final int MILLISECOND = Calendar.MILLISECOND;
//	public static final int DAYS_PER_YEAR = 365;
//
//	public static final int SECOND_IN_MILLIS = 1000;
//	public static final int MINUTE_IN_MILLIS = SECOND_IN_MILLIS * 60;
//	public static final int HOUR_IN_MILLIS = MINUTE_IN_MILLIS * 60;
//	public static final long DAY_IN_MILLIS = HOUR_IN_MILLIS * 24;
//	public static final long WEEK_IN_MILLIS = DAY_IN_MILLIS * 7;
//
//	public static final boolean SHOW_TIME = true;
//
//	// DatatypeFactory creates new javax.xml.datatype Objects that map XML
//	// to/from Java Objects.
//	private static DatatypeFactory df = null;
//
//	static {
//		try {
//			df = DatatypeFactory.newInstance();
//		} catch(DatatypeConfigurationException e) {
//			throw new IllegalStateException(
//				"Error while trying to obtain a new instance of DatatypeFactory", e);
//		}
//	}
//
//	public static String convertDateToyyyyMMdd(Date date) {
//		return formatDate(date, MintDateFormatEnum.YYYY_DASH_MM_DASH_DD);
//	}
//
//	/**
//	 * Returns a date string in the given format.
//	 *
//	 * @param date
//	 * @return
//	 */
//	public static String convertDateToEEEMMMd(Date date) {
//		return formatDate(date, MintDateFormatEnum.EEE_SPACE_MMM_SPACE_D);
//	}
//
//	public static String convertDateToMMDDYYY(Date date) {
//		return formatDate(date, MintDateFormatEnum.MM_SLASH_DD_SLASH_YYYY);
//	}
//
//	/**
//	 * Returns a date string in the given format.
//	 *
//	 * @param date
//	 * @return
//	 */
//	public static String convertDateToMMdd(Date date) {
//		return formatDate(date, MintDateFormatEnum.MM_SLASH_DD);
//	}
//
//	/**
//	 * Returns a date string in the given format.
//	 *
//	 * @param date
//	 * @return
//	 */
//	public static String convertDateToMMddyy(Date date) {
//		return date == null ? "" : getDateAsString(date);
//	}
//
//	public static String convertDateToEEEEMMMMdyyyy(Date date) {
//		DateTimeFormatter formatter = DateTimeFormat.forPattern("EEEE, MMMM d, yyyy");
//		return formatter.print(new DateTime(date));
//	}
//
//	/**
//	 * Converts the provided date to a string, using the thread-safe MintDateFormatEnum.
//	 *
//	 * @param date   {Date} Required. A date.
//	 * @param format {MintDateFormatEnum} Required. A thread-safe date formatter.
//	 * @return {String} The date as the desired string.
//	 */
//	public static String formatDate(Date date, MintDateFormatEnum format) {
//		return (null == date || null == format) ? "" : format.getDateFormat().print(new DateTime(date));
//	}
//
//	public static boolean isWeekday(Date date) {
//		Calendar calendar = convertDateToCalendar(date);
//		return calendar != null && !(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
//									 || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);
//	}
//
//	/**
//	 * Calls the DateDiff function with the default month type
//	 *
//	 * @param a start date, should be after b or will return negative
//	 * @param b end date, should be before a or will return negative
//	 * @return long
//	 */
//	public static long getDateDiff(Date a, Date b) {
//		return getDateDiff(a, b, MONTH);
//	}
//
//	/**
//	 * Retrieves the difference between time a & b, by subtracting the millis of b from a and converting that into
//	 * a calendar object. For years, months, and weeks we compare the dates. For the other values we
//	 * calculate the exact value by subtracting the milliseconds of each calendar and dividing by the timespan in milliseconds.
//	 *
//	 * @param a	Calendar start date, should be after b or will return negative
//	 * @param b	Calendar end date, should be before a or will return negative
//	 * @param type int constant value representing the time to iterate on
//	 * @return long
//	 */
//	public static long getDateDiff(Date a, Date b, int type) {
//		return getDateDiff(convertDateToCalendar(a), convertDateToCalendar(b), type);
//	}
//
//	/**
//	 * Get the difference between time a and b in month. Such as 4/23 and 6/8 is 1.5 months apart
//	 *
//	 * @param a Date a, should be after b or will return negative
//	 * @param b
//	 * @return double
//	 */
//	public static double getDateDiffInMonthWithFraction(Date a, Date b) {
//		double n = MintDateUtil.getDateDiff(a, b, Calendar.MONTH);
//		Date x = DateUtils.addMonths(b, (int) n);
//		Date y = DateUtils.addMonths(x, 1);
//		n += (double) (a.getTime() - x.getTime()) / (double) (y.getTime() - x.getTime());
//		return n;
//	}
//
//	public static long getDateDiff(Calendar a, Calendar b, int type) {
//		long val;
//		double preround, diff;
//
//		//years are compared by year, months are compared by years and months.
//		if (type <= MONTH) {
//			diff = a.get(YEAR) - b.get(YEAR);
//		}
//		/*
//				 * Periods shorter than months can be calculated using milliseconds.
//				 * One complication that we need to address is how long a day or week is.  We could define a day as being the number of milliseconds in a day.
//				 * However, that doesn't take into account daylight savings.  For instance if you take the difference in milliseconds between the March 13, 2010
//				 * at noon and March 14, 2010 at noon, you'll get 23 hours worth of milliseconds.  If you're comparing by week or day, you probably want to take
//				 * daylight savings into account and count that as one day.  If you're comparing by hours or something less, 23 hours is probably the correct
//				 * answer and you do not want to correct based on daylight savings.
//				 */
//		else if (type <= DAY) {
//			diff = a.getTimeInMillis() - b.getTimeInMillis() + (a.get(Calendar.DST_OFFSET) - b.get(Calendar.DST_OFFSET));
//		}
//		else {
//			diff = a.getTimeInMillis() - b.getTimeInMillis();
//		}
//
//		switch (type) {
//			case YEAR: // year(s)
//				val = (long) diff;
//				// correct for months
//				if (a.get(MONTH) == b.get(MONTH)) {
//					// correct for days
//					if (a.get(DAY) < b.get(DAY)) {
//						val--;
//					}
//					// further corretion possible, deemed not necessary
//				}
//				else if (a.get(MONTH) < b.get(MONTH)) {
//					val--;
//				}
//				break;
//			case MONTH: // month(s)
//				val = (long) diff * 12 + a.get(MONTH) - b.get(MONTH);
//				// correct for days
//				if (a.get(DAY) < b.get(DAY)) {
//					val--;
//				}
//				break;
//			case WEEK: // week(s)
//				//val = (long) diff * 52 + calA.get(WEEK) - calB.get(WEEK);
//				preround = diff / WEEK_IN_MILLIS;
//				val = (long) Math.floor(preround);
//				break;
//			case DAY: // day(s)
//				preround = diff / DAY_IN_MILLIS;
//				val = (long) Math.floor(preround);
//				break;
//			case HOUR: // hour(s)
//				preround = diff / HOUR_IN_MILLIS;
//				val = (long) Math.floor(preround);
//				break;
//			case MINUTE: // minute(s)
//				preround = diff / MINUTE_IN_MILLIS;
//				val = (long) Math.floor(preround);
//				break;
//			case SECOND: // second(s)
//				preround = diff / SECOND_IN_MILLIS;
//				val = (long) Math.floor(preround);
//				break;
//			case MILLISECOND: // millisecond(s)
//				val = (long) diff;
//				break;
//			default:
//				throw new IllegalArgumentException("unknown time period " + type);
//		}
//		return val;
//	}
//
//	public static boolean isWeekday(Calendar date) {
//		return date != null && !(date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY);
//	}
//
//	/**
//	 * Calculates an appropriate time window then returns a string representation of that window; uses binary search logic by starting
//	 * at day length, which is in the middle of the range and probably the most common window ranage
//	 *
//	 * @param then {Calendar} the date before NOW to check
//	 * @return {String} a string representing the length of time with units between date and 'Now'
//	 */
//	public static String getTimeAgo(Date then) {
//		Date now = new Date();
//		return getTimeAgo(then, now);
//	}
//
//	protected static String getTimeAgo(Date then, Date now) {
//		long diff = getDateDiff(now, then, DAY);
//		String units = "day";
//
//		// has it been over a week
//		if (7 <= diff) {
//			diff = getDateDiff(now, then, MONTH);
//
//			// it has been over a year
//			if (12 <= diff) {
//				diff = getDateDiff(now, then, YEAR);
//				units = "year";
//			}
//			// it has been less than a month
//			else if (0 == diff) {
//				diff = getDateDiff(now, then, WEEK);
//				units = "week";
//			}
//			// at least a month and less than a year
//			else {
//				units = "month";
//			}
//		}
//		// has it been less than a day
//		else if (0 == diff) {
//			diff = getDateDiff(now, then, MINUTE);
//
//			// it has been an hour or longer
//			if (60 <= diff) {
//				diff = getDateDiff(now, then, HOUR);
//				units = "hour";
//			}
//			// it has been less than a minute
//			else if (0 == diff) {
//				diff = getDateDiff(now, then, SECOND);
//				units = "second";
//			}
//			// at least a minute and less than a hour
//			else {
//				units = "minute";
//			}
//		}
//
//		if (0 > diff) {
//			diff = 0;
//		}
//		return diff + " " + units + (1 == diff ? "" : "s");
//	}
//
//	/**
//	 * Creates a new date for the specified year, month and day.
//	 *
//	 * @param year  full year
//	 * @param month month using the constants in Calendar
//	 * @param day   day of the month
//	 * @return the corresponding date
//	 */
//	public static Date create(int year, int month, int day) {
//		Calendar calendar = Calendar.getInstance();  //$NON-NLS-L$ 
//		calendar.set(year, month, day, 0, 0, 0);
//		return calendar.getTime();
//	}
//
//	/**
//	 * Creates a new date for the specified month and day in the current year.
//	 *
//	 * @param month month using the constants in Calendar
//	 * @param day   day of the month
//	 * @return the corresponding date
//	 */
//	public static Date create(int month, int day) {
//		Calendar calendar = Calendar.getInstance();  //$NON-NLS-L$ 
//		calendar.set(calendar.get(Calendar.YEAR), month, day, 0, 0, 0);
//		return calendar.getTime();
//	}
//
//	/**
//	 * Returns true if two dates are equal.  If one is null, both must be null.
//	 */
//	public static boolean equals(Date a, Date b) {
//		if (a == null) {
//			return b == null;
//		}
//		return a.equals(b);
//	}
//
//	/**
//	 * Returns true if the given date is within the past month (accounts for months of varying days)
//	 *
//	 * @param date {Calendar} the date to test if within the past month
//	 * @return {boolean} true, when date is in the past month
//	 */
//	public static boolean isPastMonth(Date date) {
//		Date oneMonthAgo = DateUtils.addMonths(new Date(), -1);
//		return date.equals(oneMonthAgo) || date.after(oneMonthAgo);
//	}
//
//	public static boolean isAfterDays(Date date, int numDays) {
//		Date nDaysFromNow = DateUtils.addDays(new Date(), numDays);
//		return date.after(nDaysFromNow);
//	}
//
//	public static Date roundDateDown(Date date, int timePeriod) {
//		return roundDate(convertDateToCalendar(date), timePeriod, true).getTime();
//	}
//
//	public static Date roundDateUp(Date date, int timePeriod) {
//		return roundDate(convertDateToCalendar(date), timePeriod, false).getTime();
//	}
//
//	public static Date wholeDayGMT(Date date, int daysOffset) {
//		long millis = date.getTime();
//		millis = millis - (millis % DAY_IN_MILLIS);
//		millis = millis + DAY_IN_MILLIS * daysOffset;
//		return new Date(millis);
//	}
//
//	/**
//	 * Round the date up or down to the nearest Calendar.TIME_PERIOD.
//	 * Presently only accepts YEAR, MONTH, and DAY_OF_MONTH.
//	 */
//	private static Calendar roundDate(Calendar date, int timePeriod, boolean roundDown) {
//		// If no date is given use the current time
//		if (date == null) {
//			date = GregorianCalendar.getInstance();  //$NON-NLS-L$ 
//		}
//
//		int year = date.get(Calendar.YEAR);
//		int month = date.get(Calendar.MONTH);
//		int dayOfMonth = date.get(Calendar.DAY_OF_MONTH);
//		Calendar rc = new GregorianCalendar(2000, 1, 1);
//
//		switch (timePeriod) {
//			case Calendar.DAY_OF_YEAR:
//				// always rounds down
//				rc.set(Calendar.HOUR_OF_DAY, 0);
//				rc.getTime();
//				rc.set(Calendar.MINUTE, 0);
//				rc.getTime();
//				rc.set(Calendar.SECOND, 0);
//				rc.getTime();
//				break;
//			case Calendar.MONTH:
//				if (!roundDown) {
//					month += 1;
//				}
//				dayOfMonth = 1;
//				break;
//			case Calendar.YEAR:
//				if (!roundDown) {
//					year += 1;
//				}
//				month = Calendar.JANUARY;
//				dayOfMonth = 1;
//				break;
//		}
//
//		rc.set(Calendar.YEAR, year);
//		rc.getTime();
//		rc.set(Calendar.MONTH, month);
//		rc.getTime();
//		rc.set(Calendar.DAY_OF_MONTH, dayOfMonth);
//		rc.getTime();
//
//		return rc;
//	}
//
//	public static Calendar setDate(int month, int day, int year) {
//		Calendar rc = GregorianCalendar.getInstance();  //$NON-NLS-L$ 
//		rc.set(year, month, day, 0, 0, 0);
//		rc.getTime();
//		return rc;
//	}
//
//	public static String getDateAsString(Date date) {
//		if (date != null) {
//			Calendar calendar = Calendar.getInstance();  //$NON-NLS-L$ 
//			calendar.setTime(date);
//			calendar.getTime();
//			return getDateAsString(calendar);
//		}
//		return "unknown";  //$NON-NLS-L$ 
//	}
//
//	public static String getDateAsString(Calendar date) {
//		if (date != null) {
//			int d = date.get(Calendar.DAY_OF_MONTH);
//			int m = date.get(Calendar.MONTH) + 1;
//			int y = date.get(Calendar.YEAR);
//			return (10 > m ? "0" + m : m) + "/" + (10 > d ? "0" + d : d) + "/" + y;
//		}
//		return "unknown";  //$NON-NLS-L$ 
//	}
//
//	public static String getDateAsString(Date date, DateTimeFormatter formatter) {
//		return date == null ? "" : formatter.print(new DateTime(date));
//	}
//
//	/**
//	 * Returns the number of days remaining in the month for current months. It counts the current day as 1, so on the last day of the month
//	 * it would return 1 day left.
//	 *
//	 * @return {Integer} The number of days until end of month.
//	 */
//	public static long getDaysRemainingInCurrentMonth() {
//		Calendar c = Calendar.getInstance();  //$NON-NLS-L$ 
//		Calendar lastDayOfMonth = getLastDayOfMonth(c);
//		return getDateDiff(lastDayOfMonth, c, DAY) + 2; // Guang for more info goto PHL-18229
//	}
//
//	public static Date getFirstDayOfMonth(Date date) {
//		return DateUtils.truncate(date, Calendar.MONTH);
//	}
//
//	public static Date getFirstDayOfTheNextMonth( Date date) {
//		Date d = DateUtils.add(date, Calendar.MONTH, 1);
//		return getFirstDayOfMonth(d);
//	}
//
//	public static Date getMondayOfWeek(Date date) {
//		Calendar c = Calendar.getInstance();  //$NON-NLS-L$ 
//		c.setTime(date);
//		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//		int offset = (dayOfWeek + 5) % 7;
//		c.add(Calendar.DAY_OF_MONTH, -offset);
//		return c.getTime();
//	}
//
//	public static Date getSundayOfWeek(Date date) {
//		Calendar c = Calendar.getInstance();  //$NON-NLS-L$ 
//		c.setTime(date);
//		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); // Sunday 1, Monday 2, ... Saturday 7
//		int offset = dayOfWeek - 1;
//		c.add(DAY, -offset);
//		return c.getTime();
//	}
//
//	/**
//	 * Returns a new calendar instance representing the last day of the month for the month of the passed calendar object.
//	 *
//	 * @param c {Calendar} Required. The reference date.
//	 * @return {Calendar} The last day of the month.
//	 */
//	public static Calendar getLastDayOfMonth(Calendar c) {
//		Calendar cal = DateUtils.truncate(c, Calendar.MONTH);
//		cal.add(Calendar.MONTH, 1);
//		cal.add(Calendar.DAY_OF_MONTH, -1);
//		return cal;
//	}
//
//	public static Date getLastDayOfMonth(Date date) {
//		return getLastDayOfMonth(convertDateToCalendar(date)).getTime();
//	}
//
//	public static Date getFirstDayOfCurrentMonth() {
//		return getFirstDayOfMonth(new Date());
//	}
//
//	public static Date getLastDayOfCurrentMonth() {
//		return getLastDayOfMonth(new Date());
//	}
//
//	/**
//	 * Utility function: parse the calendar from a string. Returns current time if the format is not parsable
//	 *
//	 * @param dateStr date string, may be in any format
//	 * @param df	  date format, describes format of dateStr
//	 * @return calendar obj
//	 */
//	public static Calendar parseCalendarFromString(String dateStr, DateTimeFormatter df) {
//		Calendar c = Calendar.getInstance();  //$NON-NLS-L$ 
//		c.setTime(parseDateFromString(dateStr, df));
//		return c;
//	}
//
//	/**
//	 * Utility function: parse the date from a string. Returns current time if the format is not parsable
//	 *
//	 * @param dateStr date string, may be in any format
//	 * @param df	  date format, describes format of dateStr
//	 * @return date obj
//	 */
//	public static Date parseDateFromString(String dateStr, DateTimeFormatter df) {
//		if (dateStr != null) {
//			try {
//				return df.parseDateTime(dateStr).toDate();
//			}
//			catch (IllegalArgumentException e) {
//				// Retain current time
//			}
//		}
//		return new Date();
//	}
//
//	public static Date parseDateFromString(String dateStr, MintDateFormatEnum df) {
//		if (df == null || dateStr == null) return  null;
//		return parseDateFromString(dateStr, df.getDateFormat());
//	}
//
//	public static boolean isDateEqual(Date lhs, Date rhs) {
//		return DateUtils.isSameDay(lhs, rhs);
//	}
//
//	/**
//	 * Returns true if the date of lhs Date object is after the date of rhs Date object.
//	 *
//	 * @param lhs {Date} the Date to test
//	 * @param rhs {Date} the Date to compare against
//	 * @return {boolean}, true when the date of lhs is after the date of rhs
//	 */
//	public static boolean isDateAfter(Date lhs, Date rhs) {
//		return lhs.after(rhs) && !DateUtils.isSameDay(lhs, rhs);
//	}
//
//	/**
//	 * Returns true if the date of lhs Calendar object is before the date of rhs Calendar object.
//	 *
//	 * @param lhs {Calendar} the Calendar to test
//	 * @param rhs {Calendar} the Calendar to compare against
//	 * @return {boolean}, true when the date of lhs is after the date of rhs
//	 */
//	public static boolean isDateBefore(Calendar lhs, Calendar rhs) {
//		return lhs.before(rhs) && !DateUtils.isSameDay(lhs, rhs);
//	}
//
//	public static boolean isDateBefore(Date lhs, Date rhs) {
//		return lhs.before(rhs) && !DateUtils.isSameDay(lhs, rhs);
//	}
//
//	/**
//	 * @return Is l before or equal to r ?
//	 */
//	public static boolean isDateBeforeOrEqual(Date l, Date r) {
//		return !isDateAfter(l, r);
//	}
//
//	/**
//	 * @return Is l after or equal to r ?
//	 */
//	public static boolean isDateAfterOrEqual(Date l, Date r) {
//		return !isDateBefore(l, r);
//	}
//
//	/**
//	 * @return Is d (as date, no time) from <= d <= to
//	 */
//	public static boolean isDateBetweenOrEqual(Date d, Date from, Date to) {
//		return !isDateBefore(d, from) && !isDateAfter(d, to);
//	}
//
//	/**
//	 * Returns true if the two Dates are from the same month.
//	 *
//	 * @param lhs date to compare
//	 * @param rhs date to compare
//	 * @return true if the two have the same month and year
//	 */
//	public static boolean isSameMonth(Date lhs, Date rhs) {
//		return DateUtils.truncate(lhs, Calendar.MONTH).equals(DateUtils.truncate(rhs, Calendar.MONTH));
//	}
//
//	/**
//	 * Returns true if the first date is in a earlier month than the second date.
//	 *
//	 * @param lhs date to compare
//	 * @param rhs date to compare
//	 * @return true if the two have the same month and year
//	 */
//	public static boolean isEarlierMonth(Date lhs, Date rhs) {
//		return DateUtils.truncate(lhs, Calendar.MONTH).compareTo(DateUtils.truncate(rhs, Calendar.MONTH)) < 0;  //$NON-NLS-L$ 
//	}
//
//	/**
//	 * Returns true if the two Calendars have the same year.
//	 *
//	 * @param lhs {Calendar} Required. The first calendar to compare.
//	 * @param rhs {Calendar} Required. The second calendar to compare.
//	 * @return {boolean} True if the two have the same month and year.
//	 */
//	public static boolean isSameYear(Date lhs, Date rhs) {
//		return DateUtils.truncate(lhs, Calendar.YEAR).equals(DateUtils.truncate(rhs, Calendar.YEAR));
//	}
//
//	public static Date getToday() {
//		return DateUtils.truncate(new Date(), Calendar.DATE);
//	}
//
//	public static boolean isPastNumDays(Date date, int numDaysAgo) {
//		Date numDaysAgoDate = DateUtils.addDays(new Date(), -numDaysAgo);
//		return MintDateUtil.getDateDiff(date, numDaysAgoDate) >= 0;
//	}
//
//	public static Date min(Date date1, Date date2) {
//		return date1.compareTo(date2) <= 0 ? date1 : date2;  //$NON-NLS-L$ 
//	}
//
//	public static Date max(Date date1, Date date2) {
//		return date1.compareTo(date2) >= 0 ? date1 : date2;  //$NON-NLS-L$ 
//	}
//
//	public static Date nullSafeMin(Date a, Date b) {
//		if (a == null)
//			return b;
//		if (b == null)
//			return a;
//		return min(a, b);
//	}
//
//	public static Date nullSafeMax(Date a, Date b) {
//		if (a == null)
//			return b;
//		if (b == null)
//			return a;
//		return max(a, b);
//	}
//
//	/**
//	 * Returns true if the date passed in is the current month by comparing the
//	 * month and year of the date passed in to the current month and year of today's date.
//	 *
//	 * @param date
//	 * @return
//	 */
//	public static boolean isCurrentMonth(Date date) {
//		return isSameMonth(new Date(), date);
//	}
//
//	/**
//	 * Returns true if the date passed in is the same year as the current on by comparing date.
//	 *
//	 * @param date {Date} Required. The year to check.
//	 * @return {boolean} True if the two have the same year.
//	 */
//	public static boolean isCurrentYear(Date date) {
//		return isSameYear(new Date(), date);
//	}
//
//	/**
//	 * Returns true if the date passed in has the same day, month, and year as the
//	 * current day.
//	 *
//	 * @param date
//	 * @return
//	 */
//	public static boolean isToday(Date date) {
//		return DateUtils.isSameDay(new Date(), date);
//	}
//
//	/**
//	 * Determines if two Dates are equal down to millisecond precision, handling null values for both.
//	 * Uses <code>getTime</code> so it can be used with different implementations of Date.
//	 *
//	 * @param date1 the first Date
//	 * @param date2 the second Date
//	 * @return if the two Dates are the same
//	 */
//	public static boolean nullHandlingEquals(Date date1, Date date2) {
//		return date1 == null ? (date2 == null) : (date2 != null && date1.getTime() == date2.getTime());
//	}
//
//	public static int nullHandlingCompare(Date a, Date b) {
//		if (a == null) {
//			if (b == null)
//				return 0;
//			return -1;
//		} else {
//			if (b == null)
//				return 1;
//			return a.compareTo(b);  //$NON-NLS-L$ 
//		}
//	}
//
//	/**
//	 * Converts a Date object to Calendar
//	 *
//	 * @param date
//	 * @return
//	 */
//	public static Calendar convertDateToCalendar(Date date) {
//		if (date != null) {
//			Calendar c = Calendar.getInstance();  //$NON-NLS-L$ 
//			c.setTime(date);
//			return c;
//		}
//		return null;
//	}
//
//	public static Date getDateDaysAgo(int numDaysAgo) {
//		return DateUtils.addDays(getToday(), -1 * numDaysAgo);
//	}
//
//	public static Date getDateDaysAgo(int numDaysAgo, String fromDate) {
//		return DateUtils.addDays(MintDateUtil.parseDateFromString(fromDate, MintDateFormatEnum.YYYY_DASH_MM_DASH_DD), -1 * numDaysAgo);
//	}
//
//
//	public static Date getDateHoursAgo(int numHoursAgo) {
//		return DateUtils.addHours(getToday(), -1 * numHoursAgo);
//	}
//
//	public static boolean isWithinXDays(Date maturityDate, long x) {
//		Date today = new Date();
//		long timeDiff = 0L; // fixing an NPE
//
//		if (maturityDate != null) {
//			timeDiff = Math.abs(maturityDate.getTime() - today.getTime());
//		}
//
//		// maturity too far away in the future
//		if (timeDiff > 0L && timeDiff > x * DAY_IN_MILLIS) return false;
//
//		// maturity too far away in the past
//		return !(timeDiff < 0L && -timeDiff > x * DAY_IN_MILLIS);
//	}
//
//	public static Date getOffsetMonth(int months) {
//		return getOffsetMonth(new Date(), months);
//	}
//
//	public static Date getOffsetMonth(Date date, int months) {
//		Date startOfMonth = DateUtils.truncate(date, Calendar.MONTH);
//		return DateUtils.addMonths(startOfMonth, months);
//	}
//
//	/**
//	 * Just gets the current year as String
//	 *
//	 * @return {String} Current Year
//	 */
//	public static String getCurrentYearAsString() {
//		Calendar cal = Calendar.getInstance();  //$NON-NLS-L$ 
//		return Integer.toString(cal.get(Calendar.YEAR));  //$NON-NLS-L$ 
//	}
//
//	/**
//	 * Formats the calendar into a string using the specified format
//	 *
//	 * @param cal	{Calendar}                          The calendar object
//	 * @param format {String}                         The format of the calendar string, like ("%1$tm/%1$td/%1$tY")
//	 * @return {String}                                The calendar as a string or deflt if calendar is null
//	 */
//	public static String getDateAsString(Calendar cal, String format) {
//		if (null == cal) {
//			cal = Calendar.getInstance();  //$NON-NLS-L$ 
//		}
//		if (null == format) {
//			format = "%1$tm/%1$td/%1$tY";
//		}
//		return String.format(format, cal);  //$NON-NLS-L$ 
//	}
//
//	public static String getDateAsString(Date date, String format) {
//		return getDateAsString(convertDateToCalendar(date), format);
//	}
//
//	/**
//	 * Display a date as a string and it can be 'today', 'yesterday' or 'tomorrow'.
//	 * Note that this implementation doesn't handle today/tomorrow across the new year.
//	 *
//	 * @param showTime toggles whether the time is displayed as well
//	 */
//	public static String formatRelativeDate(Date date, boolean showTime) {
//		String DATE_FORMAT = "EEE, MMM dd, yyyy";
//		String TIME_FORMAT = "h:mma";
//		Calendar calendar = Calendar.getInstance();  //$NON-NLS-L$ 
//		calendar.setTime(date);
//
//		Calendar now = Calendar.getInstance();  //$NON-NLS-L$ 
//		int today = now.get(Calendar.DAY_OF_YEAR);
//		DateTimeFormatter timeFormat = DateTimeFormat.forPattern(" " + TIME_FORMAT);
//		String time = showTime ? timeFormat.print(new DateTime(calendar.getTime())) : "";
//
//		if (now.get(Calendar.YEAR) == calendar.get(Calendar.YEAR)) {
//			if (today == calendar.get(Calendar.DAY_OF_YEAR)) {
//				return "Today" + time;
//			}
//			else if (today - 1 == calendar.get(Calendar.DAY_OF_YEAR)) {
//				return "Yesterday" + time;
//			}
//			else if (today + 1 == calendar.get(Calendar.DAY_OF_YEAR)) {
//				return "Tomorrow" + time;
//			}
//		}
//		final DateTimeFormatter dateFormat = DateTimeFormat.forPattern(DATE_FORMAT);
//		return dateFormat.print(new DateTime(date)) + time;
//	}
//
//	/**
//	 * @param later
//	 * @param earlier
//	 * @return A pair of integers. The first is the amount, which may be positive to the "later" is indeed later than "earlier",
//	 *         or negative to mean otherwise; the second is the unit, as MintDateUtil.MONTH, or MintDateUtil.WEEK. If those two dates
//	 *         are within the same week, the first value would be 0.
//	 *         The difference is result of rounding. I.e 4 days means 1 week. 9 days also 1 weeks.
//	 */
///*	public static MintResultPair<Long, Integer> getDateDifferenceWithUnit(Date later, Date earlier) {
//		if (later == null || earlier == null) return null;
//		boolean reverse = earlier.after(later);
//
//		if (reverse) {
//			Date x = later;
//			later = earlier;
//			earlier = x;
//		}
//
//		long resultAmount;
//		int resultUnit;
//		// Now use the compareDate to compare with the targetDate
//		// doing the "mitTime" thing so that we can the result of round, instead of always trunc.
//		resultAmount = MintDateUtil.getDateDiff(later, earlier, MintDateUtil.MONTH);
//		if (resultAmount != 0) {
//			Calendar cal = convertDateToCalendar(later);
//			cal.add(Calendar.MONTH, 1);
//			long midTime = (later.getTime() + cal.getTimeInMillis()) / 2;
//			resultAmount = MintDateUtil.getDateDiff(new Date(midTime), earlier, MintDateUtil.MONTH);
//			resultUnit = MintDateUtil.MONTH;
//		}
//		else {
//			// half week, 3.5 days, is 302400000 milliseconds
//			long midTime = later.getTime() + 302400000;
//			resultAmount = MintDateUtil.getDateDiff(new Date(midTime), earlier, MintDateUtil.WEEK);
//			resultUnit = MintDateUtil.WEEK;
//		}
//
//		return new MintResultPair<Long, Integer>((reverse ? -resultAmount : resultAmount), resultUnit);
//	}*/
//
//	/**
//	 * @return the most recent date among the given dates, or null if all input arguments are null
//	 */
//	public static Date mostRecent(Date... dates) {
//		Date mostRecentDate = null;
//		for (Date d : dates) {
//			if (d == null) {
//				continue;
//			}
//			if (mostRecentDate == null) {
//				mostRecentDate = d;
//			}
//			if (d.after(mostRecentDate)) {
//				mostRecentDate = d;
//			}
//		}
//		return mostRecentDate;
//	}
//
//	/**
//	 * @return the least recent (oldest) date among the given dates, or null if all input arguments are null
//	 */
//	public static Date leastRecent(Date... dates) {
//		Date leastRecentDate = null;
//		for (Date d : dates) {
//			if (d == null) {
//				continue;
//			}
//			if (leastRecentDate == null) {
//				leastRecentDate = d;
//			}
//			if (d.before(leastRecentDate)) {
//				leastRecentDate = d;
//			}
//		}
//		return leastRecentDate;
//	}
//
//	/**
//	 * @param day
//	 * @param month 1 = Jan, 2 = Feb
//	 * @param year
//	 * @return
//	 */
//	public static Date getGregorianDate(int day, int month, int year) {
//		Calendar c = new GregorianCalendar();
//		c.set(year, month - 1, day);
//		return c.getTime();
//	}
//
//	/**
//	 * Helper Function for converting events per minute to wait in Miliseconds for a timer
//	 *
//	 * @param bd
//	 * @return
//	 */
//	public static BigDecimal eventsPerMinuteToTimerWait(BigDecimal bd) {
//		BigDecimal timerWait = BigDecimal.ZERO;
//		if (bd.equals(BigDecimal.ZERO)) {
//			// throw some exception
//		}
//		else {
//			BigDecimal perSecond = bd.divide(new BigDecimal(60), 3, BigDecimal.ROUND_HALF_EVEN);
//			timerWait = BigDecimal.ONE.divide(perSecond, 3, BigDecimal.ROUND_HALF_EVEN).multiply(new BigDecimal(1000));
//		}
//		return timerWait;
//	}
//
//	public static Date truncate(Date date, int field) {
//		if (field == WEEK) {
//			Date sun = getSundayOfWeek(date);
//			return DateUtils.truncate(sun, DAY);
//		} else return DateUtils.truncate(date, field);
//	}
//
//	// Converts a java.util.Date into an instance of XMLGregorianCalendar
//	public static XMLGregorianCalendar asXMLGregorianCalendar(java.util.Date date) {
//		if(date == null) {
//			return null;
//		} else {
//			GregorianCalendar gc = new GregorianCalendar();
//			gc.setTimeInMillis(date.getTime());
//			return df.newXMLGregorianCalendar(gc);
//		}
//	}
//
//	/**
//	 *
//	 * @param startTime
//	 * @param minutes
//	 * @return
//	 */
//	public static String minutesToTime(String startTime, int minutes) {
//		if (minutes <= 0) {
//			return  "00:00";
//		}
//		int hour = (minutes -1 ) / 60 + Integer.parseInt(startTime.substring(0,2));
//		int minute = (minutes-1) % 60 + Integer.parseInt(startTime.substring(3,5)) ;
//		StringBuilder timeSb = new StringBuilder();
//		if (hour < 10) {
//			timeSb.append("0");
//		}
//		timeSb.append(hour);
//		timeSb.append(":");
//		if (minute < 10) {
//			timeSb.append("0");
//		}
//		timeSb.append(minute);
//		return timeSb.toString();
//	}
//}
