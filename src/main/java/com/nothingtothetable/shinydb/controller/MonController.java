package com.nothingtothetable.shinydb.controller;

import com.nothingtothetable.shinydb.model.DomainGame;
import com.nothingtothetable.shinydb.model.DomainGeneration;
import com.nothingtothetable.shinydb.model.DomainMon;
import com.nothingtothetable.shinydb.model.DomainMonFilter;
import com.nothingtothetable.shinydb.service.MonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("mon")
public class MonController
{
    @Autowired
    private MonService monService;

    @GetMapping("/{id}")
    public DomainMon read(@PathVariable("id") Long id)
    {
        return monService.read(id);
    }

    @GetMapping("/dex/{num}")
    public DomainMon readByDexNum(@PathVariable("num") Integer dexNum)
    {
        return monService.readByDexId(dexNum);
    }

    @PostMapping
    public void create(DomainMon mon)
    {
        monService.create(mon);
    }

    @GetMapping("/mons") // TODO: Figure out what the standard is for this
    public List<DomainMon> filter(DomainMonFilter filter)
    {
        return monService.filter(filter);
    }

    @PutMapping
    public DomainMon update(DomainMon mon)
    {
        return monService.update(mon);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id)
    {
        monService.delete(id);
    }
}
