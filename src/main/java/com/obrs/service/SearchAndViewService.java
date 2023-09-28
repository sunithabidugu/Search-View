package com.obrs.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.obrs.dto.BookingDTO;
import com.obrs.dto.BusDTO;
import com.obrs.dto.BusServiceDTO;
//import com.obrs.dto.UserDTO;
import com.obrs.entity.ApiResponse;


public interface SearchAndViewService {
	//List<UserDTO> viewCustomers();
    List<BusServiceDTO> viewAllBuses();
    List<BusServiceDTO> exploreBuses(String startLocation,String endLocation);
    public List<ApiResponse> viewExistingBookingsWithBusDetails();
	public ApiResponse viewBookingDetails(int bookingId);
}
