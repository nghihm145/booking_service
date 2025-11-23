package nghiman.booking_service.repository;

import nghiman.booking_service.entity.Phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:45
 */
@Repository
    public interface PhongRepository extends JpaRepository<Phong, Integer> {
}
