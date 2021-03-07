package com.nothingtothetable.shinydb.service;

import com.nothingtothetable.shinydb.model.DomainAtlas;
import com.nothingtothetable.shinydb.model.DomainAtlasFilter;

import java.util.List;

public interface AtlasService // This might not use crud since an Atlas is just a collection of locations for a game
{
    void create(DomainAtlas mon);
    
    DomainAtlas read(Long id);

    DomainAtlas readByDexId(Integer dexNum);

    List<DomainAtlas> filter(DomainAtlasFilter filter);

    DomainAtlas update(DomainAtlas mon);

    void delete(Long id);
}
