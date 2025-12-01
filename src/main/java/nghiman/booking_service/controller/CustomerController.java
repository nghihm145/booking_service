package nghiman.booking_service.controller;

import nghiman.booking_service.entity.customer;
import nghiman.booking_service.service.ICustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:44
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    private final ICustomerService customerService;

        @GetMapping("/get-all-customer")
        public List<customer> getAllCustomers() {
            return customerService.getAllCustomers();
        }
    }
