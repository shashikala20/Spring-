package com.restful.RestfulProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.RestfulProject.entity.Employee;

public interface Repo extends JpaRepository<Employee, Integer>{

}
