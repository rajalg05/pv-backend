package com.audit.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.audit.model.Resource;

@Repository
public interface ResourceRepository extends CrudRepository<Resource, String> {

    List<Resource> findAll();
 
    Resource save(Resource resource);
    
    void delete(Resource resource);
}
