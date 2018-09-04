package demo.springmvc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiPengJu
 * @date 2018/9/2
 */
@RestController
@RequestMapping("/demo2")
public class Demo2Controller {
    @GetMapping("/test")
    public String test(){
        return  "demo2 test";
    }
}
