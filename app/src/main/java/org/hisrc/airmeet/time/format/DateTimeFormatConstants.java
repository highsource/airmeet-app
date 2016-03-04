package org.hisrc.airmeet.time.format;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeFormatConstants {

	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm";
	public final static DateTimeFormatter DATE_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");
	public final static DateTimeFormatter TIME_FORMATTER = DateTimeFormat.forPattern("HH:mm");
	public final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern(DATE_TIME_FORMAT);

	private DateTimeFormatConstants() {
	}

}
