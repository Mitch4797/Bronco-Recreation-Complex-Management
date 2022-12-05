package com.cpp.Brcm.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.Visit;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Integer> {

}
