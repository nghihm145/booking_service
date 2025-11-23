package nghiman.booking_service.repository;

import jakarta.transaction.Transactional;
import nghiman.booking_service.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:07
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE booking SET status = :status WHERE booking_id = :bookingId", nativeQuery = true)
    void updateBookingStatus(@Param("bookingId") Integer bookingId, @Param("status") String status);
}
