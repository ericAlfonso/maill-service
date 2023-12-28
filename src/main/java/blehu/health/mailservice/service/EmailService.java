package blehu.health.mailservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    @Value("${spring.mail.verify.host}")
    private String host;

    @Value("${spring.mail.username}")
    private String sender;

    private final JavaMailSender mailSender;

    public void sendSimpleMimeMessage() {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setSubject("New user account verification");
            simpleMailMessage.setFrom(sender);
            simpleMailMessage.setTo("hugo110795@gmail.com");
            simpleMailMessage.setText("Te amo con todo mi corazon !! enviado desde spring");
            mailSender.send(simpleMailMessage);
        } catch (Exception exception) {
            System.out.println("Exception {}" + exception.getMessage());
        }
    }
}
