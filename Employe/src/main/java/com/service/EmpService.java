package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.model.Emps;
import com.repository.EmpRepository;

@Service
public class EmpService {

@Autowired
EmpRepository empsRepository;
//getting all books record by using the method findaAll() of CrudRepository
public List<Emps> getAllEmps() 
{
List<Emps> emps = new ArrayList<Emps>();
empsRepository.findAll().forEach(emps1 -> emps.add(emps1));
return emps;
}
//getting a specific record by using the method findById() of CrudRepository
public Emps getEmpsById(int id) 
{
return empsRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Emps emps) 
{
empsRepository.save(emps);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
empsRepository.deleteById(id);
}
//updating a record
public void update(Emps emps, int empid) 
{
empsRepository.save(emps);
}

}
