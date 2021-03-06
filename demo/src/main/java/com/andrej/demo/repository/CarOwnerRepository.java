package com.andrej.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrej.demo.model.CarOwner;

@Repository
public interface CarOwnerRepository extends JpaRepository< CarOwner, Long> {

}
