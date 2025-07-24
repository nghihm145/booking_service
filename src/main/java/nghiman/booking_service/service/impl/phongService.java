package nghiman.booking_service.service.impl;
import nghiman.booking_service.entity.phong;
import nghiman.booking_service.repository.phongRepository;
import nghiman.booking_service.service.IPhongService;

import java.util.List;
/**
 * @author ManNghi
 * @since 19/07/2025 - 15:59
 */
public class phongService implements IPhongService {
    private final phongRepository repository = new phongRepository();

    @Override
    public List<phong> getAllPhongs() {
        return repository.findAll();
    }
}

