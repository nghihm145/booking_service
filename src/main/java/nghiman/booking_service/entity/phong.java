package nghiman.booking_service.entity;




/**
 * @author ManNghi
 * @since 19/07/2025 - 15:44
 */
public class phong {
    private int id;
    private double gia;
    private String loaiPhong;

    public phong(int id, double gia, String loaiPhong, String trangThai) {
        this.id = id;
        this.gia = gia;
        this.loaiPhong = loaiPhong;
        this.trangThai = trangThai;
    }

    private String trangThai;

}

