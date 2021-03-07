package com.nothingtothetable.shinydb.model;

public class DomainGame
{
    private Long id;
    private DomainGeneration generation;
    private DomainAtlas locations;

    public Long getId()
    {
        return id;
    }

    public DomainGame setId(Long id)
    {
        this.id = id;
        return this;
    }

    public DomainGeneration getGeneration()
    {
        return generation;
    }

    public DomainGame setGeneration(DomainGeneration generation)
    {
        this.generation = generation;
        return this;
    }

    public DomainAtlas getLocations()
    {
        return locations;
    }

    public DomainGame setLocations(DomainAtlas locations)
    {
        this.locations = locations;
        return this;
    }
}
