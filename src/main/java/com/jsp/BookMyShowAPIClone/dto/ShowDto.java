package com.jsp.BookMyShowAPIClone.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ShowDto {
	private long showId;
    private LocalDateTime ShowStartTime;
    private LocalDateTime ShowEndTime;
   //show status
    private String showLocation;
    
    private long movieId;
    private long movieName;
    //genre
    private String genre;
    private LocalDateTime movieDuration;
    private String movieDescription;
    private String movieLanguage;
    
    private long screenId;
    private String screenName;
    private double classicSeatPrice;
    private double goldSeatPrice;
    private double premiumSeatPrice;

}
