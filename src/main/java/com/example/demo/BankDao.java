package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankDao {
@Autowired
BankRepository bankrep;
public String adddetails(List<Bank> b) {
	bankrep.saveAll(b);
	return "Added successfully";
	
}
public String getdetails(String num) {
	return bankrep.getvalue(num);
}
}
