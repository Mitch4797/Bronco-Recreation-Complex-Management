package com.cpp.Brcm.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cpp.Brcm.models.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{

}
