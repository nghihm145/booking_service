package nghiman.booking_service.service;

import nghiman.booking_service.entity.Booking;
import nghiman.booking_service.entity.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:46
 */
@Service
public interface IBookingService {
        List<Booking> getAllBookings();

    ResponseEntity<BaseResponse> createNewBooking(Booking bookingReq);

        void update(Integer id, String status);

    }

