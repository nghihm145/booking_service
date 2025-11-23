package nghiman.booking_service.repository;

import nghiman.booking_service.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:46
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
