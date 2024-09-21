package com.example.cardetailsretriever.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cardetailsretriever.entity.Car;
 
@Repository
public interface CarRepository extends JpaRepository<Car,Long>
{
   
}  
