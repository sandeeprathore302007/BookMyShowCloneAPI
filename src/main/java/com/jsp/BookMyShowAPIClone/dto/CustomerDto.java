package com.jsp.BookMyShowAPIClone.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
	private long customerId;
	private String customerName;
	private long customerPhone;
	private String customerEmail;
	private String customerPassword;

}
