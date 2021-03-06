package org.engcalc.thermocalc;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public Greeting index(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("Greeting request logged from index");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
