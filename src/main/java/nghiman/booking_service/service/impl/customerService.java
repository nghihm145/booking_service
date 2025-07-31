package nghiman.booking_service.service.impl;

import nghiman.booking_service.entity.customer;
import nghiman.booking_service.repository.customerRepository;
import nghiman.booking_service.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:46
 */
@Service
public class customerService implements ICustomerService {
    public customerService(customerRepository repository) {
        this.repository = repository;
    }

    private final customerRepository repository;


    @Override
    public List<customer> getAllCustomers() {
        return repository.findAll();
    }
}
