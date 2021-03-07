package com.nothingtothetable.shinydb.model;

public enum DomainGeneration
{
    ONE(1, "I"),
    TWO(2, "II"),
    THREE(3, "III"),
    FOUR(4, "IV"),
    FIVE(5, "V"),
    SIX(6, "VI"),
    SEVEN(7, "VII"),
    EIGHT(8, "VIII");

    private Integer dbId;
    private String romanNumeral;

    DomainGeneration(Integer dbId, String romanNumeral)
    {
        this.dbId = dbId;
        this.romanNumeral = romanNumeral;
    }
}
