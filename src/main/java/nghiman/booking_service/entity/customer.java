package nghiman.booking_service.entity;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:45
 */
//public class customer {
//    private int id;
//    private String name;
//    private String dateOfBirth;
//    private String gender;
//
//    public customer(int id, String name, String dateOfBirth, String gender, String sdt, String cccd, String address) {
//        this.id = id;
//        this.name = name;
//        this.dateOfBirth = dateOfBirth;
//        this.gender = gender;
//        this.sdt = sdt;
//        this.cccd = cccd;
//        this.address = address;
//    }
//
//    private String sdt;
//    private String cccd;
//    private String address;
//
//}
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "customer")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer id;

    private String name;

    @Column(name = "date_of_birth")
    private String dateOfBirth; // có thể dùng LocalDate

    private String gender;

    private String sdt;

    private String cccd;

    private String address;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    // Getters, Setters, Constructors
}



