package com.cpp.Brcm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
