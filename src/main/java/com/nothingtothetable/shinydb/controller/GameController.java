package com.nothingtothetable.shinydb.controller;

import com.nothingtothetable.shinydb.model.DomainGame;
import com.nothingtothetable.shinydb.model.DomainGeneration;
import com.nothingtothetable.shinydb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("game")
public class GameController
{
    @Autowired
    private GameService gameService;

    @GetMapping("/{id}")
    public DomainGame read(@PathVariable("id") Long gameId)
    {
        return gameService.read(gameId);
    }

    @GetMapping("/test")
    public DomainGame test()
    {
        DomainGame game = new DomainGame();
        game.setGeneration(DomainGeneration.TWO);

        return game;
    }
}
