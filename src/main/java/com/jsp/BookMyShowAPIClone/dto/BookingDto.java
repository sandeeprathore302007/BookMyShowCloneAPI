package com.jsp.BookMyShowAPIClone.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDto {
	private long bookingId;
	private LocalDateTime bookingFromTime;
	private LocalDateTime bookingTillTime;
	private long seatId;
	// bookingStatus
	private double seatPrice;


}
