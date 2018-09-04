package demo.controller;

import demo.entity.AcUser;
import demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LiPengJu
 * @date 2018/8/7
 */
@RestController
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("login")
    public ResponseEntity<List<AcUser>> login() {
        return ResponseEntity.ok(userService.listUser());
    }
}
