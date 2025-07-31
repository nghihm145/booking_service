package nghiman.booking_service.entity;




/**
 * @author ManNghi
 * @since 19/07/2025 - 15:44
 */
//public class phong {
//    private int id;
//    private double gia;
//    private String loaiPhong;
//
//    public phong(int id, double gia, String loaiPhong, String trangThai) {
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

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "phong")
public class phong {

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


