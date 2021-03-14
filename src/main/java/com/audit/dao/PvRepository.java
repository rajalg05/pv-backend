package com.audit.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.audit.model.ManPower;

@Repository
public interface PvRepository extends CrudRepository<ManPower, String> {

    public List<ManPower> findAll();
 
    public ManPower save(ManPower manPower);
   
}
