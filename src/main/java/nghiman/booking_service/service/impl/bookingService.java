package nghiman.booking_service.service.impl;

import nghiman.booking_service.entity.booking;
import nghiman.booking_service.repository.bookingRepository;
import nghiman.booking_service.service.IBookingService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 16:02
 */
@Service
public class bookingService implements IBookingService {
    public bookingService(bookingRepository repository) {
        this.repository = repository;
    }

    private final bookingRepository repository;
    @Override
    public List<booking> getAllBookings() {
        List<booking> bookings = repository.findAll();
        System.out.println("Found " + bookings.size() + " bookings");
        for (booking b : bookings) {
            System.out.println("Booking ID: " + b.getId() + ", Status: " + b.getStatus());
        }
        return bookings;
    }
}


