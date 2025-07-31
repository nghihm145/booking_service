package nghiman.booking_service.service;

import nghiman.booking_service.entity.customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 16:03
 */

public interface ICustomerService {
    List<customer> getAllCustomers();
}

