package nghiman.booking_service.service;

import nghiman.booking_service.entity.Customer;
import nghiman.booking_service.entity.response.BaseResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 16:03
 */

public interface ICustomerService {
    List<Customer> getAllCustomers();

    ResponseEntity<BaseResponse> createNewCustomer(Customer customerReq);

    Customer createCustomer(Customer customer);
}

