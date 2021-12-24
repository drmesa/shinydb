package com.nothingtothetable.shinydb.model;

import java.math.BigDecimal;

public class Odds
{
    private Integer numerator;
    private Integer denominator;
    private String oddsString;
    private BigDecimal odds;
    private Integer fiftyPercent;
    private Integer ninetyPercent;

    public Odds(Integer numerator, Integer denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        this.oddsString = numerator + "/" + denominator;
        this.odds = new BigDecimal(numerator).divide(new BigDecimal(denominator));
    }

    public Integer getNumerator()
    {
        return numerator;
    }

    public Odds setNumerator(Integer numerator)
    {
        this.numerator = numerator;
        return this;
    }

    public Integer getDenominator()
    {
        return denominator;
    }

    public Odds setDenominator(Integer denominator)
    {
        this.denominator = denominator;
        return this;
    }

    public String getOddsString()
    {
        return oddsString;
    }

    public Odds setOddsString(String oddsString)
    {
        this.oddsString = oddsString;
        return this;
    }

    public BigDecimal getOdds()
    {
        return odds;
    }

    public Odds setOdds(BigDecimal odds)
    {
        this.odds = odds;
        return this;
    }
}
