package com.jsp.BookMyShowAPIClone.dto;

import java.time.LocalDateTime;

import com.jsp.BookMyShowAPIClone.enums.Genre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDto {
	
	private long movieId;
	private String  movieName;
//	genress
	private Genre genre1;
	private Genre genre2;
	private Genre genre3;
	
	private LocalDateTime movieDuration;
	private String Language;
	private String movieDescription;

}
