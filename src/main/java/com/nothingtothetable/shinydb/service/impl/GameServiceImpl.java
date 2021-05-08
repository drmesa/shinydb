package com.nothingtothetable.shinydb.service.impl;

import com.nothingtothetable.shinydb.dao.GameDao;
import com.nothingtothetable.shinydb.model.DomainGame;
import com.nothingtothetable.shinydb.model.DomainGameFilter;
import com.nothingtothetable.shinydb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameServiceImpl implements GameService
{
    @Autowired
    private GameDao gameDao;

    @Override
    public void create(DomainGame mon)
    {
        gameDao.create(mon);
    }

    @Override
    public DomainGame read(Long id)
    {
        return gameDao.read(id);
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
