package com.nothingtothetable.shinydb.service.impl;

import com.nothingtothetable.shinydb.model.DomainGeneration;
import com.nothingtothetable.shinydb.model.ShinyMethod;
import com.nothingtothetable.shinydb.service.OddsService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OddsServiceImpl implements OddsService
{
    @PostConstruct
    private void init()
    {

    }
    @Override
    public ShinyMethod getBestOdds(List<ShinyMethod> availableMethods, DomainGeneration gen)
    {
       // List<BigDecimal> odds = availableMethods.stream().map(method -> method.getGenerationRate(gen)).collect(Collectors.toList());
        return null;
    }
}
