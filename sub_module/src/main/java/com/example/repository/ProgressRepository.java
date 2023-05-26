package com.example.repository;

import com.example.model.ProgressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressRepository extends JpaRepository<ProgressEntity, Long> {
}
