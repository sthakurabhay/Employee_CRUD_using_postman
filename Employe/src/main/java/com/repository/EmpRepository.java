package com.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import com.model.Emps;
public interface EmpRepository extends CrudRepository<Emps, Integer>
{
	
	
}

