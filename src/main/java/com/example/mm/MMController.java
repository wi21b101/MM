package com.example.mm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MMController {

    MM monitor = new MM();

    @RequestMapping("/set")
    public String set(
        @RequestParam double a){
        return monitor.set(a);
    }

    @RequestMapping("/status")
    public String status(){
        return monitor.status();
    }
}
