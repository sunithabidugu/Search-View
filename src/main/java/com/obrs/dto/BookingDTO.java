package com.obrs.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
*/
//@Builder

public class BookingDTO {
	
	 
	 private int bookingId;
	 
	 private String selectTime;
	 
	 private String selectDate;
	 
	 private String busType;
	 
	 private Long busId;
	 
	 // private String bookingPersonName;
	 
	 @Transient
	 private List<BusDTO> bus = new ArrayList<>()  ;
 
	 @Transient
	 private List<Customer> customer = new ArrayList<>() ;

	public BookingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingDTO(int bookingId, String selectTime, String selectDate, String busType, Long busId, List<BusDTO> bus,
			List<Customer> customer) {
		super();
		this.bookingId = bookingId;
		this.selectTime = selectTime;
		this.selectDate = selectDate;
		this.busType = busType;
		this.busId = busId;
		this.bus = bus;
		this.customer = customer;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getSelectTime() {
		return selectTime;
	}

	public void setSelectTime(String selectTime) {
		this.selectTime = selectTime;
	}

	public String getSelectDate() {
		return selectDate;
	}

	public void setSelectDate(String selectDate) {
		this.selectDate = selectDate;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public Long getBusId() {
		return busId;
	}

	public void setBusId(Long busId) {
		this.busId = busId;
	}

	public List<BusDTO> getBus() {
		return bus;
	}

	public void setBus(List<BusDTO> bus) {
		this.bus = bus;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
 

	 
	 
}
