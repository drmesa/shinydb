package com.nothingtothetable.shinydb.service;

import com.nothingtothetable.shinydb.model.DomainLocation;
import com.nothingtothetable.shinydb.model.DomainLocationFilter;

import java.util.List;

public interface LocationService
{
    void create(DomainLocation mon);

    DomainLocation read(Long index);

    DomainLocation readByDexId(Integer dexNum);

    List<DomainLocation> filter(DomainLocationFilter filter);

    DomainLocation update(DomainLocation mon);

    void delete(Long index);
}
