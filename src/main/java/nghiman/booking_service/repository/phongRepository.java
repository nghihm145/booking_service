package nghiman.booking_service.repository;
import java.util.Arrays;
import java.util.List;

import nghiman.booking_service.entity.phong;
import org.springframework.stereotype.Repository;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:45
 */
@Repository

    public class phongRepository {
        public List<phong> findAll() {
            return Arrays.asList(
                    new phong(1, 500000, "Phòng đơn", "Còn trống"),
                    new phong(2, 750000, "Phòng đôi", "Đã đặt")
            );
        }
    }
