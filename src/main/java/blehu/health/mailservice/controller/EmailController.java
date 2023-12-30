package blehu.health.mailservice.controller;

import blehu.health.mailservice.service.EmailService;
import blehu.health.mailservice.service.impl.EmailServiceImpl;
import jakarta.validation.constraints.Email;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/send")
    public void sendSimpleEmail(@RequestParam final String email) {
        log.info("account email to send {}", email);
        emailService.sendSimpleEmail(email);
    }
}
