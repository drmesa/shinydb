package com.nothingtothetable.shinydb.model;

public enum ShinyMethod
{
    STANDARD_CATCH(new Odds(1, 8192), new Odds(1, 8192), new Odds(1, 8192), new Odds(1, 8192), new Odds(1, 8192), new Odds(1, 4096), new Odds(1, 4096), new Odds(1, 4096), new Odds(1, 500)),
    STANDARD_BREEDING(new Odds(null, null), new Odds(1, 8192), new Odds(1, 8192), new Odds(1, 8192), new Odds(1, 8192), new Odds(1, 4096), new Odds(1, 4096), new Odds(1, 4096), new Odds(null, null)),
    SHINY_PARENT_BREEDING(new Odds(null, null), new Odds(1, 64), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null)),
    MASUDA_BREEDING(new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(5, 8192), new Odds(6, 8192), new Odds(6, 4096), new Odds(6, 4096), new Odds(6, 4096), new Odds(null, null)),
    // Below needs updating
    POKE_RADAR(new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null)),
    FISHING_CHAIN(new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null)),
    CATCH_CHAIN(new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null)),
    COMMUNITY_DAY(new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null)),
    ENCOUNTER_CHAIN(new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null)),
    RAID(new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null)),
    DEN_EVENT(new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null), new Odds(null, null)),
    ;


    private Odds genOneRate;
    private Odds genTwoRate;
    private Odds genThreeRate;
    private Odds genFourRate;
    private Odds genFiveRate;
    private Odds genSixRate;
    private Odds genSevenRate;
    private Odds genEightRate;
    private Odds pokemonGoRate;

    ShinyMethod(Odds genOneRate, Odds genTwoRate, Odds genThreeRate, Odds genFourRate, Odds genFiveRate, Odds genSixRate, Odds genSevenRate, Odds genEightRate, Odds pokemonGoRate)
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

    public Odds getGenerationRate(DomainGeneration gen)
    {
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
