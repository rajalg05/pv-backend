package com.audit.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.audit.model.Job;
import com.audit.repository.JobRepository;

@Repository
public abstract class JobRepositoryImpl implements JobRepository {

	@Override
	@Query("SELECT * FROM Job j JOIN WHERE  = 1")
	public List<Job> findAllJobsForUser(Long userId) {
		
		return null;
	}


   
}
