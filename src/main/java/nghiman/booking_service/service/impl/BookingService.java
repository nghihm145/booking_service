package nghiman.booking_service.service.impl;

import nghiman.booking_service.entity.Booking;
import nghiman.booking_service.entity.response.BaseResponse;
import nghiman.booking_service.repository.BookingRepository;
import nghiman.booking_service.repository.CustomerRepository;
import nghiman.booking_service.repository.PhongRepository;
import nghiman.booking_service.service.IBookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 16:02
 */
@Service
public class BookingService implements IBookingService {
    private final BookingRepository bookingRepository;
    private final PhongRepository phongRepository;
    private final CustomerRepository customerRepository;

    public BookingService(BookingRepository bookingRepository, PhongRepository phongRepository, CustomerRepository customerRepository) {
        this.bookingRepository = bookingRepository;
        this.phongRepository = phongRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Booking> getAllBookings() {
        List<Booking> bookings = bookingRepository.findAll();
        System.out.println("Found " + bookings.size() + " bookings");
        return bookings;
    }

    @Override
    public ResponseEntity<BaseResponse> createNewBooking(Booking bookingReq) {
        // validate idPhong
        boolean idPhongExisted = phongRepository.existsById(bookingReq.getIdPhong());

        if (!idPhongExisted) {
            BaseResponse baseResponse = BaseResponse.builder()
                    .code(HttpStatus.BAD_REQUEST.toString())
                    .message("IdPhong khong hop le")
                    .build();
            return ResponseEntity.ok(baseResponse);
        }

        // validate idCustomer
        boolean idCustomerExisted = customerRepository.existsById(bookingReq.getIdCustomer());

        if (!idCustomerExisted) {
            BaseResponse baseResponse = BaseResponse.builder()
                    .code(HttpStatus.BAD_REQUEST.toString())
                    .message("IdCustomer khong hop le")
                    .build();
            return ResponseEntity.ok(baseResponse);
        }

        Booking booking = bookingRepository.save(bookingReq);
        return ResponseEntity.ok(BaseResponse.builder()
                .code(HttpStatus.CREATED.toString())
                .message("Booking thanh cong the fuck")
                .build());
    }

    @Override
    public void update(Integer id, String status) {
        bookingRepository.updateBookingStatus(id, status);
    }
}


