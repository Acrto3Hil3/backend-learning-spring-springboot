package com.utkarsh01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh01.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

}
