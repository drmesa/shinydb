package com.nothingtothetable.shinydb.model;

import java.util.List;
import java.util.Map;

public class DomainMon
{
    private Long id;
    private Integer dexId;
    private DomainRegionalForm form;
    private String name;
    private List<DomainGame> games;
    private Map<DomainGame, String> bestOddsTable;
    private Map<DomainGame, ShinyMethod> allOddsTable;

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

    public DomainRegionalForm getForm()
    {
        return form;
    }

    public void setForm(DomainRegionalForm form)
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

    public Map<DomainGame, String> getBestOddsTable()
    {
        return bestOddsTable;
    }

    public DomainMon setBestOddsTable(Map<DomainGame, String> bestOddsTable)
    {
        this.bestOddsTable = bestOddsTable;
        return this;
    }

    public Map<DomainGame, ShinyMethod> getAllOddsTable()
    {
        return allOddsTable;
    }

    public DomainMon setAllOddsTable(Map<DomainGame, ShinyMethod> allOddsTable)
    {
        this.allOddsTable = allOddsTable;
        return this;
    }
}
