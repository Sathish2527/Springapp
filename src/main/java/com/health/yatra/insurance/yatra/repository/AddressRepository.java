package com.health.yatra.insurance.yatra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health.yatra.insurance.yatra.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	

}
