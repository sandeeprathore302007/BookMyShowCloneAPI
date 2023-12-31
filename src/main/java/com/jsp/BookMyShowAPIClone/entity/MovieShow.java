package com.jsp.BookMyShowAPIClone.entity;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

 
import com.jsp.BookMyShowAPIClone.enums.ShowStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MovieShow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long showId;
    private LocalDateTime ShowStartTime;
    private LocalDateTime ShowEndTime;
   //show status
    private ShowStatus showStatus;
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
    
    @ManyToOne
    private Theatre theatre;
    
    
    
    
}
