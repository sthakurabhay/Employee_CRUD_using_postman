package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.model.Emps;
import com.service.EmpService;
//mark class as Controller
@RestController
public class EmpController 
{
//autowired the EmpService class
@Autowired
EmpService empService;
//creating a get mapping that retrieves all the emps detail from the database 
@GetMapping("/emp")
private List<Emps> getAllEmps() 
{
return empService.getAllEmps();
}
//creating a get mapping that retrieves the detail of a specific emp
@GetMapping("/emp/{empid}")
private Emps getEmps(@PathVariable("empid") int empid) 
{
return empService.getEmpsById(empid);
}
//creating a delete mapping that deletes a specified emp
@DeleteMapping("/emp/{empid}")
private void deleteEmp(@PathVariable("empid") int empid) 
{
empService.delete(empid);
}
//creating post mapping that post the emp detail in the database
@PostMapping("/emps")
private int saveEmp(@RequestBody Emps emps) 
{
empService.saveOrUpdate(emps);
return emps.getEmpid();
}
//creating put mapping that updates the emp detail 
@PutMapping("/emps")
private Emps update(@RequestBody Emps emps) 
{
empService.saveOrUpdate(emps);
return emps;
}
}
