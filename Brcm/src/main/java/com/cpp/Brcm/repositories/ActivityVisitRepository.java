package com.cpp.Brcm.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.Activity;

@Repository
public interface ActivityVisitRepository extends CrudRepository<Activity, Integer> {

}
