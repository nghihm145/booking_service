package nghiman.booking_service.service.impl;

import nghiman.booking_service.entity.Customer;
import nghiman.booking_service.entity.response.BaseResponse;
import nghiman.booking_service.entity.response.CreateResponse;
import nghiman.booking_service.repository.CustomerRepository;
import nghiman.booking_service.service.ICustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:46
 */
@Service
public class CustomerService implements ICustomerService {
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public ResponseEntity<BaseResponse> createNewCustomer(Customer customerReq) {

        // TODO: validate by SDT or CCCD
//        boolean idCustomerExisted = customerRepository.existsById(customerReq.getId());
//
//        if (idCustomerExisted) {
//            BaseResponse baseResponse = BaseResponse.builder()
//                    .code(HttpStatus.BAD_REQUEST.toString())
//                    .message("Customer da ton tai")
//                    .build();
//            return ResponseEntity.ok(baseResponse);
//        }


        customerRepository.save(customerReq);

        CreateResponse baseResponse = CreateResponse.builder()
                .code(HttpStatus.CREATED.toString())
                .message("Tao moi thanh cong")
                .test( "ahihi")
                .build();
        return ResponseEntity.ok(baseResponse);

    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}

