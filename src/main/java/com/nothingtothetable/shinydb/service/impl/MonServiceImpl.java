package com.nothingtothetable.shinydb.service.impl;

import com.nothingtothetable.shinydb.dao.MonDao;
import com.nothingtothetable.shinydb.model.DomainGame;
import com.nothingtothetable.shinydb.model.DomainMon;
import com.nothingtothetable.shinydb.model.DomainMonFilter;
import com.nothingtothetable.shinydb.model.Odds;
import com.nothingtothetable.shinydb.service.MonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MonServiceImpl implements MonService
{
    @Autowired
    private MonDao monDao;

    @Override
    public void create(DomainMon mon)
    {
        monDao.create(mon);
    }

    @Override
    public DomainMon read(Long id)
    {
        return monDao.read(id);
    }

    @Override
    public DomainMon readByDexId(Integer dexNum)
    {
        DomainMonFilter filter = new DomainMonFilter();
        filter.setDexNums(Arrays.asList(dexNum));

        List<DomainMon> mons = monDao.filter(filter);

        return mons != null && !mons.isEmpty() ? mons.get(0) : null;
    }

    @Override
    public List<DomainMon> filter(DomainMonFilter filter)
    {
        Odds test = new Odds(1, 8192);
        System.out.println(test.getOdds());
        return monDao.filter(filter);
    }

    private void inflateMons(List<DomainMon> mons)
    {
        Map<Long, List<DomainGame>> gameMapByMon = new HashMap<>();

    }

    @Override
    public DomainMon update(DomainMon mon)
    {
        return monDao.update(mon);
    }

    @Override
    public void delete(Long id)
    {
        monDao.delete(id);
    }
}
