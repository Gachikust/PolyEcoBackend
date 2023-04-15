package PolyEco.springBack.PolyEcoBackend.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AndroidDataTest {
    @GetMapping("/androidTest")
    public String test(){
        return "success";
    }
}
