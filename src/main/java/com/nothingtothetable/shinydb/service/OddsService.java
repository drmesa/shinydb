package com.nothingtothetable.shinydb.service;

import com.nothingtothetable.shinydb.model.DomainGeneration;
import com.nothingtothetable.shinydb.model.ShinyMethod;

import java.util.List;

public interface OddsService
{
    ShinyMethod getBestOdds(List<ShinyMethod> availableMethods, DomainGeneration gen);
}
