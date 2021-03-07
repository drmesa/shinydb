package com.nothingtothetable.shinydb.model;

import java.util.List;

public class DomainAtlas
{
    private Long id;
    private List<DomainLocation> locations;

    public Long getId()
    {
        return id;
    }

    public DomainAtlas setId(Long id)
    {
        this.id = id;
        return this;
    }

    public List<DomainLocation> getLocations()
    {
        return locations;
    }

    public DomainAtlas setLocations(List<DomainLocation> locations)
    {
        this.locations = locations;
        return this;
    }
}
