package university.main.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("university")
public class UniversityController {

    @GetMapping(value = "/abc")
    public String getMethodName(@RequestParam String param) {
        return "ALO";
    }

}
