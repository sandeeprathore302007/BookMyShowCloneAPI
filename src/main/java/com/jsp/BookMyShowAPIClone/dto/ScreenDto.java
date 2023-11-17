package com.jsp.BookMyShowAPIClone.dto;

 
import com.jsp.BookMyShowAPIClone.enums.ScreenAvailability;
import com.jsp.BookMyShowAPIClone.enums.ScreenStatus;
import com.jsp.BookMyShowAPIClone.enums.ScreenType;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ScreenDto {
	
	private long screenId;
	private String screenName;
	// screen type
	private ScreenType screenType;
	
	// screenAvailability
	private ScreenAvailability availability;
	
	// screen status
	private ScreenStatus screenStatus;
	 
	private int noOfClassicSeat;
	private int noOfPlatinumSeat;
	private int noOfGoldSeat;

}
