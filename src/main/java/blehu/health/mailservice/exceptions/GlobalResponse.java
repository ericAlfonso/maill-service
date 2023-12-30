package blehu.health.mailservice.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GlobalResponse {

    private String message;
    private String errorCode;
}
