package com.jsp.BookMyShowAPIClone.dto;

import java.util.List;

import javax.persistence.OneToMany;

import com.jsp.BookMyShowAPIClone.entity.Seat;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ScreenDto {
	
	private long screenId;
	private String screenName;
	// screen type
	// screenAvailability
	// screen status
	@OneToMany
	private List<Seat> seats;
	private int noOfClassicSeat;
	private int noOfPlatinumSeat;
	private int noOfGoldSeat;

}
