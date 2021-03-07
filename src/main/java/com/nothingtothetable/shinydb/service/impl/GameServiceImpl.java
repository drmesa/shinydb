package com.nothingtothetable.shinydb.service.impl;

import com.nothingtothetable.shinydb.model.DomainGame;
import com.nothingtothetable.shinydb.model.DomainGameFilter;
import com.nothingtothetable.shinydb.service.GameService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameServiceImpl implements GameService
{
    @Override
    public void create(DomainGame mon)
    {

    }

    @Override
    public DomainGame read(Long id)
    {
        return null;
    }

    @Override
    public DomainGame readByDexId(Integer dexNum)
    {
        return null;
    }

    @Override
    public List<DomainGame> filter(DomainGameFilter filter)
    {
        return null;
    }

    @Override
    public DomainGame update(DomainGame mon)
    {
        return null;
    }

    @Override
    public void delete(Long id)
    {

    }
}
