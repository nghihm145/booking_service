package nghiman.booking_service.repository;

import nghiman.booking_service.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:46
 */
@Repository
public interface customerRepository extends JpaRepository<customer, Integer> {
}
