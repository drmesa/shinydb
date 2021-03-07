package com.nothingtothetable.shinydb.util;

import java.math.BigDecimal;
import java.util.Map;

public class RateStringConverter
{
    private static final char DIVIDE_SIGN_SYMBOL = '/';
    private static final String NOT_APPLICABLE_RATE = "NA";

    private static Map<String, BigDecimal> rateStringToNumberMap;

    public static BigDecimal getNumericProbability(String rateString)
    {
        BigDecimal rate = rateStringToNumberMap.get(rateString);

        if (rate == null && !rateString.equals(NOT_APPLICABLE_RATE)) {
            int divideSignIndex = rateString.indexOf(DIVIDE_SIGN_SYMBOL);
            String numerator = rateString.substring(0,divideSignIndex);
            String denominator = rateString.substring(divideSignIndex + 1);
            rate = new BigDecimal(numerator).divide(new BigDecimal(denominator));
            rateStringToNumberMap.put(rateString, rate);
        } else if (rateString.equals(NOT_APPLICABLE_RATE)) {
            rate = BigDecimal.ZERO;
        }

        return rate;
    }
}
