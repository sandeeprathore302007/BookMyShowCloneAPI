package com.jsp.BookMyShowAPIClone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.BookMyShowAPIClone.dto.ProductionHouseDto;
import com.jsp.BookMyShowAPIClone.entity.Owner;
import com.jsp.BookMyShowAPIClone.entity.ProductionHouse;
import com.jsp.BookMyShowAPIClone.service.ProductionHouseService;
import com.jsp.BookMyShowAPIClone.util.ResponseStructure;

@RestController
@RequestMapping("/house")
public class ProductionHouseController {
	@Autowired
	private ProductionHouseService service;

	@PostMapping
	public ResponseEntity<ResponseStructure<ProductionHouse>> saveProductionHouse(@RequestParam long ownerId,
			@RequestBody ProductionHouseDto houseDto) {
		return service.saveProductionHouse(ownerId, houseDto);
	}

}
