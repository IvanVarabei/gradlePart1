package by.epam.assembly;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    private static final String MINUS = "-";

    public static boolean isPositiveNumber(String str) {
        if(NumberUtils.isCreatable(str)){
            return !org.apache.commons.lang3.StringUtils.startsWith(str.trim(), MINUS);
        }
        return false;
    }
}
