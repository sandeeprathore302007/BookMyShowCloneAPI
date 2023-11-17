package com.jsp.BookMyShowAPIClone.dto;

import java.time.LocalDateTime;

import com.jsp.BookMyShowAPIClone.enums.BookingStatus;
import com.jsp.BookMyShowAPIClone.enums.SeatType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDto {
	private long bookingId;
	private LocalDateTime bookingFromTime;
	private LocalDateTime bookingTillTime;
	private long seatId;
	//SeatType
	private SeatType seatType;
	
	// bookingStatus
	private BookingStatus bookingStatus;
	private double seatPrice;


}
