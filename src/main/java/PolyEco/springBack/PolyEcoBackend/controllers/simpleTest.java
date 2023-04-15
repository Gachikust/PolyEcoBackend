package PolyEco.springBack.PolyEcoBackend.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class simpleTest {

    @GetMapping("/test")
    public String Test(){
        return "test";
    }
}
