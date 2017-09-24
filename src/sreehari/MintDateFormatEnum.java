//package sreehari;
//
//import java.time.format.DateTimeFormatter;
//
//import org.joda.time.format.DateTimeFormat;
//
///**
// * mint.common
// * User: matt snider
// * Date: May 18, 2009
// * Time: 3:45:18 PM
// */
//public enum MintDateFormatEnum {
//	MM_DASH_DD_DASH_YY(1, "MM-dd-yy"),
//	MM_DASH_DD_DASH_YYYY(33, "MM-dd-yyyy"),
//	MM_DOT_DD_DOT_YY(2, "MM.dd.yy"),
//	MM_DOT_DD_DOT_YYYY(34, "MM.dd.yyyy"),
//	MM_SLASH_DD(3, "MM/dd"),
//	MM_SLASH_DD_SLASH_YY(4, "MM/dd/yy"),
//	MM_SLASH_DD_SLASH_YYYY(5, "MM/dd/yyyy"),
//	MM_SLASH_DD_SLASH_YYYY_TIME(6, "MM/dd/yyyy hh:mm aaa"),
//	MM_SLASH_YYYY(7, "MM/yyyy"),
//	MMDD(8, "MMdd"),
//	MMDDYY(9, "MMddyy"),
//	MMDDYYYY(10, "MMddyyyy"),
//	MMM_SPACE_YYYY(11, "MMM yyyy"),
//	MMM_SPACE_DD(12, "MMM dd"),
//    MMM_SPACE_DD_TIME_TZ(35, "MMM d, h:mm a z"),
//	MMMM_SPACE_DD(13, "MMMM dd"),
//	MONTH(14, "MMMMMMMMMMMM"),
//	MONTH_ABBR(15, "MMM"),
//	STANDARD_ABBR(16, "MMM d, yyyy"),
//	STANDARD_FULL(17, "MMMMMMMMMMMM d, yyyy"),
//	STANDARD_NO_YEAR(18, "MMMMMMMMMMMM d"),
//	STANDARD_NO_DAY(19, "MMMMMMMMMMMM yyyy"),
//	YYYY_DASH_MM_DASH_DD(20, "yyyy-MM-dd"), //Mysql style
//	YYYY_DOT_MM_DOT_DD(21, "yyyy.MM.dd"),
//	YYYYMMDD(22, "yyyyMMdd"),
//	YYYY(23, "yyyy"),
//	YYYY_DASH_MM_DASH_DD_TIME(24, "yyyy-MM-dd HH:mm:ss"), //Mysql style
//	YYYY_DASH_MM_DASH_DD_T_TIME(25, "yyyy-MM-dd'T'HH:mm:ss"), //Mysql style
//    EEE_SPACE_MMM_SPACE_D(26, "EEE MMM d"),
//    EEEE_COMMA_MMMM_SPACE_D_AT_TIME(27, "EEEE, MMMM d 'at' h:mm a"),
//    TIME_SPACE_EEE_COMMA_MMM_SPACE_DD_COMMA_YYYY(28, "h:mma EEE, MMM dd, yyyy"),
//    TIME_SPACE_EEE_COMMA_MMM_SPACE_DD(29, "h:mma EEE, MMM dd"),
//	MMM_SPACE_YY(30, "MMM yy"),
//    DATE_COLON_TIME(31, "yyyy:MM:dd:HH:mm:ss"),
//	MMMM_SPACE_YYYY(32, "MMMM yyyy"),
//	EEE(33, "EEE"),
//	LOG_TIMESTAMP(34, "MM/dd/yyyy HH:mm:ss"),
//	E_COMMA_SPACE_MMM_SPACE_DD(35, "E, MMM dd"),
//	YYYY_DASH_MM(36,"yyyy-MM");
//
//	/**
//	 * The value of the enum.    E, MMM dd
//	 */
//    private final int _id;
//
//	/**
//	 * The format string of the enum.
//	 */
//    private final String _format;
//
//	/**
//	 * Constructor for this enum.
//	 * @param id {int} Required. The integer value.
//	 * @param format {String} Required. The format string.
//	 */
//    private MintDateFormatEnum(int id, String format) {
//        _id = id;
//		_format = format;
//    }
//
//	////
//	//  Common Enum Methods
//	////
//
//	/**
//	 * Creates the date format of the enum.
//	 * !IMPORTANT! DateFormat are not threadsafe, do not pass these between functions.
//	 * @return {String} The enum date format.
//	 */
//	public final DateTimeFormatter getDateFormat() {
//		return DateTimeFormat.forPattern(_format);
//	}
//
//	/**
//	 * Fetches the format of the enum.
//	 * @return {String} The enum format.
//	 */
//	public final String getFormat() {
//		return _format;
//	}
//
//	/**
//	 * Fetches the value of the enum as a string.
//	 * @return {String} The enum value.
//	 */
//    public String getValue() {
//        return "" + _id;
//    }
//
//	/**
//	 * Fetches the value of the enum.
//	 * @return {int} The enum value.
//	 */
//	public int toInt() {
//	    return _id;
//	}
//
//
//	////
//	//  Static Enum Methods Below
//	////
//
//	/**
//	 * Converts an integer to a BankAccountType enum.
//	 * @param value {int} Required. The value to convert.
//	 * @return {BankAccountType} The enum or null.
//	 */
//	public static MintDateFormatEnum fromInt(int value) {
//		for (MintDateFormatEnum type : values()) {
//		    if (type.toInt() == value) {return type;}
//	    }
//
//	    return null;
//	}
//
//	/**
//	 * Converts a format to a BankAccountType enum.
//	 * @param format {String} Required. The format to convert.
//	 * @return {BankAccountType} The enum or null.
//	 */
//	public static MintDateFormatEnum fromString(String format) {
//		for (MintDateFormatEnum type : values()) {
//		    if (type.getFormat().equalsIgnoreCase(format)) {return type;}
//	    }
//
//	    return null;
//	}
//}
