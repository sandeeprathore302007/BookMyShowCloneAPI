package com.jsp.BookMyShowAPIClone.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.jsp.BookMyShowAPIClone.enums.Genre;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long movieId;
	private String movieName;
	//genress
	private Genre genre1;
	private Genre genre2;
	private Genre genre3;
	
	private LocalDateTime movieDuration;
	private String Language;
	private String movieDescription;
	
	@ManyToOne
	private ProductionHouse productionHouse;

}
