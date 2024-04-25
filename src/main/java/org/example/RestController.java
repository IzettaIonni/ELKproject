package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("api/v1")
public class RestController {

    private static final Logger log = LoggerFactory.getLogger(RestController.class);

    @GetMapping("/")
    public String helloWorld() {
        log.info("hello world is called");
        return "Hello World!!!";
    }
    @PostMapping("/")
    public String postSome(@RequestBody String someString) {
        log.info("post: " + someString);
        return "Done!";
    }

}
