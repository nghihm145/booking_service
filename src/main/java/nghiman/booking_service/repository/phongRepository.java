package nghiman.booking_service.repository;
import java.util.Arrays;
import java.util.List;

import nghiman.booking_service.entity.phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:45
 */
@Repository
    public interface phongRepository extends JpaRepository<phong, Integer> {
}
