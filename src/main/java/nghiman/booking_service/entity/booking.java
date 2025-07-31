package nghiman.booking_service.entity;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:43
 */
//public class booking {
//    private int id;
//
//    public booking(int id, int phongId, int customerId, String status, int soLuongNguoi, String dateCheckin, String dateCheckout, String dateBooking) {
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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "booking")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_phong")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private phong phong;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private customer customer;

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

    // Getters, Setters, Constructors
}



