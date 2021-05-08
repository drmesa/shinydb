package com.nothingtothetable.shinydb.controller;

import com.nothingtothetable.shinydb.model.DomainGame;
import com.nothingtothetable.shinydb.model.DomainGeneration;
import com.nothingtothetable.shinydb.model.DomainMon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mon")
public class MonController
{
    @GetMapping("/testmon")
    public DomainMon test()
    {
        DomainMon mon = new DomainMon();
        mon.setName("Test");

        return mon;
    }
}
