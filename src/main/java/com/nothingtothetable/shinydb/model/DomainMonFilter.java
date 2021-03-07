package com.nothingtothetable.shinydb.model;

import java.util.List;

public class DomainMonFilter
{
    private List<Long> ids;
    private List<Integer> dexNums;

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
}
