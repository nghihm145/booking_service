package nghiman.booking_service.entity;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:43
 */
public class booking {
    private int id;

    public booking(int id, int phongId, int customerId, String status, int soLuongNguoi, String dateCheckin, String dateCheckout, String dateBooking) {
        this.id = id;
        this.phongId = phongId;
        this.customerId = customerId;
        this.status = status;
        this.soLuongNguoi = soLuongNguoi;
        this.dateCheckin = dateCheckin;
        this.dateCheckout = dateCheckout;
        this.dateBooking = dateBooking;
    }

    private int phongId;
    private int customerId;
    private String status;
    private int soLuongNguoi;
    private String dateCheckin;
    private String dateCheckout;
    private String dateBooking;

}


