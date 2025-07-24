package nghiman.booking_service.repository;

import nghiman.booking_service.entity.customer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:46
 */
@Repository
public class customerRepository {
    public List<customer> findAll() {
        return Arrays.asList(
                new customer(1, "Nguyen Van A", "1995-05-12", "Male", "0909123456", "012345678901", "TP.HCM")
        );
    }
}
