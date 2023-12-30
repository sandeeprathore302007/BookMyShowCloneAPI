package com.jsp.BookMyShowAPIClone.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.BookMyShowAPIClone.entity.ProductionHouse;
import com.jsp.BookMyShowAPIClone.repo.ProductionHouseRepo;

@Repository
public class ProductionHouseDao {
	@Autowired
	private ProductionHouseRepo houseRepo;

	public ProductionHouse saveProductionHouse(ProductionHouse house) {
		// TODO Auto-generated method stub
		return houseRepo.save(house);
	}
	
	 
	
	

}
