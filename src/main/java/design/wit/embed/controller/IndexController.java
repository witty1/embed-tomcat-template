package design.wit.embed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/8
 * @Time: 19:32
 * @Description: No Description
 */
@RestController
public class IndexController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
