package nghiman.booking_service.service;

import nghiman.booking_service.entity.booking;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:46
 */
@Service
public interface IBookingService {
        List<booking> getAllBookings();
    }

