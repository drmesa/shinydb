package com.nothingtothetable.shinydb.service;

import com.nothingtothetable.shinydb.model.DomainMon;
import com.nothingtothetable.shinydb.model.DomainMonFilter;

import java.util.List;

public interface MonService
{
    void create(DomainMon mon);

    DomainMon read(Long index);

    DomainMon readByDexId(Integer dexNum);

    List<DomainMon> filter(DomainMonFilter filter);

    DomainMon update(DomainMon mon);

    void delete(Long index);
}
