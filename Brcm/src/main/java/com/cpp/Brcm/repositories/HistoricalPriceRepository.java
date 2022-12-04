package com.cpp.Brcm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.HistoricalPrice;

@Repository
public interface HistoricalPriceRepository extends JpaRepository<HistoricalPrice, Integer>{

}
