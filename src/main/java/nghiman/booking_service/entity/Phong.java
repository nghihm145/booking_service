package nghiman.booking_service.entity;




/**
 * @author ManNghi
 * @since 19/07/2025 - 15:44
 */
//public class Phong {
//    private int id;
//    private double gia;
//    private String loaiPhong;
//
//    public Phong(int id, double gia, String loaiPhong, String trangThai) {
//        this.id = id;
//        this.gia = gia;
//        this.loaiPhong = loaiPhong;
//        this.trangThai = trangThai;
//    }
//
//    private String trangThai;
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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Phong")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Phong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_phong")
    private Integer id;

    private Double gia;

    @Column(name = "loai_phong")
    private String loaiPhong;

    @Column(name = "trang_thai")
    private String trangThai;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    // Getters, Setters, Constructors
}


