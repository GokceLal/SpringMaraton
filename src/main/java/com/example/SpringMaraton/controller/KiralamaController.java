package com.example.SpringMaraton.controller;

import com.example.SpringMaraton.service.KiralamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kiralama")
public class KiralamaController {
    @Autowired
    KiralamaService kiralamaService;
}
