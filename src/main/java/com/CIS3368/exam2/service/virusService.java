package com.CIS3368.exam2.service;

import com.CIS3368.exam2.dao.virusRepo;
import com.CIS3368.exam2.model.virus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//In this package we create a service that will allow is to create a list with a for loop that collects all the information from the virusRepo
@Service
public class virusService {

    @Autowired
    private virusRepo VirusRepo;

    public Collection<virus> findAllViruses(){
        List<virus> Viruses = new ArrayList<virus>();
        for (virus Virus : VirusRepo.findAll()){
            Viruses.add(Virus);
        }
        return Viruses;
    }
}
