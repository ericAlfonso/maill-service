package blehu.health.mailservice.service.impl;

import blehu.health.mailservice.exceptions.SendEmailException;
import blehu.health.mailservice.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    @Value("${spring.mail.verify.host}")
    private String host;

    @Value("${spring.mail.username}")
    private String sender;

    private final JavaMailSender mailSender;

    @Override
    public void sendSimpleEmail(String toEmail) {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setSubject("New user account verification");
            simpleMailMessage.setFrom(sender);
            simpleMailMessage.setTo(toEmail);
            simpleMailMessage.setText("Sent from spring");
            mailSender.send(simpleMailMessage);
        } catch (MailException mailException) {
            log.error(mailException.getMessage(),  mailException);
            throw new SendEmailException(mailException.getMessage());
        }
    }

    public void sendSimpleMimeMessage() {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setSubject("New user account verification");
            simpleMailMessage.setFrom(sender);
            simpleMailMessage.setTo("vremi909@gmail.com");
            simpleMailMessage.setText("Te amo con todo mi corazon !! enviado desde spring");
            mailSender.send(simpleMailMessage);
        } catch (Exception exception) {
            System.out.println("Exception {}" + exception.getMessage());
        }
    }
}
