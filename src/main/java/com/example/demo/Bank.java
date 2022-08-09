package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_info")
public class Bank {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private int id;
private String ifsccode;
private String branch;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIfsccode() {
	return ifsccode;
}
public void setIfsccode(String ifsccode) {
	this.ifsccode = ifsccode;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}

}
