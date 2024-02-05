package com.example.SpringMaraton.service;

import com.example.SpringMaraton.entity.Kiralama;
import com.example.SpringMaraton.repository.KiralamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KiralamaService {
    @Autowired
    KiralamaRepository kiralamaRepository;
    public Kiralama aracKiralama(Kiralama kiralama)
    {
        return kiralamaRepository.save(kiralama);
    }

    public List<Kiralama> kiralamaList(){
        return kiralamaRepository.findAll();
    }
}
