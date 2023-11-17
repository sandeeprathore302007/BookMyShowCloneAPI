package com.jsp.BookMyShowAPIClone.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	private LocalDateTime bookingFromTime;
	private LocalDateTime bookingTillTime;
	private long seatId;
	//SeatType
	// bookingStatus
	
	private double seatPrice;
	

}
