package nghiman.booking_service.controller;

import nghiman.booking_service.entity.Customer;
import nghiman.booking_service.entity.response.BaseResponse;
import nghiman.booking_service.service.ICustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        @GetMapping("/get-all-Customer")
        public List<Customer> getAllCustomers() {
            return customerService.getAllCustomers();
        }

        @PostMapping("/create-new-customer")
        public ResponseEntity<BaseResponse> createNewCustomer(@RequestBody Customer customerReq){
            return customerService.createNewCustomer(customerReq);
        }

        @PostMapping("/create-new-user")
        public Customer createCustomer(@RequestBody Customer customer){
            return customerService.createCustomer(customer);
        }
    }

