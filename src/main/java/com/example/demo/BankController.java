package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
@Autowired
BankService bankser;
@PostMapping(value="/addAll")
public String adddetails(@RequestBody List<Bank> b) {
	return bankser.adddetails(b);
}
@GetMapping(value="/get/{num}")
public String getdetails(@PathVariable String num) {
	return bankser.getdetails(num);
}

}
