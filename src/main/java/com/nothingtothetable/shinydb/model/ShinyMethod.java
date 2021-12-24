package com.nothingtothetable.shinydb.model;

public enum ShinyMethod
{
    STANDARD_CATCH("","","","","","","","", ""),
    STANDARD_BREEDING("","","","","","","","", ""),
    SHINY_PARENT_BREEDING("","","","","","","","", ""),
    MASUDA_BREEDING("","","","","","","","", ""),
    POKE_RADAR("","","","","","","","", ""),
    FISHING_CHAIN("","","","","","","","", ""),
    CATCH_CHAIN("","","","","","","","", ""),
    COMMUNITY_DAY("","","","","","","","", ""),
    ENCOUNTER_CHAIN("", "", "", "", "", "", "", "", ""),
    RAID("", "", "", "", "", "", "", "", ""),
    DEN_EVENT("", "", "", "", "", "", "", "", "");


    private String genOneRate;
    private String genTwoRate;
    private String genThreeRate;
    private String genFourRate;
    private String genFiveRate;
    private String genSixRate;
    private String genSevenRate;
    private String genEightRate;
    private String pokemonGoRate;

    ShinyMethod(String genOneRate, String genTwoRate, String genThreeRate, String genFourRate, String genFiveRate, String genSixRate, String genSevenRate, String genEightRate, String pokemonGoRate)
    {
        this.genOneRate = genOneRate;
        this.genTwoRate = genTwoRate;
        this.genThreeRate = genThreeRate;
        this.genFourRate = genFourRate;
        this.genFiveRate = genFiveRate;
        this.genSixRate = genSixRate;
        this.genSevenRate = genSevenRate;
        this.genEightRate = genEightRate;
        this.pokemonGoRate = pokemonGoRate;
    }

    public String getGenerationRate(DomainGeneration gen)
    {
        String rate;
        switch (gen) {
            case ONE -> {
                return genOneRate;
            }
            case TWO -> {
                return genTwoRate;
            }
            case THREE -> {
                return genThreeRate;
            }
            case FOUR -> {
                return genFourRate;
            }
            case FIVE -> {
                return genFiveRate;
            }
            case SIX -> {
                return genSixRate;
            }
            case SEVEN -> {
                return genSevenRate;
            }
            case EIGHT -> {
                return genEightRate;
            }
            default -> {
                return pokemonGoRate;
            }
        }
    }
}
