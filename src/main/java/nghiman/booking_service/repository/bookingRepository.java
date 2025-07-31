package nghiman.booking_service.repository;

import nghiman.booking_service.entity.booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:07
 */
@Repository
public interface bookingRepository extends JpaRepository<booking, Integer> {
}
