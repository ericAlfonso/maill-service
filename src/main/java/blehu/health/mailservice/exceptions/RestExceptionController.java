package blehu.health.mailservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionController {

    @ExceptionHandler(SendEmailException.class)
    public ResponseEntity<GlobalResponse> mailException(SendEmailException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(GlobalResponse.builder()
                        .message(e.getErrorMessage())
                        .errorCode(HttpStatus.CONFLICT.toString()).build());
    }
}
