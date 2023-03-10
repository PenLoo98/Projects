package kr.hull.shop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model){
        log.info("main 컨트롤러");
        return "main";
    }
}