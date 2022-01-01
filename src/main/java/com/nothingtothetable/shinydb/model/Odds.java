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
        this.fiftyPercent = Math.toIntExact(Math.round(Math.log(1 - .5) / Math.log(((denominator - 1d) / (denominator)))));
        this.ninetyPercent = Math.toIntExact(Math.round(Math.log(1 - .9) / Math.log(((denominator - 1d) / (denominator)))));
    }

    public Integer getNumerator()
    {
        return numerator;
    }

    public Odds setNumerator(Integer numerator)
    {
        this.numerator = numerator;
        calculateOdds();
        return this;
    }

    public Integer getDenominator()
    {
        return denominator;
    }

    public Odds setDenominator(Integer denominator)
    {
        this.denominator = denominator;
        calculateOdds();
        return this;
    }

    public String getOddsString()
    {
        return oddsString;
    }

    public BigDecimal getOdds()
    {
        return odds;
    }

    public Integer getFiftyPercent()
    {
        return fiftyPercent;
    }

    public Integer getNinetyPercent()
    {
        return ninetyPercent;
    }

    private void calculateOdds()
    {
        this.oddsString = numerator + "/" + denominator;
        this.odds = new BigDecimal(numerator).divide(new BigDecimal(denominator));
        this.fiftyPercent = Math.toIntExact(Math.round(Math.log(1 - .5) / Math.log(((denominator - 1d) / (denominator)))));
        this.ninetyPercent = Math.toIntExact(Math.round(Math.log(1 - .9) / Math.log(((denominator - 1d) / (denominator)))));
    }
}
