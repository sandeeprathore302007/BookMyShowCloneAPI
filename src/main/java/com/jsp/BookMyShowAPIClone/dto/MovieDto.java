package com.jsp.BookMyShowAPIClone.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieDto {
	
	private long movieId;
	private String  movieName;
//	genress
	private LocalDateTime movieDuration;
	private String Language;
	private String movieDescription;

}
