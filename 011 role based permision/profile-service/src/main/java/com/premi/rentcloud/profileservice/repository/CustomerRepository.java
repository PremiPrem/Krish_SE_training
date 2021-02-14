package com.premi.rentcloud.profileservice.repository;

import com.premi.rentcloud.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}