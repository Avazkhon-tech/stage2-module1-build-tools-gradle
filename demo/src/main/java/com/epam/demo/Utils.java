package com.epam.demo;

import java.util.List;
import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            boolean positiveNumber = StringUtils.isPositiveNumber(arg);
            if (!positiveNumber) {
                return false;
            }
        }
        return true;
    }
}