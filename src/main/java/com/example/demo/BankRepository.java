package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BankRepository extends JpaRepository<Bank,Integer> {
	
@Query(value="select branch from bank_info where ifsccode=:num",nativeQuery=true)
public String getvalue(@Param("num") String num);

}
