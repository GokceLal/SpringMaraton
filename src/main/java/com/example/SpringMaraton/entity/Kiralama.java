package com.example.SpringMaraton.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Kiralama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Arac arac;
    String alisZamani;
    String teslimtarihi;
    @ManyToMany
    @JoinColumn(name="musteri")
    Musteri musteri;




}
