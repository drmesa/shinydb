package com.nothingtothetable.shinydb.dao;

import com.nothingtothetable.shinydb.model.DomainGame;

public interface GameDao
{
    void create(DomainGame game);

    DomainGame read(Long id);

    DomainGame update(DomainGame game);

    void delete(Long id);
}
