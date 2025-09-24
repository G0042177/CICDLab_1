package ie.atu.lab_1;

import org.springframework.boot.context.properties.bind.Name;
import org.springframework.web.bind.annotation.*;

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
@GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name: " + name + ", age: " + age;
}
@GetMapping("/person")
    public Person getPerson(){
        return new Person("sam", 20);
}

}
