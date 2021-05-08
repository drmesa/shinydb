package com.nothingtothetable.shinydb.dao;

import com.nothingtothetable.shinydb.model.DomainGame;
import com.nothingtothetable.shinydb.model.DomainGameFilter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GameDao
{
    void create(DomainGame game);

    DomainGame read(Long id);

    List<DomainGame> filter(DomainGameFilter filter);

    DomainGame update(DomainGame game);

    void delete(Long id);
}
