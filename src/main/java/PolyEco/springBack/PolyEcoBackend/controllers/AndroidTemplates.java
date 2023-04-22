package PolyEco.springBack.PolyEcoBackend.controllers;

import PolyEco.springBack.PolyEcoBackend.model.mainNews;
import PolyEco.springBack.PolyEcoBackend.model.newsData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AndroidTemplates {
    @GetMapping("/android/addnews")
    public String add(Model model){

        model.addAttribute("News", new mainNews());
        return "addnews";
    }

    @PostMapping("/android/addnews")
    public String save(mainNews mainnews) {
        System.out.println(mainnews);

        return "saved";
    }
}
