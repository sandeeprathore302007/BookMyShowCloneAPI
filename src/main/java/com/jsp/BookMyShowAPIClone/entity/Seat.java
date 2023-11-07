package com.jsp.BookMyShowAPIClone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long seatId;
 //seattype
 @ManyToOne
 private Screen screen;
}
