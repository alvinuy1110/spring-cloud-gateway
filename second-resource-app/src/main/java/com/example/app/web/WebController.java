package com.example.app.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@Slf4j
public class WebController {

    @GetMapping("/delay")
    public String fail(@RequestParam(required = false,defaultValue="0") Integer  time) throws InterruptedException {

        log.info("time: {}",time);
        if (time!=null) {
            Thread.sleep(Duration.ofSeconds(time).toMillis());
        }
        return "response from service";
    }
}
