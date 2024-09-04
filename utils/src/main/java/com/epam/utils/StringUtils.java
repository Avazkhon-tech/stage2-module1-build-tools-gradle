package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean creatable = NumberUtils.isCreatable(str);
        if (!creatable) {
            return NumberUtils.toInt(str) >= 0;
        }
        return false;
    }
}
