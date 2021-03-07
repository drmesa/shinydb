package com.nothingtothetable.shinydb.service;

import com.nothingtothetable.shinydb.model.DomainAtlas;
import com.nothingtothetable.shinydb.model.DomainAtlasFilter;

import java.util.List;

public interface AtlasService
{
    void create(DomainAtlas mon);
    
    DomainAtlas read(Long index);

    DomainAtlas readByDexId(Integer dexNum);

    List<DomainAtlas> filter(DomainAtlasFilter filter);

    DomainAtlas update(DomainAtlas mon);

    void delete(Long index);
}
