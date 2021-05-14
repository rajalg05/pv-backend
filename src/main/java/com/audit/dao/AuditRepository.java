package com.audit.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.audit.model.Audit;
import com.audit.model.Job;

@Repository
public interface AuditRepository extends CrudRepository<Audit, String> {

    List<Audit> findAll();
 
    Audit save(Audit audit);
   
    void delete(Audit audit);
    
    List<Audit> getAuditByjobId(int id);


}
