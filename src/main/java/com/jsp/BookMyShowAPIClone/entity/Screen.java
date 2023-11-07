package com.jsp.BookMyShowAPIClone.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Screen {
	
	@Id
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
	
	@ManyToOne
	private Theatre theatre;

}
