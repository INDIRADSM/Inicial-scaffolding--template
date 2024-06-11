package com.example.scafolding__tamplate.respositories;

import com.example.scafolding__tamplate.entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DummyRepository extends JpaRepository<DummyEntity,Long> {
}
