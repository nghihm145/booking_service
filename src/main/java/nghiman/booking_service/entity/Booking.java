package nghiman.booking_service.entity;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:43
 */
//public class Booking {
//    private int id;
//
//    public Booking(int id, int phongId, int customerId, String status, int soLuongNguoi, String dateCheckin, String dateCheckout, String dateBooking) {
//        this.id = id;
//        this.phongId = phongId;
//        this.customerId = customerId;
//        this.status = status;
//        this.soLuongNguoi = soLuongNguoi;
//        this.dateCheckin = dateCheckin;
//        this.dateCheckout = dateCheckout;
//        this.dateBooking = dateBooking;
//    }
//
//    private int phongId;
//    private int customerId;
//    private String status;
//    private int soLuongNguoi;
//    private String dateCheckin;
//    private String dateCheckout;
//    private String dateBooking;
//
//}
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "Booking")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_phong")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private Phong Phong;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "customer_id")
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    private Customer Customer;

    private String status;

    @Column(name = "so_luong_nguoi")
    private Integer soLuongNguoi;

    @Column(name = "date_checkin")
    private LocalDate dateCheckin;

    @Column(name = "date_checkout")
    private LocalDate dateCheckout;

    @Column(name = "date_booking")
    private LocalDate dateBooking;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "id_phong")
    private Integer idPhong;

    @Column(name = "customer_id")
    private Integer idCustomer;
}



