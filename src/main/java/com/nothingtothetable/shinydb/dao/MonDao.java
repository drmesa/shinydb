package com.nothingtothetable.shinydb.dao;

import com.nothingtothetable.shinydb.model.DomainMon;
import com.nothingtothetable.shinydb.model.DomainMonFilter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MonDao
{
    void create(DomainMon mon);

    DomainMon read(Long id);

    List<DomainMon> filter(DomainMonFilter filter);

    DomainMon update(DomainMon mon);

    void delete(Long id);
}
