package com.nothingtothetable.shinydb.service;

import com.nothingtothetable.shinydb.model.DomainGame;
import com.nothingtothetable.shinydb.model.DomainGameFilter;

import java.util.List;

public interface GameService
{
    void create(DomainGame mon);

    DomainGame read(Long index);

    DomainGame readByDexId(Integer dexNum);

    List<DomainGame> filter(DomainGameFilter filter);

    DomainGame update(DomainGame mon);

    void delete(Long index);
}
