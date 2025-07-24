package nghiman.booking_service.controller;

import nghiman.booking_service.entity.booking;
import nghiman.booking_service.service.IBookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:08
 */
@RestController
@RequestMapping("/booking")
public class bookingController {
    public bookingController(IBookingService bookingService) {
        this.bookingService = bookingService;
    }

    private final IBookingService bookingService;

    @GetMapping("/get-all-booking")
    public List<booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

}
