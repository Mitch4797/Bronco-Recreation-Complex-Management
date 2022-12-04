package com.cpp.Brcm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.Visit;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Integer> {

}
