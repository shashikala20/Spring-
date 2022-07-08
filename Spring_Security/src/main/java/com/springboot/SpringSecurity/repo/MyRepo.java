package com.springboot.SpringSecurity.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.springboot.SpringSecurity.entity.UserData;
@Repository
public interface MyRepo extends MongoRepository<UserData, Integer> {
UserData findByUsername(String username);







}
