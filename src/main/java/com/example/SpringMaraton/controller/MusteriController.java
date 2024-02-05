package com.example.SpringMaraton.controller;

import com.example.SpringMaraton.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/musteri")
public class MusteriController {
    @Autowired
    MusteriService musteriService;

}
