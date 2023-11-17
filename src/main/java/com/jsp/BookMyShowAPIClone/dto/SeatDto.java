package com.jsp.BookMyShowAPIClone.dto;

import com.jsp.BookMyShowAPIClone.enums.SeatType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeatDto {
	
	private long seatId;
	 //seattype
	private SeatType seatType;

}
