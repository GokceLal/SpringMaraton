package com.example.SpringMaraton.service;

import com.example.SpringMaraton.entity.Musteri;
import com.example.SpringMaraton.repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusteriService {
    @Autowired
    MusteriRepository musteriRepository;

    public Musteri musteriEkle(Musteri musteri){
        return musteriRepository.save(musteri);
    }

    public List<Musteri> tumMusteriler(){
        return musteriRepository.findAll();
    }
}
