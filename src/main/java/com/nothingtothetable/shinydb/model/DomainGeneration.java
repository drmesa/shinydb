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
    EIGHT(8, "VIII"),
    GO(0, "GO");

    private Integer dbId;
    private String romanNumeral;

    DomainGeneration(Integer dbId, String romanNumeral)
    {
        this.dbId = dbId;
        this.romanNumeral = romanNumeral;
    }

    public Integer getDbId()
    {
        return dbId;
    }

    public String getRomanNumeral()
    {
        return romanNumeral;
    }

    public static DomainGeneration fromDbId(Integer dbId)
    {
        for (DomainGeneration gen : DomainGeneration.values()) {
            if (gen.dbId.equals(dbId)) {
                return gen;
            }
        }

        throw new IllegalArgumentException(dbId + " is not a valid db id");
    }
}
