package blehu.health.mailservice.service;

import blehu.health.mailservice.domain.User;
import blehu.health.mailservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final EmailService emailService;

    public User getUser() {
        System.out.println("entroo");
        emailService.sendSimpleMimeMessage();
        return userRepository.findById(1).get();
    }
}
