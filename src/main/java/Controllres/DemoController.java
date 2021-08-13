package Controllres;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/apidemo")
    public String getEmployes(){
        return "All emps 123";
    }
}
