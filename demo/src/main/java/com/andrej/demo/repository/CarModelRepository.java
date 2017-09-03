package com.andrej.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrej.demo.model.CarModel;
@Repository
public interface CarModelRepository extends JpaRepository<CarModel, Long>{

}
