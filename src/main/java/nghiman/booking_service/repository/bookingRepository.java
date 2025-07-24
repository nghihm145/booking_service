package nghiman.booking_service.repository;

import nghiman.booking_service.entity.booking;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:07
 */
@Repository
public class bookingRepository {   public List<booking> findAll() {
    return Arrays.asList(
            new booking(1, 1, 1, "Đã xác nhận", 1, "2025-07-20", "2025-07-22", "2025-07-15")
    );
}
}
