package com.example.scafolding__tamplate.services.impl;

import com.example.scafolding__tamplate.models.Dummy;
import com.example.scafolding__tamplate.respositories.DummyRepository;
import com.example.scafolding__tamplate.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DummyServiceImp implements DummyService{
    @Autowired
    private DummyRepository dummyRepository;
    @Override
    public Dummy getDummy(Long id) {
        return null;
    }

    @Override
    public List<Dummy> getDummyList() {
        return List.of();
    }

    @Override
    public Dummy createDummy(Dummy dummy) {
        return null;
    }

    @Override
    public Dummy updateDummy(Dummy dummy) {
        return null;
    }

    @Override
    public void deleteDummy(Dummy dummy) {

    }
}
