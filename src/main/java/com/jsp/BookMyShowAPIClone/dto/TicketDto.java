package com.jsp.BookMyShowAPIClone.dto;

import com.jsp.BookMyShowAPIClone.enums.TicketStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketDto {
	private long ticketId;
	private double ticketPrice;
	// TicketStatus
	private TicketStatus ticketStatus;

}
