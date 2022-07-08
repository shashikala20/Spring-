package com.restful.RestfulProject.contoller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.RestfulProject.entity.Employee;
import com.restful.RestfulProject.repo.Repo;  
@RestController  
public class HelloWorldController   
{  
@Autowired
Repo repo;  
@GetMapping("/Employees")
public List<Employee> allEmployee() 
{
	List<Employee> list=new ArrayList<>();
	Iterator<Employee> it=repo.findAll().iterator();
	while(it.hasNext()) {
		list.add(it.next());
	}
	return list;
	
}
@GetMapping("/Employee/{id}")
public Employee getEmployee(@PathVariable Integer id) {
	return repo.findById(id).get();
}
@PostMapping("/addEmployee")
public void addEmployee(@RequestBody Employee employee) {
	repo.save(employee);
}
@PutMapping("/updateEmployee")
public void updateEmployee(@RequestBody Employee employee) {
	repo.save(employee);
}  
@DeleteMapping("/DeleteEmployee")
public void deleteEmployee(Integer id) {
	repo.deleteById(id);

}

}