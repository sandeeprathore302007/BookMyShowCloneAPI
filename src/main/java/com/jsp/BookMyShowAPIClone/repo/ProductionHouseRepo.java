package com.jsp.BookMyShowAPIClone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.BookMyShowAPIClone.entity.ProductionHouse;
public interface ProductionHouseRepo extends JpaRepository<ProductionHouse,Long> {
	

}
