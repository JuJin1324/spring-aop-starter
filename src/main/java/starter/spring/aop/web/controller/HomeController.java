package starter.spring.aop.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yoo Ju Jin(jujin1324@daum.net)
 * Created Date : 2022/12/02
 */

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
