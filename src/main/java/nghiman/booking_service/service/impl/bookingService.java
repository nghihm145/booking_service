package nghiman.booking_service.service.impl;

import nghiman.booking_service.entity.booking;
import nghiman.booking_service.repository.bookingRepository;
import nghiman.booking_service.service.IBookingService;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 16:02
 */
public class bookingService implements IBookingService {
    private final bookingRepository repository = new bookingRepository();
    @Override
    public List<booking> getAllBookings() {
        return repository.findAll();
    }
}


