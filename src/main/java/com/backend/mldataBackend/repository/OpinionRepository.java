package com.backend.mldataBackend.repository;

import com.backend.mldataBackend.model.Opinion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpinionRepository
        extends JpaRepository<Opinion, Long> {
}
