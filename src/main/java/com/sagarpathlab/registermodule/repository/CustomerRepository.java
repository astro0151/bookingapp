package com.sagarpathlab.registermodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagarpathlab.registermodule.entity.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {

//	do nothing
}
