package org.hisrc.airmeet.time.format;

import android.support.annotation.NonNull;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeFormatConstants {

    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormat.forPattern("HH:mm");
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm";
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern(DATE_TIME_FORMAT);

    private DateTimeFormatConstants() {
    }

    @NonNull
    public static LocalDateTime parseDateTime(String value) {
        if ("null".equals(value)) {
            return null;
        }
        final LocalDateTime localDateTime = DATE_TIME_FORMATTER.parseLocalDateTime(value);
        return localDateTime;
    }

    public static LocalDate parseDate(String departureDateString) {
        if ("null".equals(departureDateString)) {
            return null;
        }
        final LocalDate localDate = DATE_FORMATTER.parseLocalDate(departureDateString);
        return localDate;
    }
}
