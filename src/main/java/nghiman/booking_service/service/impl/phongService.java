package nghiman.booking_service.service.impl;
import nghiman.booking_service.entity.phong;
import nghiman.booking_service.repository.phongRepository;
import nghiman.booking_service.service.IPhongService;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author ManNghi
 * @since 19/07/2025 - 15:59
 */
@Service
public class phongService implements IPhongService {
    public phongService(phongRepository repository) {
        this.repository = repository;
    }

    private final phongRepository repository;

    @Override
    public List<phong> getAllPhongs() {
        return repository.findAll();
    }
}

