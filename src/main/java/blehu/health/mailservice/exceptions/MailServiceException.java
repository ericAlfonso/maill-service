package blehu.health.mailservice.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class MailServiceException extends RuntimeException{
    private String message;
}
