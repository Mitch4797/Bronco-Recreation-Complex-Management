package com.cpp.Brcm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.Activity;

@Repository
public interface ActivityVisitRepository extends JpaRepository<Activity, Integer> {

}
