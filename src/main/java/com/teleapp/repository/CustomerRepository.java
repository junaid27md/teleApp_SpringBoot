package com.teleapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.teleapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}
