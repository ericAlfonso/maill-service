package blehu.health.mailservice.controller;

import blehu.health.mailservice.domain.User;
import blehu.health.mailservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public ResponseEntity<User> getUserById() {
        return ResponseEntity.ok(userService.getUser());
    }
}
