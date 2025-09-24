package ie.atu.lab_1;

import org.springframework.boot.context.properties.bind.Name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {
    @GetMapping("/Hello")
    public String hello(){
        return "hello";
    }
@GetMapping ("/Greet/{name}")
    public String greetName(@PathVariable String name) {
        return "HELLO " + name + "!";
}
}
