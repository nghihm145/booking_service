package nghiman.booking_service.service.impl;

import nghiman.booking_service.entity.Phong;
import nghiman.booking_service.repository.PhongRepository;
import nghiman.booking_service.service.IPhongService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:59
 */
@Service
public class PhongService implements IPhongService {
    public PhongService(PhongRepository repository) {
        this.repository = repository;
    }

    private final PhongRepository repository;

    @Override
    public List<Phong> getAllPhongs() {
        return repository.findAll();
    }
}

