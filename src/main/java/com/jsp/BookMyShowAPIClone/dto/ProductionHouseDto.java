package com.jsp.BookMyShowAPIClone.dto;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductionHouseDto {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		private long productionId;
		private  String productionName;
		private LocalDate establishment;

}
