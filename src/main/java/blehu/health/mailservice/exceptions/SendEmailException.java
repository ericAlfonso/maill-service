package blehu.health.mailservice.exceptions;

import lombok.Getter;

@Getter
public class SendEmailException extends MailServiceException {
    private String errorMessage;

    public SendEmailException(String message) {
        super(message);
        this.errorMessage = message;
    }
}
