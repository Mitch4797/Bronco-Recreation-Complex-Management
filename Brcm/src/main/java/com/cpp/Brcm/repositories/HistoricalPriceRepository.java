package com.cpp.Brcm.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.HistoricalPrice;

@Repository
public interface HistoricalPriceRepository extends CrudRepository<HistoricalPrice, Integer>{

}
