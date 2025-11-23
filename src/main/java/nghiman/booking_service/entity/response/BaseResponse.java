package nghiman.booking_service.entity.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author ManNghi
 * @since 05/10/2025 - 14:30
 */
@Data
@SuperBuilder
public class BaseResponse {
   public String code;
   public String message;
}
