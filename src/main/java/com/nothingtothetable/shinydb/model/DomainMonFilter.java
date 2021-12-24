package com.nothingtothetable.shinydb.model;

import java.util.List;

public class DomainMonFilter
{
    private List<Long> ids;
    private List<Integer> dexNums;
    private List<String> names;

    public List<Long> getIds()
    {
        return ids;
    }

    public DomainMonFilter setIds(List<Long> ids)
    {
        this.ids = ids;
        return this;
    }

    public List<Integer> getDexNums()
    {
        return dexNums;
    }

    public DomainMonFilter setDexNums(List<Integer> dexNums)
    {
        this.dexNums = dexNums;
        return this;
    }

    public List<String> getNames()
    {
        return names;
    }

    public DomainMonFilter setNames(List<String> names)
    {
        this.names = names;
        return this;
    }
}
