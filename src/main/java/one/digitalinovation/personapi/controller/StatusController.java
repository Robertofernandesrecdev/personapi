package one.digitalinovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping(path = "/api/status")
    public String getBook(){
        return "APi okkk! ";
    }
}
