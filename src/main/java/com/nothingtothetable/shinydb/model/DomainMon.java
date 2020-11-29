package com.nothingtothetable.shinydb.model;

import java.util.List;
import java.util.Map;

public class DomainMon
{
    private Long id;
    private Integer dexId;
    private DomainForm form;
    private String name;
    private List<DomainGame> games;
    private Map<DomainGame, String> bestOddsTable;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Integer getDexId()
    {
        return dexId;
    }

    public void setDexId(Integer dexId)
    {
        this.dexId = dexId;
    }

    public DomainForm getForm()
    {
        return form;
    }

    public void setForm(DomainForm form)
    {
        this.form = form;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<DomainGame> getGames()
    {
        return games;
    }

    public void setGames(List<DomainGame> games)
    {
        this.games = games;
    }
}
