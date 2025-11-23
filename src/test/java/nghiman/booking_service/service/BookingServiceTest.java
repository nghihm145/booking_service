package nghiman.booking_service.service;

import nghiman.booking_service.entity.Booking;
import nghiman.booking_service.entity.response.BaseResponse;
import nghiman.booking_service.repository.BookingRepository;
import nghiman.booking_service.repository.CustomerRepository;
import nghiman.booking_service.repository.PhongRepository;
import nghiman.booking_service.service.impl.BookingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author ManNghi
 * @since 05/10/2025 - 15:42
 */
class BookingServiceTest {

    @Mock
    private BookingRepository bookingRepository;

    @Mock
    private PhongRepository phongRepository;

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private BookingService bookingService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // ✅ Test getAllBookings()
    @Test
    void testGetAllBookings() {
        Booking booking1 = new Booking();
        Booking booking2 = new Booking();
        when(bookingRepository.findAll()).thenReturn(Arrays.asList(booking1, booking2));

        List<Booking> bookings = bookingService.getAllBookings();

        assertEquals(2, bookings.size());
        verify(bookingRepository, times(1)).findAll();
    }

    // ✅ Test createNewBooking() - phong & customer exist
    @Test
    void testCreateNewBooking_Success() {
        Booking request = new Booking();
        request.setIdPhong(1);
        request.setIdCustomer(2);
        request.setStatus("PENDING");
        request.setDateBooking(LocalDate.now());

        when(phongRepository.existsById(1)).thenReturn(true);
        when(customerRepository.existsById(2)).thenReturn(true);
        when(bookingRepository.save(any(Booking.class))).thenReturn(request);

        ResponseEntity<BaseResponse> response = bookingService.createNewBooking(request);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Booking thanh cong", response.getBody().getMessage());
        assertEquals(HttpStatus.CREATED.toString(), response.getBody().getCode());
    }

    // ❌ Test createNewBooking() - idPhong invalid
    @Test
    void testCreateNewBooking_InvalidPhong() {
        Booking request = new Booking();
        request.setIdPhong(99);
        request.setIdCustomer(2);

        when(phongRepository.existsById(99)).thenReturn(false);

        ResponseEntity<BaseResponse> response = bookingService.createNewBooking(request);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("IdPhong khong hop le", response.getBody().getMessage());
        assertEquals(HttpStatus.BAD_REQUEST.toString(), response.getBody().getCode());
    }

    // ❌ Test createNewBooking() - idCustomer invalid
    @Test
    void testCreateNewBooking_InvalidCustomer() {
        Booking request = new Booking();
        request.setIdPhong(1);
        request.setIdCustomer(99);

        when(phongRepository.existsById(1)).thenReturn(true);
        when(customerRepository.existsById(99)).thenReturn(false);

        ResponseEntity<BaseResponse> response = bookingService.createNewBooking(request);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("IdCustomer khong hop le", response.getBody().getMessage());
        assertEquals(HttpStatus.BAD_REQUEST.toString(), response.getBody().getCode());
    }

    // ✅ Test update()
    @Test
    void testUpdateBookingStatus() {
        Integer bookingId = 5;
        String newStatus = "CANCELED";

        bookingService.update(bookingId, newStatus);

        verify(bookingRepository, times(1)).updateBookingStatus(bookingId, newStatus);
    }
}
