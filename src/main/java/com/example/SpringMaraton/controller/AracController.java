package com.example.SpringMaraton.controller;

import com.example.SpringMaraton.entity.Arac;
import com.example.SpringMaraton.service.AracService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/araclar")
public class AracController {
    @Autowired
    AracService aracService;

    @PostMapping
    public Arac aracEkle (@RequestBody Arac arac){
        return aracService.aracEkle(arac);
    }

    @GetMapping
    public List<Arac> aracList(){
        return aracService.aracList();
    }
}
