package com.nothingtothetable.shinydb.model;

import java.util.List;

public class DomainLocation
{
    private Long id;
    private String name;
    private List<DomainMon> catchableMons;

    public Long getId()
    {
        return id;
    }

    public DomainLocation setId(Long id)
    {
        this.id = id;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public DomainLocation setName(String name)
    {
        this.name = name;
        return this;
    }

    public List<DomainMon> getCatchableMons()
    {
        return catchableMons;
    }

    public DomainLocation setCatchableMons(List<DomainMon> catchableMons)
    {
        this.catchableMons = catchableMons;
        return this;
    }
}
