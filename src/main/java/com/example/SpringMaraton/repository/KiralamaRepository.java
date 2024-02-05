package com.example.SpringMaraton.repository;

import com.example.SpringMaraton.entity.Kiralama;
import com.example.SpringMaraton.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KiralamaRepository extends JpaRepository<Kiralama,Long> {
    List<Kiralama>findByMusteri(Musteri musteri);

}
