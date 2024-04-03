package com.example.bank.service;

import com.example.bank.model.entities.NaturalPerson;
import com.example.bank.model.repos.NaturalPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NaturalPersonServiceImp implements NaturalPersonService{

    @Autowired
    NaturalPersonRepository naturalPersonRepository;

    @Override
    public void create(NaturalPerson naturalPerson) {
        naturalPersonRepository.save(naturalPerson);
    }

    @Override
    public List<NaturalPerson> readAll() {
        return naturalPersonRepository.findAll();
    }

    @Override
    public NaturalPerson readById(long id) {
        return naturalPersonRepository.existsById(id) ? naturalPersonRepository.findById(id).get() : null;
    }

    @Override
    public boolean update(NaturalPerson naturalPerson, long id) {
        if (naturalPersonRepository.existsById(id)) {
            naturalPerson.setId(id);
            naturalPersonRepository.save(naturalPerson);
            return true;
        }
        return false;
    }

    @Override
    public void delete(long id) {
        naturalPersonRepository.deleteById(id);
    }
}
