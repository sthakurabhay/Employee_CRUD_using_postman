package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Emps
{
//Defining book id as primary key
@Id
@Column
private int empid;
@Column
private String empname;
@Column
private String empaddress;
@Column
private int empsal;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpaddress() {
	return empaddress;
}
public void setEmpaddress(String empaddress) {
	this.empaddress = empaddress;
}
public int getEmpsal() {
	return empsal;
}
public void setEmpsal(int empsal) {
	this.empsal = empsal;
}

}