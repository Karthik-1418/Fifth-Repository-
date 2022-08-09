package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
@Autowired
BankDao bankDao;
public String adddetails(List<Bank> b) {
	return bankDao.adddetails(b);
}
public String getdetails(String num){
	return bankDao.getdetails(num);
}

}
