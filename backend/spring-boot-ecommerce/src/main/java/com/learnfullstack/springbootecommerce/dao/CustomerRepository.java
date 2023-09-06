package com.learnfullstack.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnfullstack.springbootecommerce.entity.Customer;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface CustomerRepository extends JpaRepository <Customer, Long> {
  
  Customer findByEmail (String theEmail);

}
