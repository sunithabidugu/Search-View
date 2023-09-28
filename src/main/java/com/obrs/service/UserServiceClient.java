package com.obrs.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//import com.obrs.dto.UserDTO;

@FeignClient(name="user-service")
public interface UserServiceClient {
	
	//@GetMapping("/explore-customers")
	//List<UserDTO> viewCustomers();

}
