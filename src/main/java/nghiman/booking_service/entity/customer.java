package nghiman.booking_service.entity;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:45
 */
public class customer {
    private int id;
    private String name;
    private String dateOfBirth;
    private String gender;

    public customer(int id, String name, String dateOfBirth, String gender, String sdt, String cccd, String address) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.sdt = sdt;
        this.cccd = cccd;
        this.address = address;
    }

    private String sdt;
    private String cccd;
    private String address;

}


