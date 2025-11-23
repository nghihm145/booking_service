package nghiman.booking_service.controller;

import nghiman.booking_service.entity.Booking;
import nghiman.booking_service.entity.response.BaseResponse;
import nghiman.booking_service.service.IBookingService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:08
 */
@RestController
@RequestMapping("/booking")
public class BookingController {
    public BookingController(IBookingService bookingService) {
        this.bookingService = bookingService;
    }

    private final IBookingService bookingService;

    @GetMapping("/get-all-booking")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PostMapping
    public ResponseEntity<BaseResponse> createNewBooking(@RequestBody Booking bookingReq) {
        return bookingService.createNewBooking(bookingReq);
    }

    @PostMapping("/update")
    public void updateBooking(@RequestParam("bookingId") Integer id, @RequestParam("bookingStatus") String status) {
        bookingService.update(id, status);
    }
}
