package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LiPengJu
 * @date 2018/7/29
 */
@SpringBootApplication
@RestController
public class StaticController {
    public static void main(String[] args) {
        SpringApplication.run(StaticController.class, args);
    }

    @GetMapping("login")
    public ResponseEntity login() {
        return ResponseEntity.ok("login");
    }
    @PostMapping("/loginPost")
    public void loginPost(HttpServletRequest request, HttpServletResponse response,String name) throws IOException {
//        AcUser user = userService.getUserByUserNameAndPwd(loginName, loginPwd);
        System.out.println(response);
        if(name == null){
            name = "李鹏举";
        }
        String fileName=name+".text";
        byte[] bytes = name.getBytes("utf-8");
        response.setHeader("content-disposition", "attachment;filename="+fileName);
        response.getOutputStream().write(bytes);
//        return ResponseEntity.ok(user);
//        return ResponseEntity.ok(new AcUser());
    }
}
