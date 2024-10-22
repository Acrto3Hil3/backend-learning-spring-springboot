package com.utkarsh01.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh01.entity.MyOwnUser;

public interface UserRepository extends JpaRepository<MyOwnUser, Integer> {
	Optional<MyOwnUser> findByUsername(String un);
}
