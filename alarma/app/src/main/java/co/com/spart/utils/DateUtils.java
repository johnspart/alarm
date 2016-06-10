package co.com.spart.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by john on 9/06/16.
 */
public class DateUtils {
    public static final SimpleDateFormat HH_mm = new SimpleDateFormat("HH:mm");

    public static String getSringFormat(Date date, SimpleDateFormat format) {
        return format.format(date);
    }
}
