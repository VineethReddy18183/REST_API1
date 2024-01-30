package com.example.apirouting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apirouting.ApiroutingMyService;

@RestController
class ApiroutingMyController {
    ApiroutingMyService service = new ApiroutingMyService();

    @GetMapping("/")
    public String fun1() {
        return service.func1();
    }

    @GetMapping("/about")
    public String fun2() {
        return service.func2();
    }
}