package nghiman.booking_service.entity.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

/**
 * @author ManNghi
 * @since 05/10/2025 - 16:52
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class CreateResponse extends BaseResponse{
    private String test;
}
