package com.example.SpringMaraton.repository;

import com.example.SpringMaraton.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusteriRepository extends JpaRepository<Musteri,Long> {
}
