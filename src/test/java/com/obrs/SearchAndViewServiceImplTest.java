
package com.obrs;
import static org.mockito.Mockito.*;

import com.obrs.controller.SearchAndViewController;
import com.obrs.dto.BusServiceDTO;
import com.obrs.entity.ApiResponse;
import com.obrs.service.BookingServiceClient;
import com.obrs.service.BusServiceClient;
import com.obrs.serviceImpl.SearchAndViewServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SearchAndViewServiceImplTest {

    @Mock
    private BusServiceClient busServiceClient;
    
    @Mock
    private SearchAndViewController searchAndViewController;

    @Mock
    private BookingServiceClient bookingServiceClient;

    @InjectMocks
    private SearchAndViewServiceImpl searchAndViewServiceImpl;

    @Test
    void testViewAllBuses() {
        // Arrange
        List<BusServiceDTO> expectedBuses = Arrays.asList(
                new BusServiceDTO(1L, "Start1", "End1", 50, LocalDateTime.of(2023, 9, 4, 10, 0), LocalDateTime.of(2023, 9, 4, 14, 0)),
                new BusServiceDTO(2L, "Start2", "End2", 40, LocalDateTime.of(2023, 9, 5, 9, 0), LocalDateTime.of(2023, 9, 5, 13, 0))
        );
        when(busServiceClient.viewAllBuses()).thenReturn(expectedBuses);

        // Act
        List<BusServiceDTO> actualBuses = searchAndViewServiceImpl.viewAllBuses();

        // Assert
        assertEquals(expectedBuses, actualBuses);
    }
    
//    @Test
//    public void testExploreBuses() {
//        // Arrange
//        String startLocation = "Start1";
//        String endLocation = "End1";
//        List<BusServiceDTO> buses = new ArrayList<>();
//        // Populate the list with test data
//        buses.add(new BusServiceDTO(1L, "Start1", "End1", 50, LocalDateTime.of(2023, 9, 4, 10, 0), LocalDateTime.of(2023, 9, 4, 14, 0)));
//        buses.add(new BusServiceDTO(2L, "Start2", "End2", 40, LocalDateTime.of(2023, 9, 5, 9, 0), LocalDateTime.of(2023, 9, 5, 13, 0)));
//        
//        // Mock the service method to return the test data
//        searchAndViewServiceImpl = mock(SearchAndViewServiceImpl.class);
//
//        when(searchAndViewServiceImpl.exploreBuses(startLocation, endLocation)).thenReturn(buses);
//        
//        // Act
//        ResponseEntity<List<BusServiceDTO>> response = searchAndViewController.exploreBuses(startLocation, endLocation);
//        
//        // Assert
//        verify(searchAndViewServiceImpl, times(1)).exploreBuses(startLocation, endLocation); // Ensure the service method was called
//        assertEquals(HttpStatus.OK, response.getStatusCode()); // Check the response status code
//        assertEquals(buses, response.getBody()); // Check the response body
//    }


}
