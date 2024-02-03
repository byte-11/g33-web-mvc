package uz.pdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home") // localhost:8080/home
public class HomeController {

    //    @GetMapping("/first") //localhost:8080/home/first
    @GetMapping //localhost:8080/home/first
    public String home() {
        return "index";
    }

    @GetMapping("/2") //localhost:8080/home/first
    public ModelAndView home2(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("username", "Alex");
        return modelAndView;
    }

    //    @PostMapping("/second") //localhost:8080/home/first
    @PostMapping //localhost:8080/home/first
    public String homePost() {
        return "homePost";
    }
}
