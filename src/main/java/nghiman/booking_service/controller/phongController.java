package nghiman.booking_service.controller;

import nghiman.booking_service.entity.phong;
import nghiman.booking_service.service.IPhongService;
import nghiman.booking_service.service.impl.phongService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ManNghi
 * @since 19/07/2025 - 15:44
 */
@RestController
@RequestMapping("/phongs")
public class phongController {

    private final IPhongService phongService;
    public phongController(IPhongService phongService) {
        this.phongService = phongService;
    }
    @GetMapping("/get-all-room")
    public List<phong> getAllPhongs() {
        return phongService.getAllPhongs();
    }
}

