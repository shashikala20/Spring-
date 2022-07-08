package com.simpleProject.RestfulApi.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.simpleProject.RestfulApi.entity.Employee;

@Repository
public interface Repo extends MongoRepository<Employee, Integer> {

}
