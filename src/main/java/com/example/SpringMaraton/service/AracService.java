package com.example.SpringMaraton.service;

import com.example.SpringMaraton.entity.Arac;
import com.example.SpringMaraton.repository.AracRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AracService {
    @Autowired
    AracRepository aracRepository;
    public Arac aracEkle(Arac arac)
    {
        return aracRepository.save(arac);
    }
    public List<Arac> aracList(){
        return aracRepository.findAll();
    }
}
