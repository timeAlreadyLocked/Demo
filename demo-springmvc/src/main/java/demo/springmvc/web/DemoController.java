package demo.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LiPengJu
 * @date 2018/9/2
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    public String test() {
        return "demo";
    }
}
