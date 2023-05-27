package university.main.controller;

import org.springframework.web.bind.annotation.RestController;

import university.main.model.University;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("university")
public class UniversityController {

    @PostMapping()
    public String CreateUniversity(University university) {
        return university.getName();
    }
}
