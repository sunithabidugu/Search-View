package com.obrs.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obrs.dto.BookingDTO;
import com.obrs.dto.BusDTO;
import com.obrs.dto.BusServiceDTO;
import com.obrs.entity.ApiResponse;
import com.obrs.entity.Bus;
//import com.obrs.dto.UserDTO;
import com.obrs.service.BookingServiceClient;
import com.obrs.service.BusServiceClient;
import com.obrs.service.SearchAndViewService;
import com.obrs.service.UserServiceClient;



@Service
public class SearchAndViewServiceImpl implements SearchAndViewService{
	// SearchAndViewServiceImpl.java
	
	

	    @Autowired
	    private BusServiceClient busServiceClient; // Bus Service

	    @Autowired
	    private UserServiceClient userServiceClient; //  User Service

	    @Autowired
	    private BookingServiceClient bookingServiceClient; // Booking Service

	    
//	    public List<UserDTO> viewCustomers() {
//	        return userServiceClient.viewCustomers(); // Use Feign client to fetch user data
//	    }

	   
	    public List<BusServiceDTO> viewAllBuses() {
	        return busServiceClient.viewAllBuses(); // Use Feign client to fetch bus data
	    }

	    
	    

	    public List<ApiResponse> viewExistingBookingsWithBusDetails(){
		
	    
	        return bookingServiceClient.viewExistingBookingsWithBusDetails(); // Use Feign client to fetch booking data
	    }

	    
	    public ApiResponse viewBookingDetails(int bookingId){
	        return bookingServiceClient.viewBookingDetails(bookingId); // Use Feign client to fetch booking details
	    }
	    

		
		public List<BusServiceDTO> exploreBuses(String startLocation, String endLocation) {
			List<BusServiceDTO> allBuses = busServiceClient.exploreBuses(startLocation,endLocation);
			return allBuses;
		}
	}


